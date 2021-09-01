package gui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Rectangle;
import java.security.PublicKey;

import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import gui.polje.Polje;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class igraPanel extends JPanel {
	private JPanel panelPolja;
	private JPanel panelRezultat;
	private JPanel panelIgrac1;
	private JLabel lblNazivIgraca;
	private JLabel lblRezultat;
	private JPanel panelIgrac2;
	private JLabel lblNazivIgraca2;
	private JLabel lblRezultat2;
	
	Polje polje1 = new Polje("1");
	Polje polje2 = new Polje("2");
	Polje polje3 = new Polje("3");
	Polje polje4 = new Polje("4");
	Polje polje5 = new Polje("5");
	Polje polje6 = new Polje("6");
	Polje polje7 = new Polje("7");
	Polje polje8 = new Polje("8");
	Polje polje9 = new Polje("9");
	
	
	public igraPanel() {
		setLayout(null);
		add(getPanelPolja());
		add(getPanelRezultat());
		polje1.setLocation(10, 10);
		polje1.setSize(120, 120);
		panelPolja.add(polje1);
		polje2.setSize(120, 120);
		polje2.setLocation(140, 10);
		panelPolja.add(polje2);
		polje3.setSize(120, 120);
		polje3.setLocation(270, 10);
		panelPolja.add(polje3);
		polje4.setSize(120, 120);
		polje4.setLocation(10, 140);
		panelPolja.add(polje4);
		polje5.setSize(120, 120);
		polje5.setLocation(140, 140);
		panelPolja.add(polje5);
		polje6.setSize(120, 120);
		polje6.setLocation(270, 140);
		panelPolja.add(polje6);
		polje7.setSize(120, 120);
		polje7.setLocation(10, 270);
		panelPolja.add(polje7);
		polje8.setSize(120, 120);
		polje8.setLocation(140, 270);
		panelPolja.add(polje8);
		polje9.setSize(120, 120);
		polje9.setLocation(270, 270);
		panelPolja.add(polje9);
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
		}
		return panelRezultat;
	}
	private JPanel getPanelIgrac1() {
		if (panelIgrac1 == null) {
			panelIgrac1 = new JPanel();
			panelIgrac1.setBounds(10, 10, 180, 185);
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
			lblNazivIgraca.setBounds(10, 23, 160, 52);
		}
		return lblNazivIgraca;
	}
	private JLabel getLblRezultat() {
		if (lblRezultat == null) {
			lblRezultat = new JLabel("1");
			lblRezultat.setHorizontalAlignment(SwingConstants.CENTER);
			lblRezultat.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblRezultat.setBounds(10, 102, 160, 52);
		}
		return lblRezultat;
	}
	private JPanel getPanelIgrac2() {
		if (panelIgrac2 == null) {
			panelIgrac2 = new JPanel();
			panelIgrac2.setLayout(null);
			panelIgrac2.setBounds(10, 205, 180, 185);
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
			lblNazivIgraca2.setBounds(10, 23, 160, 52);
		}
		return lblNazivIgraca2;
	}
	private JLabel getLblRezultat2() {
		if (lblRezultat2 == null) {
			lblRezultat2 = new JLabel("1");
			lblRezultat2.setHorizontalAlignment(SwingConstants.CENTER);
			lblRezultat2.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblRezultat2.setBounds(10, 102, 160, 52);
		}
		return lblRezultat2;
	}
	
	// metode 
	
	 private void azurirajVrednosti(JLabel polje,String tekst) {
		polje.setText(tekst);		 
	}
}
