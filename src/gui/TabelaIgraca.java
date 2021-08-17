package gui;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import utils.ObjIgraca;

public class TabelaIgraca extends JPanel {

	LinkedList<ObjIgraca> igraci = null;

	public TabelaIgraca(int sirina, int visina, LinkedList<ObjIgraca> data) {
		igraci = null;
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
				
				System.out.println(table.getValueAt(table.getSelectedRow(),0));
			}

			
			
		});

		JScrollPane js = new JScrollPane(table);
		js.setVisible(true);
		add(js);
	}

}
