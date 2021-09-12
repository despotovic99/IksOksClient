package gui;

import javax.swing.JPanel;

import utils.ObjIgraca;

import java.awt.BorderLayout;
import java.util.LinkedList;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NadjiIgru extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JButton btnVratiSeSobaCekanje;
	TabelaIgraca tabela;
	LinkedList<ObjIgraca> data;
	
	private Prozor prozor;
	
	public NadjiIgru(Prozor prozor,LinkedList<ObjIgraca> data) {
		this.data=data;
		this.prozor=prozor;
		setLayout(null);
		add(getPanel());
		add(getBtnVratiSeSobaCekanje());
		
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(25, 41, 450, 342);
			panel.setLayout(new BorderLayout(0, 0));
			tabela = new TabelaIgraca((int) (panel.getWidth()*0.9),(int)(panel.getHeight()*0.9),data,prozor);
	        panel.add(tabela);
		}
		return panel;
	}
	private JButton getBtnVratiSeSobaCekanje() {
		if (btnVratiSeSobaCekanje == null) {
			btnVratiSeSobaCekanje = new JButton("Vrati se");
			btnVratiSeSobaCekanje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					prozor.prikaziSobuZaCekanje();
				}
			});
			btnVratiSeSobaCekanje.setBounds(26, 10, 85, 21);
		}
		return btnVratiSeSobaCekanje;
	}
}
