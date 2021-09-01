package gui.polje;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class Polje extends JPanel {
	private JButton dugme;

	/**
	 * Create the panel.
	 */
	public Polje(String vr) {
		setLayout(new BorderLayout(0, 0));
		add(getDugme(), BorderLayout.CENTER);
		dugme.setText(vr);
	}

	private JButton getDugme() {
		if (dugme == null) {
			dugme = new JButton("X");
			dugme.setFont(new Font("Tahoma", Font.BOLD, 70));
			dugme.setForeground(Color.GREEN);
		}
		return dugme;
	}
	
	void pritisnutoDugme(String vrednost,Color boja) {
		
		dugme.setText(vrednost);
		dugme.setForeground(boja);
		
	}
	
}
