package task;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class StopwatchWindowFuerst extends JFrame {

	private JPanel contentPane;
	public static JButton btnAnsehenFuerst;
	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StopwatchWindowFuerst frame = new StopwatchWindowFuerst();
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
	public StopwatchWindowFuerst() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 183);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		System.out.println(Main.counterFuersten);
		Main.counterFuersten = Main.counterFuersten+1;
		JLabel lblNewLabel = new JLabel("Sehr geehrter Fürst "+ Main.playerList.get(Main.counterFuersten).getName() +", was wollt ihr machen?");
		lblNewLabel.setFont(new Font("Vivaldi", Font.BOLD, 31));
		
		JButton btnShotFuerst = new JButton("\"Shot trinken!\"");
		btnShotFuerst.setFont(new Font("Vivaldi", Font.BOLD, 28));
		
		JButton btnAnsehenFuerst = new JButton("\"Ansehen verlieren..:\"");
		
		btnAnsehenFuerst.setFont(new Font("Vivaldi", Font.BOLD, 23));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnShotFuerst, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
							.addComponent(btnAnsehenFuerst, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnShotFuerst, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
						.addComponent(btnAnsehenFuerst, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
		
		
		btnShotFuerst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.counterFuersten<Main.fuersten) {
					dispose();
					StopwatchWindowFuerst nextWindow = new StopwatchWindowFuerst();
					nextWindow.setVisible(true);	
				} else {
				Main.timer.start();
				dispose();
				Main.counterFuersten = 0;
				}
			}
		});
		
		
		btnAnsehenFuerst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.counterFuersten<Main.fuersten) {
					dispose();
					StopwatchWindowFuerst nextWindow = new StopwatchWindowFuerst();
					nextWindow.setVisible(true);
				} else {
					Main.playerList.get(Main.counterFuersten).setPunkte(-5);
					Main.timer.start();
					dispose();
					Main.counterFuersten = 0;
					Main.changed = true;
				}
			}
		});
		
	}
	

}
