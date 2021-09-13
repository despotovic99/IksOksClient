package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import utils.Konekcija;
import utils.ObjIgraca;

import java.awt.CardLayout;
import java.util.LinkedList;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class Prozor extends JFrame {


	private static final long serialVersionUID = 1L;


	private JPanel contentPane;
	

	public PocetniPanel pocetniPanel;
	public SobaCekanje sobaCekanje;
	public IgraPanel igraPanel;
	
	public String username="";
	public boolean igraAktivna=false;
	

	public Prozor() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Dokumenti\\eclipse-workspace\\TicTacToe\\tic-tac-toe.png"));
		setTitle("Iks Oks");
		setBounds(new Rectangle(0, 0, 650, 440));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		pocetniPanel=new PocetniPanel();
		contentPane.add(pocetniPanel);
		
		addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		        if (JOptionPane.showConfirmDialog(null, 
		            "Jeste li sigurni da zelite da izaðete?", "Izlazak iz igre?", 
		            JOptionPane.YES_NO_OPTION,
		            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
		        	if(igraAktivna && !igraPanel.getProtivnik().equalsIgnoreCase("")) {
		        		Konekcija.posaljiNapustanje(igraPanel.getProtivnik());
		        	}
		            System.exit(0);
		        }
		    }
		});
		
		
	}
	
	
	
	
	public void prikaziSobuZaCekanje() {
		igraAktivna=false;
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
