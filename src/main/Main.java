package main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import gui.Prozor;
import gui.TicTacToe;
import utils.Konekcija;

public class Main {

	static Konekcija konek;
	
	public static void main(String[] args) {
		
		try {
			
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		
		new Prozor().setVisible(true);
		
	/*	TicTacToe window = new TicTacToe();	      
	     window.frame.setVisible(true);*/
		
		
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
			| UnsupportedLookAndFeelException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
}
	
}
