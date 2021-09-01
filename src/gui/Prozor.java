package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prozor extends JFrame {

	private JPanel contentPane;
	private pocetniPanel pocetniPanel;
	private JMenuBar menuBar;
	private JMenu mnIgra;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	

	//
	
	
	public Prozor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 404);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		pocetniPanel=new pocetniPanel();
		contentPane.add(pocetniPanel);
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnIgra());
		}
		return menuBar;
	}
	private JMenu getMnIgra() {
		if (mnIgra == null) {
			mnIgra = new JMenu("Igra");
			mnIgra.add(getMntmNewMenuItem_1());
			mnIgra.add(getMntmNewMenuItem());
		}
		return mnIgra;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("prikazi igra panel");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getContentPane().removeAll();
					getContentPane().add(new igraPanel());
					getContentPane().revalidate();
					getContentPane().repaint();
				}
			});
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("prikazi pocetni panel");
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getContentPane().removeAll();
					getContentPane().add(new pocetniPanel());
					getContentPane().revalidate();
					getContentPane().repaint();
				}
			});
		}
		return mntmNewMenuItem_1;
	}
}
