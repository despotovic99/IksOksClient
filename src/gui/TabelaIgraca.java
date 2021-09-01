package gui;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import utils.ObjIgraca;

public class TabelaIgraca extends JPanel {

	LinkedList<ObjIgraca> igraci = null;
	NewGame ng;

	public TabelaIgraca(int sirina, int visina, LinkedList<ObjIgraca> data,NewGame ng) {
		this.ng=ng;

		String[] zaglavlje = { "Username", "Status" };
		String[][] data1 = new String[data.size()][];
		int i = 0;
		for (ObjIgraca o : data) {
			data1[i++] = new String[] { o.getUsername(), o.getStatus() };
		}
		igraci = data;

		DefaultTableModel df = new DefaultTableModel(data1, zaglavlje) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

		};
		JTable table = new JTable(df);

		table.setPreferredScrollableViewportSize(new Dimension(sirina, visina));
		table.setFillsViewportHeight(true);
		table.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				ObjIgraca o=vratiIgraca(table.getValueAt(table.getSelectedRow(),0).toString());
				if(o==null) {
					//show message kasnije
					return;
				}
				
				if(JOptionPane.showConfirmDialog(null, "Poslati zahtev korisniku "+o.getUsername(), "Zahtev za igru",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0) {
					
					ng.dispose();
				}
			}

			
			
		});

		JScrollPane js = new JScrollPane(table);
		js.setVisible(true);
		add(js);
	}
	
	public ObjIgraca vratiIgraca(String ime) {
		if(ime==null || ime.equals("")) {
			return null;
		}
		for (ObjIgraca i : igraci) {
			if(i.getUsername().equals(ime)) {
				return i;
			}		
		}
		return null;
	}

}
