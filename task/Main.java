package task;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	private JPanel contentPane;
	public int elapsedTime = 0; // vergangene Zeit vom Timer
	public int seconds = 0; // vom Timer
	public int minutes = 0; // vom Timer
	boolean started = false;
	String seconds_string = String.format("%02d", seconds);
	String minutes_string = String.format("%02d", minutes);
	private final static int ONE_SECOND = 1000;
	public static Timer timer;
	public static Integer fuersten = 1;
	public static Integer bauern = 0;
	public static ArrayList<Player> playerList = new ArrayList<Player>();
	public static ArrayList<Player> kutscherList = new ArrayList<Player>();
	public static Integer kutscher = 0;
	public static Player selectedPlayer = new Player("Statist", "Max");
	public static JLabel selectedLabel = new JLabel();
	public static int counterFuersten = 0;
	public static boolean changed = false;
	public static JLabel lblFuersten[];
	public static JLabel lblBauern[];
	public static JLabel lblKutschers[];
	public static JLabel lblKoenigPlayer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 936, 771);
		// setSize((int) screenSize.getWidth(), (int) screenSize.getHeight());
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel = new JPanel();

		JPanel panel_1 = new JPanel();

		JPanel panel_3 = new JPanel();

		JPanel panel_5 = new JPanel();

		JPanel panel_2 = new JPanel();

		JPanel panel_2_1 = new JPanel();

		JPanel panel_2_2 = new JPanel();

		JPanel panelFuersten = new JPanel();

		JPanel panelBauern = new JPanel();

		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblKutscher = new JLabel("Kutscher");
		lblKutscher.setHorizontalAlignment(SwingConstants.CENTER);
		lblKutscher.setFont(new Font("Vivaldi", Font.BOLD, 44));
		panel_2_1_1.add(lblKutscher);

		JPanel pnlKutscher = new JPanel();
		pnlKutscher.setLayout(new GridLayout(1, 0, 0, 0));

		JScrollPane scrollPane_1 = new JScrollPane();

		JPanel panel_4 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
						.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 166,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 166,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(panel_2_2, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(panelFuersten, GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
								.addComponent(panelBauern, GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE).addComponent(
										panel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(panel_2_1_1, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(pnlKutscher,
										GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)))
				.addGap(14)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(panel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 233,
										Short.MAX_VALUE)))
				.addContainerGap(27, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 174,
												GroupLayout.PREFERRED_SIZE)
										.addGap(11).addComponent(panel_2_2, GroupLayout.PREFERRED_SIZE, 174,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(panelFuersten, GroupLayout.PREFERRED_SIZE, 174,
												GroupLayout.PREFERRED_SIZE)
										.addGap(11).addComponent(panelBauern, GroupLayout.PREFERRED_SIZE, 174,
												GroupLayout.PREFERRED_SIZE)))
						.addGap(9)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(panel_2_1_1, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
								.addComponent(pnlKutscher, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE).addGap(3)));

		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		scrollPane_1.setViewportView(textPane_1);
		panelBauern.setLayout(new GridLayout(1, 0, 0, 0));
		panelFuersten.setLayout(new GridLayout(1, 0, 0, 0));
		panel_2_2.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblBauer = new JLabel("Bauern");
		lblBauer.setFont(new Font("Vivaldi", Font.BOLD, 41));
		lblBauer.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2_2.add(lblBauer);
		panel_2_1.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblFuerst = new JLabel("Fuersten");
		lblFuerst.setFont(new Font("Vivaldi", Font.BOLD, 44));
		lblFuerst.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2_1.add(lblFuerst);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblKoenig = new JLabel("K\u00F6nig");
		lblKoenig.setFont(new Font("Vivaldi", Font.BOLD, 47));
		lblKoenig.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblKoenig);
		panel_5.setLayout(new GridLayout(1, 0, 0, 0));

		lblKoenigPlayer = new JLabel("<html>" + "Name: " + playerList.get(0).getName() + "<br/>Punkte:"
				+ playerList.get(0).getPunkte() + "<html>");
		lblKoenigPlayer.setOpaque(true);

		lblKoenigPlayer.setFont(new Font("Vivaldi", Font.BOLD, 32));
		lblKoenigPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblKoenigPlayer);

		JLabel lblTimer = new JLabel("00:00");
		lblTimer.setHorizontalAlignment(SwingConstants.CENTER);

		JButton btnStart = new JButton("START");

		JButton btnReset = new JButton("RESET");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_1
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTimer, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
								.addComponent(btnStart, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
								.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap()));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
						.addComponent(lblTimer, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnStart, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(12, Short.MAX_VALUE)));
		panel_1.setLayout(gl_panel_1);

		JLabel lblNewLabel = new JLabel("Ansehen");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Vivaldi", Font.BOLD, 39));

		JButton btnPlus5 = new JButton("+5");

		btnPlus5.setFont(new Font("Vivaldi", Font.BOLD, 16));

		JButton btnMinus5 = new JButton("-5");

		btnMinus5.setFont(new Font("Vivaldi", Font.BOLD, 16));

		JButton btnPlus10 = new JButton("+10");

		btnPlus10.setFont(new Font("Vivaldi", Font.BOLD, 16));

		JButton btnMinus10 = new JButton("-10");
		btnMinus10.setFont(new Font("Vivaldi", Font.BOLD, 16));

		JButton btnPlus15 = new JButton("+15");
		btnPlus15.setFont(new Font("Vivaldi", Font.BOLD, 16));

		JButton btnPlus20 = new JButton("+20");
		btnPlus20.setFont(new Font("Vivaldi", Font.BOLD, 16));

		JButton btnPlus25 = new JButton("+25");
		btnPlus25.setFont(new Font("Vivaldi", Font.BOLD, 16));

		JButton btnMinus15 = new JButton("-15");
		btnMinus15.setFont(new Font("Vivaldi", Font.BOLD, 16));

		JButton btnMinus20 = new JButton("-20");
		btnMinus20.setFont(new Font("Vivaldi", Font.BOLD, 16));

		JButton btnMinus25 = new JButton("-25");
		btnMinus25.setFont(new Font("Vivaldi", Font.BOLD, 16));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
								.addComponent(btnPlus5, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
								.addComponent(btnMinus5, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
								.addComponent(btnPlus10, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
								.addComponent(btnMinus10, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
								.addComponent(btnPlus15, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
								.addComponent(btnMinus15, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
								.addComponent(btnPlus20, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
								.addComponent(btnMinus20, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
								.addComponent(btnPlus25, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
								.addComponent(btnMinus25, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnPlus5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnMinus5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnPlus10, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnMinus10, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnPlus15, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnMinus15, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnPlus20, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnMinus20, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnPlus25, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnMinus25, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(18, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);

		// TIMER
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (started == false) {
					timer.start();
					btnStart.setText("STOP");
					started = true;
				} else {
					timer.stop();
					btnStart.setText("START");
					started = false;
				}

			}
		});

		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				started = false;
				btnReset.setText("Start");
				timer.stop();
				elapsedTime = 0;
				minutes = 0;
				seconds = 0;
				seconds_string = String.format("%02d", seconds);
				minutes_string = String.format("%02d", minutes);
				lblTimer.setText(minutes_string + ":" + seconds_string);

			}
		});
		timer = new Timer(ONE_SECOND, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				elapsedTime = elapsedTime + 1000;
				minutes = (elapsedTime / 60000) % 60;
				seconds = (elapsedTime / 1000) % 60;
				seconds_string = String.format("%02d", seconds);
				minutes_string = String.format("%02d", minutes);
				lblTimer.setText(minutes_string + ":" + seconds_string);
				if (seconds == 3) {
					started = false;
					btnStart.setText("Start");
					timer.stop();
					elapsedTime = 0;
					minutes = 0;
					seconds = 0;
					seconds_string = String.format("%02d", seconds);
					minutes_string = String.format("%02d", minutes);
					lblTimer.setText(minutes_string + ":" + seconds_string);
					StopwatchWindow nw = new StopwatchWindow();
					nw.NewScreen();

				}
			}

		});

		lblFuersten = new JLabel[fuersten];
		for (int i = 0; i < lblFuersten.length; i++) {
			lblFuersten[i] = new JLabel("<html>" + "Name: " + playerList.get(i + 1).getName() + "<br/>Punkte:"
					+ playerList.get(i + 1).getPunkte() + "<html>");
			lblFuersten[i].setFont(new Font("Vivaldi", Font.BOLD, 30));
			lblFuersten[i].setHorizontalAlignment(SwingConstants.CENTER);
			lblFuersten[i].setVerticalAlignment(SwingConstants.CENTER);
			lblFuersten[i].setOpaque(true);

			panelFuersten.add(lblFuersten[i]);
		}

		lblBauern = new JLabel[bauern];
		for (int i = 0; i < lblBauern.length; i++) {
			lblBauern[i] = new JLabel("<html>" + "Name: " + playerList.get(fuersten + 1 + i).getName() + "<br/>Punkte:"
					+ playerList.get(fuersten + i + 1).getPunkte() + "<html>");
			lblBauern[i].setFont(new Font("Vivaldi", Font.BOLD, 30));
			lblBauern[i].setHorizontalAlignment(JLabel.CENTER);
			lblBauern[i].setOpaque(true);
			panelBauern.add(lblBauern[i]);
		}

		lblKutschers = new JLabel[kutscher];
		for (int i = 0; i < lblKutschers.length; i++) {
			lblKutschers[i] = new JLabel("<html>" + "Name: " + kutscherList.get(i).getName() + "<br/>Punkte:"
					+ kutscherList.get(i).getPunkte() + "<html>");
			lblKutschers[i].setFont(new Font("Vivaldi", Font.BOLD, 30));
			lblKutschers[i].setHorizontalAlignment(SwingConstants.CENTER);
			lblKutschers[i].setVerticalAlignment(SwingConstants.CENTER);

			pnlKutscher.add(lblKutschers[i]);
		}

		lblKoenigPlayer.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				selectedPlayer = playerList.get(0);
				selectedLabel.setBackground(SystemColor.menu);
				selectedLabel = lblKoenigPlayer;
				selectedLabel.setBackground(Color.red);
				selectedLabel.setOpaque(true);
			}
		});

		btnPlus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedPlayer.setPunkte(5);
				updatePlayerLbl(lblKoenigPlayer, lblFuersten, lblBauern, lblKutschers);
			}
		});
		btnPlus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectedPlayer.setPunkte(10);
				updatePlayerLbl(lblKoenigPlayer, lblFuersten, lblBauern, lblKutschers);
			}
		});
		btnPlus15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectedPlayer.setPunkte(15);
				updatePlayerLbl(lblKoenigPlayer, lblFuersten, lblBauern, lblKutschers);
			}
		});
		btnPlus20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectedPlayer.setPunkte(20);
				updatePlayerLbl(lblKoenigPlayer, lblFuersten, lblBauern, lblKutschers);
			}
		});
		btnPlus25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectedPlayer.setPunkte(25);
				updatePlayerLbl(lblKoenigPlayer, lblFuersten, lblBauern, lblKutschers);
			}
		});
		btnMinus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectedPlayer.setPunkte(-5);
				updatePlayerLbl(lblKoenigPlayer, lblFuersten, lblBauern, lblKutschers);
			}
		});
		btnMinus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectedPlayer.setPunkte(-10);
				updatePlayerLbl(lblKoenigPlayer, lblFuersten, lblBauern, lblKutschers);
			}
		});
		btnMinus15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectedPlayer.setPunkte(-15);
				updatePlayerLbl(lblKoenigPlayer, lblFuersten, lblBauern, lblKutschers);
			}
		});
		btnMinus20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectedPlayer.setPunkte(-20);
				updatePlayerLbl(lblKoenigPlayer, lblFuersten, lblBauern, lblKutschers);
			}
		});
		btnMinus25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectedPlayer.setPunkte(-25);
				updatePlayerLbl(lblKoenigPlayer, lblFuersten, lblBauern, lblKutschers);
			}
		});

		for (int i = 0; i < lblFuersten.length; i++) {
			int k = i;
			lblFuersten[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					selectedPlayer = playerList.get(k + 1);
					selectedLabel.setBackground(SystemColor.menu);
					selectedLabel = lblFuersten[k];
					selectedLabel.setBackground(Color.red);
					selectedLabel.setOpaque(true);

				}
			});

		}
		for (int i = 0; i < lblBauern.length; i++) {
			int k = i;
			lblBauern[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					selectedPlayer = playerList.get(fuersten + k + 1);
					selectedLabel.setBackground(SystemColor.menu);
					selectedLabel = lblBauern[k];
					selectedLabel.setBackground(Color.red);
					selectedLabel.setOpaque(true);

				}
			});

		}

		for (int i = 0; i < lblKutschers.length; i++) {
			int k = i;
			lblKutschers[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					selectedPlayer = kutscherList.get(k);
					selectedLabel.setBackground(SystemColor.menu);
					selectedLabel = lblKutschers[k];
					lblKutschers[k].setBackground(Color.red);
					lblKutschers[k].setOpaque(true);

				}
			});

		}

	}

	public static void updatePlayerLbl(JLabel lblKoenig, JLabel[] lblFuersten, JLabel[] lblBauern,
			JLabel[] lblKutschers) {
		Collections.sort(playerList);
		if (playerList.contains(selectedPlayer)) {
			selectedLabel.setBackground(SystemColor.menu);
		} else {
			selectedLabel.setBackground(Color.red);
		}
		if (playerList.indexOf(selectedPlayer) == 0) {
			selectedLabel = lblKoenig;
			selectedLabel.setBackground(Color.red);

		} else if (playerList.indexOf(selectedPlayer) > 0
				&& playerList.indexOf(selectedPlayer) < lblFuersten.length + 1) {
			selectedLabel = lblFuersten[playerList.indexOf(selectedPlayer) - 1];
			selectedLabel.setBackground(Color.red);

		} else if (playerList.indexOf(selectedPlayer) >= lblFuersten.length + 1
				&& playerList.indexOf(selectedPlayer) < lblFuersten.length + 1 + lblBauern.length) {
			selectedLabel = lblBauern[playerList.indexOf(selectedPlayer) - 1 - lblFuersten.length];
			selectedLabel.setBackground(Color.red);
		}
		lblKoenig.setText("<html>" + "Name: " + playerList.get(0).getName() + "<br/>Punkte:"
				+ playerList.get(0).getPunkte() + "<html>");
		for (int i = 0; i < lblFuersten.length; i++) {
			lblFuersten[i].setText("<html>" + "Name: " + playerList.get(i + 1).getName() + "<br/>Punkte:"
					+ playerList.get(i + 1).getPunkte() + "<html>");
		}
		for (int i = 0; i < lblBauern.length; i++) {
			lblBauern[i].setText("<html>" + "Name: " + playerList.get(lblFuersten.length + i + 1).getName()
					+ "<br/>Punkte:" + playerList.get(lblFuersten.length + i + 1).getPunkte() + "<html>");
		}
		for (int i = 0; i < lblKutschers.length; i++) {
			lblKutschers[i].setText("<html>" + "Name: " + kutscherList.get(i).getName() + "<br/>Punkte:"
					+ kutscherList.get(i).getPunkte() + "<html>");
		}
	}

}
