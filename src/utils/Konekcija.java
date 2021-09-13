package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import gui.Prozor;

 

public class Konekcija implements Runnable{
   // private final String ip="34.65.104.222";
    private final String ip="localhost";
    private final int port=3000;
    private Socket soket;
    public static BufferedReader serverInput;
    static public PrintStream serverOutput;
    
    Prozor prozor;
    
    public boolean poveziSe() {
        try {
            soket=new Socket(ip, port);
            serverInput=new BufferedReader(new InputStreamReader(soket.getInputStream()));
            serverOutput=new PrintStream(soket.getOutputStream());
            return true;
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Server je pao.");
        }
        return false;
        
    }
    
    public void postaviProzor(Prozor prozor) {
    	this.prozor=prozor;
    }
 
	public void run() {
		
		
		while (true) {			
			try {
				String[] odgovor = serverInput.readLine().split("<>");
				//format paketa
				//zaglavlje<>data<>kodPotvrde
				switch (odgovor[0]) {
				case "prijava":
					System.out.println(odgovor[0]+","+odgovor[1]+","+odgovor[2]+","+odgovor[3]);
					if(odgovor[3].equalsIgnoreCase("potvrdno")) {
						prozor.prikaziSobuZaCekanje();
						
					}else {
						JOptionPane.showMessageDialog(null, odgovor[1], "Greska", JOptionPane.ERROR_MESSAGE);
					}					
					break;
				
				case "usernameIstatus":
					//postavljanje username
					prozor.username=odgovor[1];
					prozor.sobaCekanje.postaviUsernameIStatus(odgovor[1],odgovor[2]);
					break;
					
				case "nadjiIgru":
					LinkedList<ObjIgraca> list= new LinkedList<>();
					String[] igraci=odgovor[1].split(">>");
					for (String igrac : igraci) {
						if(igrac.equals("kraj")) {
							break;
						}
						String[] k=igrac.split("-");
						list.add(new ObjIgraca(k[0], k[1]));
					}
					prozor.prikaziNadjiPanel(list);
						System.out.println(odgovor[1]);
					break;
				
				case "zahtevZaIgru":
					if(!prozor.igraAktivna
							&& JOptionPane.showConfirmDialog
							(prozor, "Igrac "+odgovor[1]+" zeli da igra sa Vama", "Zahtev za igru", JOptionPane.YES_NO_OPTION)==0) {
						prozor.igraAktivna=true;
						System.out.println("Pocinje igra");
						pokreniIgru(odgovor[1]);
					//	prozor.napraviPartiju();
						
					}
					break;
				case "pokreniIgru":
					// username i znak 
					
					prozor.prikaziIgraPanel(odgovor[1],odgovor[2],odgovor[3]);
					break;
				case "potez":
					
					prozor.igraPanel.protivnikPotez(odgovor[1]);
				
					break;
					
				case "rezultat":
					prozor.igraPanel.azurirajMojRezultat(odgovor[1]);
					break;
					
				case "revans":
					
					String potvrda="negativno";
					if(JOptionPane.showConfirmDialog(prozor, "Zelite li da igrate ponovo sa igracem "+odgovor[1]+"?", "Ponovna igra", JOptionPane.YES_NO_OPTION)==0) {
						prozor.igraPanel.osveziPanel();
						potvrda="pozitivno";
					}
					posaljiOdgovorRevans(odgovor[1],potvrda);
					
					break;
				
				case "revansOdgovor":
					if(odgovor[2].equalsIgnoreCase("pozitivno")) {
						prozor.igraPanel.osveziPanel();
					}else {
						prozor.prikaziSobuZaCekanje();
					}
					break;
				
				case "predaja":
					JOptionPane.showMessageDialog(prozor, odgovor[1]);
					promeniStatus("online");
					prozor.igraAktivna=false;
					prozor.prikaziSobuZaCekanje();
					break;
				case "serverOdjava":
					JOptionPane.showMessageDialog(null, odgovor[1], "Greska", JOptionPane.ERROR_MESSAGE);
					System.exit(1);
					break;
				default:
					//System.out.println("proveraaaa");
					break;
				}
				
				
				
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}
	
	

	public static void posaljiPrijavu(String username) {
		
		String zahtev = "{\"zaglavlje\":\""+"prijava"+"\",\"data\":\""+username+"\"}";
		
		try {
			serverOutput.write(zahtev.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public static void traziUsernameIStatus() {
	
		String zahtev = "{\"zaglavlje\":\""+"usernameIstatus"+"\",\"data\":\"\"}";
		
		try {
			serverOutput.write(zahtev.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void napraviIgru() {
		
		String zahtev = "{\"zaglavlje\":\""+"napraviIgru"+"\",\"data\":\"\"}";
		
		try {
			serverOutput.write(zahtev.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void promeniStatus(String status) {
		String zahtev = "{\"zaglavlje\":\""+"status"+"\",\"data\":\""+status+"\"}";
		
		try {
			serverOutput.write(zahtev.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void nadjiIgru() {
		
		String zahtev = "{\"zaglavlje\":\""+"nadjiIgru"+"\",\"data\":\"\"}";
		
		try {
			serverOutput.write(zahtev.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void posaljiZahtevZaIgru(String username,String igrac) {

		String zahtev = "{\"zaglavlje\":\""+"zahtevZaIgru"+"\",\"host\":\""+username+"\",\"igrac\":\""+igrac+"\"}";
		
		try {
			serverOutput.write(zahtev.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    
	public static void pokreniIgru(String username) {

		String zahtev = "{\"zaglavlje\":\""+"pokreniIgru"+"\",\"igrac\":\""+username+"\"}";
		
		try {
			serverOutput.write(zahtev.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void potez(String protivnik, String i) {
		
		String zahtev = "{\"zaglavlje\":\""+"potez"+"\",\"igrac\":\""+protivnik+"\",\"polje\":\""+i+"\"}";
		
		try {
			serverOutput.write(zahtev.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void posaljiRezultat(String protivnik, int rez) {
		// TODO Auto-generated method stub
		String zahtev = "{\"zaglavlje\":\""+"rezultat"+"\",\"igrac\":\""+protivnik+"\",\"rezultat\":\""+rez+"\"}";
		
		try {
			serverOutput.write(zahtev.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void posaljiZahtevZaRevans(String protivnik) {
		
		String zahtev = "{\"zaglavlje\":\""+"revans"+"\",\"igrac\":\""+protivnik+"\"}";
		
		try {
			serverOutput.write(zahtev.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void posaljiOdgovorRevans(String protivnik,String potvrda) {
		
		String zahtev = "{\"zaglavlje\":\""+"revansOdgovor"+"\",\"igrac\":\""+protivnik+"\",\"potvrda\":\""+potvrda+"\"}";
		
		try {
			serverOutput.write(zahtev.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void posaljiPredaju(String protivnik) {
		
		String zahtev = "{\"zaglavlje\":\""+"predaja"+"\",\"igrac\":\""+protivnik+"\"}";
		
		try {
			serverOutput.write(zahtev.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    
    

 


}
