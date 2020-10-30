package task;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class AnzahlFuersten {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnzahlFuersten window = new AnzahlFuersten();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AnzahlFuersten() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 593, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		JPanel panel_1 = new JPanel();

		JLabel lblWieVieleFrsten = new JLabel("Wie viele F\u00FCrsten wird es geben?");
		lblWieVieleFrsten.setFont(new Font("Vivaldi", Font.BOLD, 18));
		lblWieVieleFrsten.setHorizontalAlignment(SwingConstants.CENTER);

		JButton btnFuerstenMinus = new JButton("-");

		JButton btnFuerstenPlus = new JButton("+");

		JLabel lblFuerstenAnzahl = new JLabel(Main.fuersten.toString());
		lblFuerstenAnzahl.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGap(0, 558, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
						.addComponent(lblWieVieleFrsten, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
						.addGap(69)
						.addComponent(btnFuerstenMinus, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(lblFuerstenAnzahl, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
						.addGap(18)
						.addComponent(btnFuerstenPlus, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addGap(31)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGap(0, 95, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup().addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup().addContainerGap().addComponent(lblWieVieleFrsten,
								GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup().addGap(27)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnFuerstenPlus, GroupLayout.PREFERRED_SIZE, 36,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnFuerstenMinus, GroupLayout.PREFERRED_SIZE, 36,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblFuerstenAnzahl, GroupLayout.PREFERRED_SIZE, 31,
												GroupLayout.PREFERRED_SIZE))))
						.addContainerGap()));
		panel_1.setLayout(gl_panel_1);

		JPanel panel_2 = new JPanel();

		JLabel lblWieVieleBauern = new JLabel("Wie viele Bauern wird es geben?");
		lblWieVieleBauern.setFont(new Font("Vivaldi", Font.BOLD, 18));
		lblWieVieleBauern.setHorizontalAlignment(SwingConstants.CENTER);

		JButton btnBauernMinus = new JButton("-");

		JButton btnBauernPlus = new JButton("+");

		JLabel lblBauernAnzahl = new JLabel(Main.bauern.toString());
		lblBauernAnzahl.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGap(0, 558, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup().addContainerGap()
						.addComponent(lblWieVieleBauern, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
						.addGap(69)
						.addComponent(btnBauernMinus, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(lblBauernAnzahl, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
						.addGap(18)
						.addComponent(btnBauernPlus, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addGap(31)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGap(0, 95, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup().addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup().addContainerGap().addComponent(lblWieVieleBauern,
								GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
						.addGroup(gl_panel_2.createSequentialGroup().addGap(27).addGroup(gl_panel_2
								.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnBauernPlus, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBauernMinus, GroupLayout.PREFERRED_SIZE, 36,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblBauernAnzahl, GroupLayout.PREFERRED_SIZE, 31,
										GroupLayout.PREFERRED_SIZE))))
						.addContainerGap()));
		panel_2.setLayout(gl_panel_2);

		JPanel panel_2_1 = new JPanel();

		JLabel lblWirdEsEinen = new JLabel("Wird es einen Kutscher geben?");
		lblWirdEsEinen.setHorizontalAlignment(SwingConstants.CENTER);
		lblWirdEsEinen.setFont(new Font("Vivaldi", Font.BOLD, 18));

		JButton btnKutscherMinus = new JButton("-");

		JLabel lblKutscherAnzahl = new JLabel(Main.kutscher.toString());
		lblKutscherAnzahl.setHorizontalAlignment(SwingConstants.CENTER);

		JButton btnKutscherPlus = new JButton("+");
		GroupLayout gl_panel_2_1 = new GroupLayout(panel_2_1);
		gl_panel_2_1.setHorizontalGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 558, Short.MAX_VALUE)
				.addGroup(gl_panel_2_1.createSequentialGroup().addContainerGap()
						.addComponent(lblWirdEsEinen, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
						.addGap(69)
						.addComponent(btnKutscherMinus, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(lblKutscherAnzahl, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
						.addGap(18)
						.addComponent(btnKutscherPlus, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addGap(31)));
		gl_panel_2_1.setVerticalGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING).addGap(0, 95, Short.MAX_VALUE)
				.addGroup(gl_panel_2_1.createSequentialGroup().addGroup(gl_panel_2_1
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_1.createSequentialGroup().addContainerGap().addComponent(lblWirdEsEinen,
								GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
						.addGroup(gl_panel_2_1.createSequentialGroup().addGap(27)
								.addGroup(gl_panel_2_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnKutscherPlus, GroupLayout.PREFERRED_SIZE, 36,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnKutscherMinus, GroupLayout.PREFERRED_SIZE, 36,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblKutscherAnzahl, GroupLayout.PREFERRED_SIZE, 31,
												GroupLayout.PREFERRED_SIZE))))
						.addContainerGap()));
		panel_2_1.setLayout(gl_panel_2_1);

		JPanel panel_3 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 558, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 558, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 558, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING,
						groupLayout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 558, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup().addGap(104)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 362, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(111, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));

		JButton btnWeiter = new JButton("Weiter geht es....");

		btnWeiter.setFont(new Font("Vivaldi", Font.BOLD, 26));
		panel_3.add(btnWeiter);

		JLabel lblNewLabel = new JLabel("Es kann nur einen K\u00F6nig geben...");
		lblNewLabel.setFont(new Font("Vivaldi", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblKoenigAnzahl = new JLabel("1");
		lblKoenigAnzahl.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
						.addGap(129).addComponent(lblKoenigAnzahl, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
						.addGap(91)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup().addContainerGap().addComponent(lblNewLabel,
										GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
								.addGroup(gl_panel.createSequentialGroup().addGap(27).addComponent(lblKoenigAnzahl,
										GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);

		btnFuerstenMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.fuersten = Main.fuersten - 1;
				lblFuerstenAnzahl.setText(Main.fuersten.toString());
			}
		});
		btnFuerstenPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.fuersten = Main.fuersten + 1;
				lblFuerstenAnzahl.setText(Main.fuersten.toString());
				System.out.println(Main.fuersten);
			}
		});

		btnBauernMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.bauern = Main.bauern - 1;
				lblBauernAnzahl.setText(Main.bauern.toString());
			}
		});
		btnBauernPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.bauern = Main.bauern + 1;
				lblBauernAnzahl.setText(Main.bauern.toString());
			}
		});

		btnKutscherMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.kutscher = Main.kutscher - 1;
				lblKutscherAnzahl.setText(Main.kutscher.toString());
			}
		});
		btnKutscherPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.kutscher = Main.kutscher + 1;
				lblKutscherAnzahl.setText(Main.kutscher.toString());
			}
		});

		btnWeiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Settings newSettingScreen = new Settings();
				newSettingScreen.setVisible(true);
				frame.dispose();
			}
		});
	}

}
