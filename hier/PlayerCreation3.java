package task;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class PlayerCreation3 {

	private JFrame frame;
	private JTextField txtName;
	DefaultListModel<String> model = new DefaultListModel<String>();
	JList listPlayer = new JList(model);
	//public ArrayList<Player> playerList = new ArrayList<Player>();
	/**
	 * Launch the application.
	 */
	public static void NewScreenCreation() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerCreation3 window = new PlayerCreation3();
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
	public PlayerCreation3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 579, 165);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(12, Short.MAX_VALUE))
		);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Vivaldi", Font.BOLD, 27));
		txtName.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 27));
		
		JCheckBox checkerAlkohol = new JCheckBox("");
		checkerAlkohol.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblKutscherButton = new JLabel("Kutscher?");
		lblKutscherButton.setFont(new Font("Vivaldi", Font.PLAIN, 18));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(26)
					.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(lblKutscherButton, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(44)
							.addComponent(checkerAlkohol)))
					.addContainerGap(64, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblKutscherButton)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(checkerAlkohol))
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txtName.getText();
				String b = "Kutscher";
				Player player = new Player("Statist",a);
				if(checkerAlkohol.isSelected()) {
					player.setKlasse(b);
					Main.kutscherList.add(player);
					model.addElement(player.getName());
					Settings.model.addElement(player.getName());
					txtName.setText("");
					frame.dispose();
				} else {
				
				Main.playerList.add(player);
				model.addElement(player.getName());
				Settings.model.addElement(player.getName());
				txtName.setText("");		
				frame.dispose();
				}
			}
		});
	}
}
