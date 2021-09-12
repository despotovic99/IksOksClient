package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import partija.Partija;
import utils.ObjIgraca;

import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;

public class Prozor extends JFrame {

	private JPanel contentPane;
	

	public PocetniPanel pocetniPanel;
	public SobaCekanje sobaCekanje;
	public IgraPanel igraPanel;
	
	public String username="";
	public boolean igraAktivna=false;
	private Partija partija;
	

	public Prozor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		pocetniPanel=new PocetniPanel();
		contentPane.add(pocetniPanel);
	}
	
	public void napraviPartiju() {
		partija= new Partija();
	}
	
	public void prikaziSobuZaCekanje() {
		sobaCekanje=new SobaCekanje(this);
		getContentPane().removeAll();
		getContentPane().add(sobaCekanje);
		getContentPane().revalidate();
		getContentPane().repaint();
		
	}
	
	public void prikaziNadjiPanel(LinkedList<ObjIgraca> list) {
		getContentPane().removeAll();
		getContentPane().add(new NadjiIgru(this,list));
		getContentPane().revalidate();
		getContentPane().repaint();
	}
	public void prikaziIgraPanel(String protivnik, String mojZnak) {
		igraPanel=new IgraPanel(this,protivnik,mojZnak);
		getContentPane().removeAll();
		getContentPane().add(igraPanel);
		getContentPane().revalidate();
		getContentPane().repaint();
		
	}
}
