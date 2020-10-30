package task;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class Settings extends JFrame {

	private JPanel contentPane;
	public static DefaultListModel<String> model = new DefaultListModel<String>(); // wilde Sachen
	public static JList listNames = new JList(model);
	public static Player selectedPlayer = new Player("Statist", "Statist");
	public static int selectedIndex = -1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Settings frame = new Settings();
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
	public Settings() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panelTitle = new JPanel();

		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 555, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelTitle, GroupLayout.PREFERRED_SIZE, 555, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(17, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(panelTitle, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(36, Short.MAX_VALUE)));

		JLabel lblNewLabel = new JLabel("Spieler");
		lblNewLabel.setFont(new Font("Vivaldi", Font.BOLD, 38));

		JScrollPane scrollPane = new JScrollPane();

		JButton btnAddPlayer = new JButton("+");

		btnAddPlayer.setFont(new Font("Tahoma", Font.BOLD, 22));

		JButton btnMinus = new JButton("-");

		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 27));

		JLabel lblLoeschen = new JLabel("L\u00F6schen");
		lblLoeschen.setFont(new Font("Vivaldi", Font.BOLD, 21));
		lblLoeschen.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblHinzufgen = new JLabel("Hinzuf\u00FCgen");
		lblHinzufgen.setHorizontalAlignment(SwingConstants.CENTER);
		lblHinzufgen.setFont(new Font("Vivaldi", Font.BOLD, 20));

		JButton btnFertig = new JButton("Fertig");

		btnFertig.setFont(new Font("Vivaldi", Font.BOLD, 18));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup().addGap(58).addComponent(btnMinus,
												GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup().addGap(50).addComponent(lblLoeschen,
												GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
								.addGap(43)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel.createSequentialGroup()
												.addComponent(btnAddPlayer, GroupLayout.PREFERRED_SIZE, 52,
														GroupLayout.PREFERRED_SIZE)
												.addGap(54))
										.addGroup(gl_panel.createSequentialGroup().addComponent(lblHinzufgen)
												.addGap(33))))
						.addGroup(
								gl_panel.createSequentialGroup().addContainerGap(215, Short.MAX_VALUE)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 128,
												GroupLayout.PREFERRED_SIZE)
										.addGap(212))
						.addGroup(gl_panel.createSequentialGroup().addContainerGap(206, Short.MAX_VALUE)
								.addComponent(btnFertig, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
								.addGap(201)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnFertig, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
								.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblLoeschen, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnMinus, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addGap(91))
						.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblHinzufgen, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnAddPlayer, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addGap(91)))));

		scrollPane.setViewportView(listNames);
		panel.setLayout(gl_panel);
		panelTitle.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblTitle = new JLabel("Wer seid Ihr?");
		lblTitle.setFont(new Font("Vivaldi", Font.BOLD, 68));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		panelTitle.add(lblTitle);
		contentPane.setLayout(gl_contentPane);

		btnAddPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayerCreation3 nwpc = new PlayerCreation3();
				nwpc.NewScreenCreation();
			}
		});

		// hier Klassenzuweisung
		// K�nig

		btnFertig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Main.playerList.size() == 0 || Main.playerList.size() != Main.bauern + Main.fuersten + 1) {
					System.out.println("Es fehlt jemand!");

				} else {
					if (Main.playerList.size() > 0) {
						Main.playerList.get(0).setKlasse("K�nig");
						if (Main.playerList.size() > 1) {
							for (int i = 1; i <= Main.fuersten; i++) {
								Main.playerList.get(i).setKlasse("F�rsten");
							}
						}
						if (Main.bauern > 0) {
							for (int i = Main.fuersten + 1; i <= Main.playerList.size() - 1; i++) {
								Main.playerList.get(i).setKlasse("Bauer");
							}
						}
					}
					Main pc = new Main();
					pc.setVisible(true);
					dispose();
				}
			}
		});

		listNames.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectedIndex = listNames.getSelectedIndex();
			}
		});

		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedIndex != -1) {
					model.remove(selectedIndex);
					Main.playerList.remove(selectedIndex);
				}
				selectedIndex = -1;

			}
		});
	}
}
