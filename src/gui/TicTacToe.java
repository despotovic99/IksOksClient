package gui;


import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import utils.Konekcija;
import utils.ObjIgraca;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TicTacToe {
	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel panel_12;
	private JPanel panel_13;
	private JPanel panel_14;
	private JPanel panel_15;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnReset;
	private JButton btnExit;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField xCount;
	private JTextField oCount;
	private int xCount1 = 0;
	private int oCount1 = 0;
	private String startGame = "X";
	private int b1 = 10;
	private int b2 = 10;
	private int b3 = 10;
	private int b4 = 10;
	private int b5 = 10;
	private int b6 = 10;
	private int b7 = 10;
	private int b8 = 10;
	private int b9 = 10;
	private int i = 0;
	private JMenuBar menuBar;
	private JMenu mnMenu;
	private JMenuItem mntmNewGame;
	private JMenuItem mntmEntry;
	private JMenuItem mntmExit;
	static Konekcija konek;

	
	    public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	                    TicTacToe window = new TicTacToe();
	                     konek=new Konekcija();
	                    konek.poveziSe();
	                    System.out.println(konek.pozdrav());
	                    window.frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }
	


	public TicTacToe() {
		initialize();
	}

	private void choosePlayer() {	
		if(startGame.equalsIgnoreCase("X")) {startGame="O";
        }else {	
        	startGame="X";}
		}

	private void winningGame() {
		if (b1 == 1 && b2 == 1 && b3 == 1) {
			JOptionPane.showMessageDialog(frame, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		} else if (b4 == 1 && b5 == 1 && b6 == 1) {
			JOptionPane.showMessageDialog(frame, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		} else if (b7 == 1 && b8 == 1 && b9 == 1) {
			JOptionPane.showMessageDialog(frame, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		} else if (b1 == 1 && b4 == 1 && b7 == 1) {
			JOptionPane.showMessageDialog(frame, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		} else if (b2 == 1 && b5 == 1 && b8 == 1) {
			JOptionPane.showMessageDialog(frame, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		} else if (b3 == 1 && b6 == 1 && b9 == 1) {
			JOptionPane.showMessageDialog(frame, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		} else if (b1 == 1 && b5 == 1 && b9 == 1) {
			JOptionPane.showMessageDialog(frame, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		} else if (b3 == 1 && b5 == 1 && b7 == 1) {
			JOptionPane.showMessageDialog(frame, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		}

		else if (b1 == 0 && b2 == 0 && b3 == 0) {
			JOptionPane.showMessageDialog(frame, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		}

		else if (b4 == 0 && b5 == 0 && b6 == 0) {
			JOptionPane.showMessageDialog(frame, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		} else if (b7 == 0 && b8 == 0 && b9 == 0) {
			JOptionPane.showMessageDialog(frame, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		} else if (b1 == 0 && b4 == 0 && b7 == 0) {
			JOptionPane.showMessageDialog(frame, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		} else if (b2 == 0 && b5 == 0 && b8 == 0) {
			JOptionPane.showMessageDialog(frame, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		} else if (b3 == 0 && b6 == 0 && b9 == 0) {
			JOptionPane.showMessageDialog(frame, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		} else if (b1 == 0 && b5 == 0 && b9 == 0) {
			JOptionPane.showMessageDialog(frame, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		} else if (b3 == 0 && b5 == 0 && b7 == 0) {
			JOptionPane.showMessageDialog(frame, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		} else if (i == 9) {
			JOptionPane.showMessageDialog(frame, "No One Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	private void newGame() {

	}

	public void promenaStatusa(String status, Konekcija konekcija) {
		String message = "";
		if (message != null) {
			String s = "{\"zaglavlje\":\"" + status + "\",\"data\":\"" + message + "\",\"kraj\":true}";
			byte[] bajtovi = s.getBytes();
			try {
				konekcija.serverOutput.write(bajtovi);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			konekcija.serverOutput.flush();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 725, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.getContentPane().add(getPanel(), BorderLayout.CENTER);
		frame.setJMenuBar(getMenuBar());
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel.setLayout(new GridLayout(3, 5, 2, 2));
			panel.add(getPanel_1());
			panel.add(getPanel_2());
			panel.add(getPanel_3());
			panel.add(getPanel_4());
			panel.add(getPanel_5());
			panel.add(getPanel_6());
			panel.add(getPanel_7());
			panel.add(getPanel_8());
			panel.add(getPanel_9());
			panel.add(getPanel_10());
			panel.add(getPanel_11());
			panel.add(getPanel_12());
			panel.add(getPanel_13());
			panel.add(getPanel_14());
			panel.add(getPanel_15());
		}
		return panel;
	}

	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_1.setLayout(new BorderLayout(0, 0));
			panel_1.add(getBtn1(), BorderLayout.CENTER);
		}
		return panel_1;
	}

	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_2.setLayout(new BorderLayout(0, 0));
			panel_2.add(getBtn2(), BorderLayout.CENTER);
		}
		return panel_2;
	}

	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_3.setLayout(new BorderLayout(0, 0));
			panel_3.add(getBtn3(), BorderLayout.CENTER);
		}
		return panel_3;
	}

	private JPanel getPanel_4() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
			panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_4.setLayout(new BorderLayout(0, 0));
			panel_4.add(getLblNewLabel(), BorderLayout.CENTER);
		}
		return panel_4;
	}

	private JPanel getPanel_5() {
		if (panel_5 == null) {
			panel_5 = new JPanel();
			panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_5.setLayout(new BorderLayout(0, 0));
			panel_5.add(getXCount(), BorderLayout.CENTER);
		}
		return panel_5;
	}

	private JPanel getPanel_6() {
		if (panel_6 == null) {
			panel_6 = new JPanel();
			panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_6.setLayout(new BorderLayout(0, 0));
			panel_6.add(getBtn4(), BorderLayout.CENTER);
		}
		return panel_6;
	}

	private JPanel getPanel_7() {
		if (panel_7 == null) {
			panel_7 = new JPanel();
			panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_7.setLayout(new BorderLayout(0, 0));
			panel_7.add(getBtn5(), BorderLayout.CENTER);
		}
		return panel_7;
	}

	private JPanel getPanel_8() {
		if (panel_8 == null) {
			panel_8 = new JPanel();
			panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_8.setLayout(new BorderLayout(0, 0));
			panel_8.add(getBtn6(), BorderLayout.CENTER);
		}
		return panel_8;
	}

	private JPanel getPanel_9() {
		if (panel_9 == null) {
			panel_9 = new JPanel();
			panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_9.setLayout(new BorderLayout(0, 0));
			panel_9.add(getLblNewLabel_1(), BorderLayout.CENTER);
		}
		return panel_9;
	}

	private JPanel getPanel_10() {
		if (panel_10 == null) {
			panel_10 = new JPanel();
			panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_10.setLayout(new BorderLayout(0, 0));
			panel_10.add(getOCount(), BorderLayout.CENTER);
		}
		return panel_10;
	}

	private JPanel getPanel_11() {
		if (panel_11 == null) {
			panel_11 = new JPanel();
			panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_11.setLayout(new BorderLayout(0, 0));
			panel_11.add(getBtn7(), BorderLayout.CENTER);
		}
		return panel_11;
	}

	private JPanel getPanel_12() {
		if (panel_12 == null) {
			panel_12 = new JPanel();
			panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_12.setLayout(new BorderLayout(0, 0));
			panel_12.add(getBtn8(), BorderLayout.CENTER);
		}
		return panel_12;
	}

	private JPanel getPanel_13() {
		if (panel_13 == null) {
			panel_13 = new JPanel();
			panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_13.setLayout(new BorderLayout(0, 0));
			panel_13.add(getBtn9(), BorderLayout.CENTER);
		}
		return panel_13;
	}

	private JPanel getPanel_14() {
		if (panel_14 == null) {
			panel_14 = new JPanel();
			panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_14.setLayout(new BorderLayout(0, 0));
			panel_14.add(getBtnReset(), BorderLayout.CENTER);
		}
		return panel_14;
	}

	private JPanel getPanel_15() {
		if (panel_15 == null) {
			panel_15 = new JPanel();
			panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_15.setLayout(new BorderLayout(0, 0));
			panel_15.add(getBtnExit(), BorderLayout.CENTER);
		}
		return panel_15;
	}

	private JButton getBtn1() {
		if (btn1 == null) {
			btn1 = new JButton("");
			btn1.setFont(new Font("Tahoma", Font.BOLD, 70));
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btn1.setText(startGame);
					if (startGame.equalsIgnoreCase("X")) {
						btn1.setForeground(Color.GREEN);
						b1 = 1;
						i++;
					} else {
						btn1.setForeground(Color.ORANGE);
						b1 = 0;
						i++;
					}
					choosePlayer();
					winningGame();
				}
			});
		}
		return btn1;
	}

	private JButton getBtn2() {
		if (btn2 == null) {
			btn2 = new JButton("");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btn2.setText(startGame);
					if (startGame.equalsIgnoreCase("X")) {
						btn2.setForeground(Color.GREEN);
						b2 = 1;
						i++;
					} else {
						btn2.setForeground(Color.ORANGE);
						b2 = 0;
						i++;
					}
					choosePlayer();
					winningGame();
				}
			});
			btn2.setFont(new Font("Tahoma", Font.BOLD, 70));
		}
		return btn2;
	}

	private JButton getBtn3() {
		if (btn3 == null) {
			btn3 = new JButton("");
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btn3.setText(startGame);
					if (startGame.equalsIgnoreCase("X")) {
						btn3.setForeground(Color.GREEN);
						b3 = 1;
						i++;
					} else {
						btn3.setForeground(Color.ORANGE);
						b3 = 0;
						i++;
					}
					choosePlayer();
					winningGame();
				}
			});
			btn3.setFont(new Font("Tahoma", Font.BOLD, 70));
		}
		return btn3;
	}

	private JButton getBtn4() {
		if (btn4 == null) {
			btn4 = new JButton("");
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btn4.setText(startGame);
					if (startGame.equalsIgnoreCase("X")) {
						btn4.setForeground(Color.GREEN);
						b4 = 1;
						i++;
					} else {
						btn4.setForeground(Color.ORANGE);
						b4 = 0;
						i++;
					}
					choosePlayer();
					winningGame();
				}
			});
			btn4.setFont(new Font("Tahoma", Font.BOLD, 70));
		}
		return btn4;
	}

	private JButton getBtn5() {
		if (btn5 == null) {
			btn5 = new JButton("");
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btn5.setText(startGame);
					if (startGame.equalsIgnoreCase("X")) {
						btn5.setForeground(Color.GREEN);
						b5 = 1;
						i++;
					} else {
						btn5.setForeground(Color.ORANGE);
						b5 = 0;
						i++;
					}
					choosePlayer();
					winningGame();
				}
			});
			btn5.setFont(new Font("Tahoma", Font.BOLD, 70));
		}
		return btn5;
	}

	private JButton getBtn6() {
		if (btn6 == null) {
			btn6 = new JButton("");
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btn6.setText(startGame);
					if (startGame.equalsIgnoreCase("X")) {
						btn6.setForeground(Color.GREEN);
						b6 = 1;
						i++;
					} else {
						btn6.setForeground(Color.ORANGE);
						b6 = 0;
						i++;
					}
					choosePlayer();
					winningGame();
				}
			});
			btn6.setFont(new Font("Tahoma", Font.BOLD, 70));
		}
		return btn6;
	}

	private JButton getBtn7() {
		if (btn7 == null) {
			btn7 = new JButton("");
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btn7.setText(startGame);
					if (startGame.equalsIgnoreCase("X")) {
						btn7.setForeground(Color.GREEN);
						b7 = 1;
						i++;
					}
					choosePlayer();
					winningGame();
				}
			});
			btn7.setFont(new Font("Tahoma", Font.BOLD, 70));
		}
		return btn7;
	}

	private JButton getBtn8() {
		if (btn8 == null) {
			btn8 = new JButton("");
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btn8.setText(startGame);
					if (startGame.equalsIgnoreCase("X")) {
						btn8.setForeground(Color.GREEN);
						b8 = 1;
						i++;
					} else {
						btn8.setForeground(Color.ORANGE);
						b8 = 0;
						i++;
					}
					choosePlayer();
					winningGame();
				}
			});
			btn8.setFont(new Font("Tahoma", Font.BOLD, 70));
		}
		return btn8;
	}

	private JButton getBtn9() {
		if (btn9 == null) {
			btn9 = new JButton("");
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btn9.setText(startGame);
					if (startGame.equalsIgnoreCase("X")) {
						btn9.setForeground(Color.GREEN);
						b9 = 1;
						i++;
					} else {
						btn9.setForeground(Color.ORANGE);
						b9 = 0;
						i++;
					}
					choosePlayer();
					winningGame();
				}
			});
			btn9.setFont(new Font("Tahoma", Font.BOLD, 70));
		}
		return btn9;
	}

	private JButton getBtnReset() {
		if (btnReset == null) {
			btnReset = new JButton("RESET");
			btnReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					btn1.setText(null);
					btn2.setText(null);
					btn3.setText(null);
					btn4.setText(null);
					btn5.setText(null);
					btn6.setText(null);
					btn7.setText(null);
					btn8.setText(null);
					btn9.setText(null);
					b1 = 10;
					b2 = 10;
					b3 = 10;
					b4 = 10;
					b5 = 10;
					b6 = 10;
					b7 = 10;
					b8 = 10;
					b9 = 10;
					i = 0;
				}
			});
			btnReset.setFont(new Font("Tahoma", Font.BOLD, 24));
		}
		return btnReset;
	}

	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton("EXIT");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame = new JFrame("Exit");
					if (JOptionPane.showConfirmDialog(frame, "Confirm you want to exit", "Tic Tac Toe",
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
						System.exit(0);
					}
				}
			});
			btnExit.setFont(new Font("Tahoma", Font.BOLD, 24));
		}
		return btnExit;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Player X");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		}
		return lblNewLabel;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Player O");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		}
		return lblNewLabel_1;
	}

	private JTextField getXCount() {
		if (xCount == null) {
			xCount = new JTextField();
			xCount.setFont(new Font("Tahoma", Font.BOLD, 30));
			xCount.setHorizontalAlignment(SwingConstants.CENTER);
			xCount.setText("0");
			xCount.setColumns(10);
		}
		return xCount;
	}

	private JTextField getOCount() {
		if (oCount == null) {
			oCount = new JTextField();
			oCount.setFont(new Font("Tahoma", Font.BOLD, 30));
			oCount.setHorizontalAlignment(SwingConstants.CENTER);
			oCount.setText("0");
			oCount.setColumns(10);
		}
		return oCount;
	}

	private JMenuBar getMenuBar() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnMenu());
		}
		return menuBar;
	}

	private JMenu getMnMenu() {
		if (mnMenu == null) {
			mnMenu = new JMenu("Menu 1");
			mnMenu.add(getMntmNewGame());
			mnMenu.add(getMntmEntry());
			mnMenu.add(getMntmExit());
		}
		return mnMenu;
	}

	private JMenuItem getMntmNewGame() {
		if (mntmNewGame == null) {
			mntmNewGame = new JMenuItem("New game");
			mntmNewGame.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					LinkedList<ObjIgraca>data=konek.getSviKorisnici();
					  NewGame ng = new NewGame(konek.serverOutput, konek.serverInput,data);
					  ng.setVisible(true);
					  
					 
				}
			});
			
		}
		return mntmNewGame;
	}

	private JMenuItem getMntmEntry() {
		if (mntmEntry == null) {
			mntmEntry = new JMenuItem("Entry");
		}
		return mntmEntry;
	}

	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
		}
		return mntmExit;
	}
}