package gui.polje;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class Polje extends JButton {
	
	
	public Polje(String vr) {
		setFont(new Font("Tahoma", Font.BOLD, 70));
		setForeground(Color.GREEN);
	}

	
	public void pritisnutoDugme(String vrednost,Color boja) {
		
		setText(vrednost);
		setForeground(boja);
		
	}
	
	
	
}
