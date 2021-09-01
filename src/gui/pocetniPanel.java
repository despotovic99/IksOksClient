package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class pocetniPanel extends JPanel {

	private JTextField Username;
	
	public pocetniPanel() {
		
		setForeground(Color.WHITE);
		setBackground(Color.BLACK);
		setBackground(Color.BLACK);
		setBounds(100, 100, 682, 335);
		setLayout(null);
		
		JLabel lblDobrodosli = new JLabel("Dobrodo\u0161li u IKS-OKS");
		lblDobrodosli.setHorizontalAlignment(SwingConstants.CENTER);
		lblDobrodosli.setForeground(Color.ORANGE);
		lblDobrodosli.setFont(new Font("Verdana", Font.BOLD, 36));
		lblDobrodosli.setBounds(68, -22, 533, 132);
		add(lblDobrodosli);
		
		JLabel lblPrijava = new JLabel("Prijavite se");
		lblPrijava.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrijava.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblPrijava.setForeground(Color.WHITE);
		lblPrijava.setBounds(273, 96, 129, 30);
		add(lblPrijava);
		
		JButton btnPrijava = new JButton(">>>> PRIJAVA <<<<");
		btnPrijava.addMouseListener(new MouseAdapter() {
			public void Prijava(MouseEvent e) {
				String odg="";
				String zahtev = "{\"zaglavlje\":\""+"svi"+"\",\"data\":\""+""+"\",\"kraj\":true}";
				//serverOutput.write(zahtev.getBytes()); //msm da ce hteti kad se importuje konekcija
			//	odg= serverInput.readLine();
				
				while(true) {
			//		odg= serverInput.readLine(); 
					if(odg!=null && odg.equalsIgnoreCase(Username.getText())) {
					break;
					}
					System.out.println("Dobrodošli"); //treba da prebaci na TicTacToe
				}
			}
		});
		
	
		btnPrijava.setBackground(Color.ORANGE);
		btnPrijava.setFont(new Font("Verdana", Font.BOLD, 22));
		btnPrijava.setBounds(191, 224, 323, 37);
		add(btnPrijava);
		
		Username = new JTextField();
		Username.setHorizontalAlignment(SwingConstants.CENTER);
		Username.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
		Username.setBackground(new Color(255, 204, 51));
		Username.setBounds(250, 154, 165, 30);
		add(Username);
		Username.setColumns(10);
	}

}
