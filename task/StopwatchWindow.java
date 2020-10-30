package task;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class StopwatchWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StopwatchWindow window = new StopwatchWindow();
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
	public StopwatchWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 474, 183);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("Eure Majest\u00E4t, was wollt ihr machen?");
		lblNewLabel.setFont(new Font("Vivaldi", Font.BOLD, 31));

		JButton btnShot = new JButton("\"Shot trinken!\"");
		btnShot.setFont(new Font("Vivaldi", Font.BOLD, 28));

		JButton btnAnsehen = new JButton("\"Ansehen verlieren..:\"");

		btnAnsehen.setFont(new Font("Vivaldi", Font.BOLD, 23));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(btnShot, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
								.addComponent(btnAnsehen, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
				.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(20)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnShot, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
								.addComponent(btnAnsehen, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		frame.getContentPane().setLayout(groupLayout);
		btnShot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("hier im shot");
				StopwatchWindowFuerst nextWindow = new StopwatchWindowFuerst();
				nextWindow.setVisible(true);
				frame.dispose();
			}
		});
		btnAnsehen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.playerList.get(0).setPunkte(-5);
				StopwatchWindowFuerst nextWindow = new StopwatchWindowFuerst();
				System.out.println("hier im ansehen");
				frame.dispose();
			}
		});

	}

}
