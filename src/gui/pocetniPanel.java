package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import utils.Konekcija;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class PocetniPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField Username;
	
	public PocetniPanel() {
		
		setForeground(Color.WHITE);
		setBackground(UIManager.getColor("Panel.background"));
		//setBackground(Color.BLACK);
		setBounds(100, 100, 604, 393);
		setLayout(null);
		
		JLabel lblDobrodosli = new JLabel("RMT IKS-OKS");
		lblDobrodosli.setHorizontalAlignment(SwingConstants.CENTER);
		lblDobrodosli.setForeground(new Color(0, 0, 255));
		lblDobrodosli.setFont(new Font("Verdana", Font.BOLD, 36));
		lblDobrodosli.setBounds(112, 44, 366, 70);
		add(lblDobrodosli);
		
		JLabel lblPrijava = new JLabel("Prijavite se");
		lblPrijava.setBackground(SystemColor.textHighlight);
		lblPrijava.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrijava.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblPrijava.setForeground(SystemColor.textHighlight);
		lblPrijava.setBounds(226, 145, 129, 30);
		add(lblPrijava);
		
		JButton btnPrijava = new JButton("Prijava");
		btnPrijava.setForeground(new Color(218, 165, 32));
		btnPrijava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Username.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Username ne sme biti prazan string");
					return;
				}
				Konekcija.posaljiPrijavu(Username.getText());
			}
		});
		
		
	
		btnPrijava.setBackground(new Color(147, 112, 219));
		btnPrijava.setFont(new Font("Verdana", Font.BOLD, 22));
		btnPrijava.setBounds(133, 283, 323, 37);
		add(btnPrijava);
		
		Username = new JTextField();
		Username.setHorizontalAlignment(SwingConstants.CENTER);
		Username.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
		Username.setBackground(new Color(255, 204, 51));
		Username.setBounds(188, 210, 226, 30);
		add(Username);
		Username.setColumns(10);
	}
}
