package main;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import gui.Prozor;
import utils.Konekcija;

public class Main {

	static Konekcija konekcija;	
	static Prozor prozor;
	
	public static void main(String[] args) {
		
		konekcija= new Konekcija();
		
		try {
			
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		if(!konekcija.poveziSe()) {
			JOptionPane.showMessageDialog(null, "Niste povezani sa serverom", "Greska prilikom povezivanja", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		new Thread(konekcija).start();
		prozor = new Prozor();
		prozor.setVisible(true);
		konekcija.postaviProzor(prozor);
		
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
			| UnsupportedLookAndFeelException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
}
	
}
