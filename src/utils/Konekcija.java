package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.LinkedList;

 

public class Konekcija {
  //  private final String ip="34.65.104.222";
    private final String ip="localhost";
    private final int port=3000;
    Socket soket;
    public static BufferedReader serverInput;
    static public PrintStream serverOutput;
    
    ///
    DatagramSocket hostGameSocket;
   /* Socket gameSocket;
    public static BufferedReader serverGameInput;
    static public PrintStream serverGameOutput;*/
    
    public void poveziSe() {
        try {
            soket=new Socket(ip, port);
            serverInput=new BufferedReader(new InputStreamReader(soket.getInputStream()));
            serverOutput=new PrintStream(soket.getOutputStream());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Server je pao.");
        }
        
    }
    
    public String getIp() {
        return ip;
    }
    public int getPort() {
        return port;
    }
 
    // brisi
    public String pozdrav() {
    	try {
			return serverInput.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
    
    public LinkedList<ObjIgraca> getSviKorisnici(){
    	
    	LinkedList<ObjIgraca> list= new LinkedList<>();
    	String zahtev = "{\"zaglavlje\":\""+"svi"+"\",\"data\":\""+""+"\",\"kraj\":true}";
    	try {
			serverOutput.write(zahtev.getBytes());
			String odg="";
			
			while(true) {
				odg= serverInput.readLine();
				if(odg!=null && odg.toLowerCase().startsWith("krajsvih")) {
					break;
				}
				System.out.println(odg);
				String[] k=odg.split("-");
				list.add(new ObjIgraca(k[0], k[1], k[2]));
			}
			
			return list;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return null;
    }
    
   

    
    

 


}
