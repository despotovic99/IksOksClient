package gui.polje;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class Polje extends JButton {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean aktiviran=false;
	
	
	
	public boolean isAktiviran() {
		return aktiviran;
	}


	public Polje(String vr) {
		setFont(new Font("Tahoma", Font.BOLD, 70));
		setForeground(Color.GREEN);
	}

	
	public boolean pritisnutoDugme(String vrednost,Color boja) {
		if(isAktiviran()) {
			return false;
		}
		aktiviran=true;
		setText(vrednost);
		setForeground(boja);
		return true;
	}
	
	public void osveziPolje() {
		aktiviran=false;
		setText("");
	}
	
	
	
}
