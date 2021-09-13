package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.MatteBorder;


import utils.Konekcija;

import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SobaCekanje extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblIgrac;
	private JLabel lblUsername;
	private JLabel lblNewLabel;
	private JLabel lblStatus;
	private JButton btnNapraviIgru;
	private JProgressBar progressBar;
	private JButton btnTraziIgru;
	private JButton btnOtkaziNapravi;
	public Prozor prozor;
	
	public SobaCekanje(Prozor prozor) {
		setLayout(null);
		add(getLblIgrac());
		add(getLblUsername());
		add(getLblNewLabel());
		add(getLblStatus());
		add(getBtnNapraviIgru());
		add(getProgressBar());
		add(getBtnTraziIgru());
		add(getBtnOtkaziNapravi());
		this.prozor=prozor;
		Konekcija.traziUsernameIStatus();
	}
	private JLabel getLblIgrac() {
		if (lblIgrac == null) {
			lblIgrac = new JLabel("Igra\u010D");
			lblIgrac.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblIgrac.setHorizontalAlignment(SwingConstants.CENTER);
			lblIgrac.setBorder(null);
			lblIgrac.setBounds(116, 51, 115, 47);
		}
		return lblIgrac;
	}
	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("username");
			lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
			lblUsername.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
			lblUsername.setBounds(256, 49, 162, 52);
		}
		return lblUsername;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Status");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(116, 132, 115, 52);
		}
		return lblNewLabel;
	}
	private JLabel getLblStatus() {
		if (lblStatus == null) {
			lblStatus = new JLabel("status");
			lblStatus.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
			lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
			lblStatus.setBounds(256, 132, 162, 52);
		}
		return lblStatus;
	}
	private JButton getBtnNapraviIgru() {
		if (btnNapraviIgru == null) {
			btnNapraviIgru = new JButton("Napravi igru");
			btnNapraviIgru.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Konekcija.napraviIgru();
					progressBar.setIndeterminate(true);
					progressBar.setVisible(true);
					btnTraziIgru.setEnabled(false);
					btnOtkaziNapravi.setEnabled(true);
					btnOtkaziNapravi.setVisible(true);					
				}
			});
			btnNapraviIgru.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNapraviIgru.setForeground(new Color(0, 128, 0));
			btnNapraviIgru.setBackground(new Color(127, 255, 0));
			btnNapraviIgru.setBorder(new LineBorder(Color.GREEN, 2, true));
			btnNapraviIgru.setBounds(162, 250, 135, 65);
		}
		return btnNapraviIgru;
	}
	private JProgressBar getProgressBar() {
		if (progressBar == null) {
			progressBar = new JProgressBar();
			progressBar.setVisible(false);
			progressBar.setBounds(195, 358, 210, 15);
			
		}
		return progressBar;
	}
	public void postaviUsernameIStatus(String username, String status) {
		lblUsername.setText(username);
		lblStatus.setText(status);
		//System.out.println(username+","+status);
		
	}
	private JButton getBtnTraziIgru() {
		if (btnTraziIgru == null) {
			btnTraziIgru = new JButton("Tra\u017Ei igru");
			btnTraziIgru.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					Konekcija.nadjiIgru();
				}
			});
			btnTraziIgru.setForeground(new Color(0, 128, 0));
			btnTraziIgru.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnTraziIgru.setBorder(new LineBorder(Color.GREEN, 2, true));
			btnTraziIgru.setBackground(new Color(127, 255, 0));
			btnTraziIgru.setBounds(346, 250, 135, 65);
		}
		return btnTraziIgru;
	}
	private JButton getBtnOtkaziNapravi() {
		if (btnOtkaziNapravi == null) {
			btnOtkaziNapravi = new JButton("X");
			btnOtkaziNapravi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					progressBar.setIndeterminate(false);
					progressBar.setVisible(false);
					btnTraziIgru.setEnabled(true);
					btnOtkaziNapravi.setEnabled(false);
					btnOtkaziNapravi.setVisible(false);
					Konekcija.promeniStatus("online");
					
				}
			});
			btnOtkaziNapravi.setEnabled(false);
			btnOtkaziNapravi.setVisible(false);
			btnOtkaziNapravi.setForeground(Color.RED);
			btnOtkaziNapravi.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btnOtkaziNapravi.setBounds(496, 53, 50, 50);
		}
		return btnOtkaziNapravi;
	}
}
