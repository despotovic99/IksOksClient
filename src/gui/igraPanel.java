package gui;

import javax.swing.JPanel;

import javax.swing.border.LineBorder;
import java.awt.Color;

import gui.polje.Polje;
import utils.Konekcija;


import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IgraPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panelPolja;
	private JPanel panelRezultat;
	private JPanel panelIgrac1;
	private JLabel lblNazivIgraca;
	private JLabel lblRezultat;
	private JPanel panelIgrac2;
	private JLabel lblNazivIgraca2;
	private JLabel lblRezultat2;
	
	Polje polje1 = new Polje("");
	Polje polje2 = new Polje("");
	Polje polje3 = new Polje("");
	Polje polje4 = new Polje("");
	Polje polje5 = new Polje("");
	Polje polje6 = new Polje("");
	Polje polje7 = new Polje("");
	Polje polje8 = new Polje("");
	Polje polje9 = new Polje("");
	private final JButton btnPredaj = new JButton("Predaj");
	
	public Prozor prozor;
	private String protivnik;
	private String mojZnak;
	
	public IgraPanel(Prozor prozor,String protivnik,String mojZnak, String stanjePolja) {
		this.prozor=prozor;
		this.protivnik=protivnik;
		this.mojZnak=mojZnak;
		
		setLayout(null);
		add(getPanelPolja());
		add(getPanelRezultat());
		polje1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//onOffPolja(false);
				odigranPotez(polje1,"1");
				
			}
		});
		polje1.setLocation(10, 10);
		polje1.setSize(120, 120);
		panelPolja.add(polje1);
		polje2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				odigranPotez(polje2,"2");
			}
		});
		polje2.setSize(120, 120);
		polje2.setLocation(140, 10);
		panelPolja.add(polje2);
		polje3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				odigranPotez(polje3,"3");
			}
		});
		polje3.setSize(120, 120);
		polje3.setLocation(270, 10);
		panelPolja.add(polje3);
		polje4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				odigranPotez(polje4,"4");
			}
		});
		polje4.setSize(120, 120);
		polje4.setLocation(10, 140);
		panelPolja.add(polje4);
		polje5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				odigranPotez(polje5,"5");
			}
		});
		polje5.setSize(120, 120);
		polje5.setLocation(140, 140);
		panelPolja.add(polje5);
		polje6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				odigranPotez(polje6,"6");
			}
		});
		polje6.setSize(120, 120);
		polje6.setLocation(270, 140);
		panelPolja.add(polje6);
		polje7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				odigranPotez(polje7,"7");
			}
		});
		polje7.setSize(120, 120);
		polje7.setLocation(10, 270);
		panelPolja.add(polje7);
		polje8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				odigranPotez(polje8,"8");
			}
		});
		polje8.setSize(120, 120);
		polje8.setLocation(140, 270);
		panelPolja.add(polje8);
		polje9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				odigranPotez(polje9,"9");
			}
		});
		polje9.setSize(120, 120);
		polje9.setLocation(270, 270);
		panelPolja.add(polje9);
		
		
		
		lblNazivIgraca.setText(prozor.username);
		lblNazivIgraca2.setText(protivnik);
		if(stanjePolja.equalsIgnoreCase("false")) {
			onOffPolja(false);
		}
	}
	
	private void odigranPotez(Polje polje, String vrednost) {
		polje.pritisnutoDugme(mojZnak, Color.GREEN);
		onOffPolja(false);
		Konekcija.potez(protivnik,vrednost);
	}
	
	private JPanel getPanelPolja() {
		if (panelPolja == null) {
			panelPolja = new JPanel();
			panelPolja.setBorder(new LineBorder(Color.BLUE));
			panelPolja.setBounds(25, 15, 400, 400);
			panelPolja.setLayout(null);
		}
		return panelPolja;
	}
	private JPanel getPanelRezultat() {
		if (panelRezultat == null) {
			panelRezultat = new JPanel();
			panelRezultat.setBounds(435, 15, 200, 400);
			panelRezultat.setLayout(null);
			panelRezultat.add(getPanelIgrac1());
			panelRezultat.add(getPanelIgrac2());
			btnPredaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					onOffPolja(true);
				}
			});
			btnPredaj.setBackground(new Color(255, 0, 0));
			btnPredaj.setForeground(new Color(255, 0, 0));
			btnPredaj.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnPredaj.setBounds(30, 310, 140, 45);
			
			panelRezultat.add(btnPredaj);
		}
		return panelRezultat;
	}
	private JPanel getPanelIgrac1() {
		if (panelIgrac1 == null) {
			panelIgrac1 = new JPanel();
			panelIgrac1.setBounds(10, 10, 180, 134);
			panelIgrac1.setLayout(null);
			panelIgrac1.add(getLblNazivIgraca());
			panelIgrac1.add(getLblRezultat());
			
			
			
			
		}
		return panelIgrac1;
	}
	private JLabel getLblNazivIgraca() {
		if (lblNazivIgraca == null) {
			lblNazivIgraca = new JLabel("Igrac");
			lblNazivIgraca.setHorizontalAlignment(SwingConstants.CENTER);
			lblNazivIgraca.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblNazivIgraca.setBounds(10, 23, 160, 43);
		}
		return lblNazivIgraca;
	}
	private JLabel getLblRezultat() {
		if (lblRezultat == null) {
			lblRezultat = new JLabel("1");
			lblRezultat.setHorizontalAlignment(SwingConstants.CENTER);
			lblRezultat.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblRezultat.setBounds(10, 80, 160, 37);
		}
		return lblRezultat;
	}
	private JPanel getPanelIgrac2() {
		if (panelIgrac2 == null) {
			panelIgrac2 = new JPanel();
			panelIgrac2.setLayout(null);
			panelIgrac2.setBounds(10, 154, 180, 134);
			panelIgrac2.add(getLblNazivIgraca2());
			panelIgrac2.add(getLblRezultat2());
		}
		return panelIgrac2;
	}
	private JLabel getLblNazivIgraca2() {
		if (lblNazivIgraca2 == null) {
			lblNazivIgraca2 = new JLabel("Igrac");
			lblNazivIgraca2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNazivIgraca2.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblNazivIgraca2.setBounds(10, 10, 160, 45);
		}
		return lblNazivIgraca2;
	}
	private JLabel getLblRezultat2() {
		if (lblRezultat2 == null) {
			lblRezultat2 = new JLabel("1");
			lblRezultat2.setHorizontalAlignment(SwingConstants.CENTER);
			lblRezultat2.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblRezultat2.setBounds(10, 74, 160, 37);
		}
		return lblRezultat2;
	}
	
	// metode 
	
