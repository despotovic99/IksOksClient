package gui.polje;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class Polje extends JButton {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public Polje(String vr) {
		setFont(new Font("Tahoma", Font.BOLD, 70));
		setForeground(Color.GREEN);
	}

	
	public void pritisnutoDugme(String vrednost,Color boja) {
		
		setText(vrednost);
		setForeground(boja);
		
	}
	
	
	
}
