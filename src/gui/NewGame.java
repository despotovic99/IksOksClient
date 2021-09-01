package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import utils.ObjIgraca;

 

public class NewGame extends JFrame {

 

    private JPanel contentPane;
    private JLabel lblNewLabel;
    PrintStream serverOut;
    BufferedReader serverIn;
    DefaultTableModel df;
    private JPanel panelTabela;
    TabelaIgraca tabela;
 

    public NewGame(PrintStream serverOut, BufferedReader serverIn,LinkedList<ObjIgraca> data) {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 430, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getLblNewLabel());
        contentPane.add(getPanelTabela());
         tabela = new TabelaIgraca((int) (panelTabela.getWidth()*0.9),panelTabela.getHeight(),data,this);
         panelTabela.add(tabela);
        this.serverIn = serverIn;
        this.serverOut = serverOut;
        
    }

 

    private JLabel getLblNewLabel() {
        if (lblNewLabel == null) {
            lblNewLabel = new JLabel("Aktivni igraci");
            lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
            lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel.setBounds(110, 21, 180, 27);
        }
        return lblNewLabel;
    }

 

    

	private JPanel getPanelTabela() {
		if (panelTabela == null) {
			panelTabela = new JPanel();
			panelTabela.setBounds(42, 68, 331, 268);
			panelTabela.setLayout(new BorderLayout(0, 0));
		}
		return panelTabela;
	}
}