/*	 private void azurirajVrednosti(JLabel polje,String tekst) {
		polje.setText(tekst);		 
	}*/
	 
	 private void azurirajPolja(Polje polje,String vrednost,Color boja) {
		 polje.pritisnutoDugme(vrednost, boja);
	 }
	 
	 private void onOffPolja(boolean vrednost) {
		 polje1.setEnabled(vrednost);
		 polje2.setEnabled(vrednost);
		 polje3.setEnabled(vrednost);
		 polje4.setEnabled(vrednost);
		 polje5.setEnabled(vrednost);
		 polje6.setEnabled(vrednost);
		 polje7.setEnabled(vrednost);
		 polje8.setEnabled(vrednost);
		 polje9.setEnabled(vrednost);
		 
		 
		 
	 }

	public void protivnikPotez(String brPolja) {
		
		String znak="O";
		if(mojZnak.equalsIgnoreCase("o")) {
			znak="X";
		}
		switch (brPolja) {
		case "1":
			azurirajPolja(polje1, znak, Color.RED);
			break;
		case "2":
			azurirajPolja(polje2, znak, Color.RED);
			break;	
		case "3":
			azurirajPolja(polje3, znak, Color.RED);
			break;
		case "4":
			azurirajPolja(polje4, znak, Color.RED);;
			break;
		case "5":
			azurirajPolja(polje5, znak, Color.RED);
			break;
		case "6":
			azurirajPolja(polje6, znak, Color.RED);
			break;	
		case "7":
			azurirajPolja(polje7, znak, Color.RED);
			break;	
		case "8":
			azurirajPolja(polje8, znak, Color.RED);
			break;	
		case "9":
			azurirajPolja(polje9, znak, Color.RED);
			break;	
		default:
			break;
		}
		onOffPolja(true);
		
		
	}
	 
}
