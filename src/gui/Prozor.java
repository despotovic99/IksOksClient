package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import utils.ObjIgraca;

import java.awt.CardLayout;
import java.util.LinkedList;

public class Prozor extends JFrame {


	private static final long serialVersionUID = 1L;


	private JPanel contentPane;
	

	public PocetniPanel pocetniPanel;
	public SobaCekanje sobaCekanje;
	public IgraPanel igraPanel;
	
	public String username="";
	public boolean igraAktivna=false;
	

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
	public void prikaziIgraPanel(String protivnik, String mojZnak, String stanjePolja) {
		igraPanel=new IgraPanel(this,protivnik,mojZnak,stanjePolja);
		getContentPane().removeAll();
		getContentPane().add(igraPanel);
		getContentPane().revalidate();
		getContentPane().repaint();
		
	}
}
