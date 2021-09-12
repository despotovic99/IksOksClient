package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import utils.Konekcija;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PocetniPanel extends JPanel {

	private JTextField Username;
	
	public PocetniPanel() {
		
		setForeground(Color.WHITE);
		setBackground(Color.BLACK);
		setBackground(Color.BLACK);
		setBounds(100, 100, 682, 335);
		setLayout(null);
		//Dobrodo\u0161li u IKS-OKS
		JLabel lblDobrodosli = new JLabel("");
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
		
		JButton btnPrijava = new JButton("Prijava");
		btnPrijava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Username.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Username ne sme biti prazan string");
					return;
				}
				Konekcija.posaljiPrijavu(Username.getText());
			}
		});
		
		
	
		btnPrijava.setBackground(Color.ORANGE);
		btnPrijava.setFont(new Font("Verdana", Font.BOLD, 22));
		btnPrijava.setBounds(174, 220, 323, 37);
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
