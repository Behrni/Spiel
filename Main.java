import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main extends JFrame {

	private JPanel contentPane;
	public static Timer timer;

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
	int elapsedTime = 0;
	int seconds = 0;
	int minutes = 0;
	int hours = 0;
	boolean started = false;
	String seconds_string = String.format("%02d", seconds);
	String minutes_string = String.format("%02d", minutes);
	String hours_string = String.format("%02d", hours);
	private final static int ONE_SECOND = 1000;

	public Main() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE).addGap(547)));
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE).addGap(434)));

		JButton btn1 = new JButton("New button");

		JButton btn2 = new JButton("New button");

		JLabel lbl = new JLabel("New label");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(32)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lbl, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
								.addGroup(gl_panel.createSequentialGroup()
										.addComponent(btn1, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE).addGap(39)
										.addComponent(btn2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)))
						.addGap(43)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addComponent(lbl, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE).addGap(54)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btn2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGap(38)));
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);

		btn1.setText("START");
		btn2.setText("RESET");
		lbl.setText(minutes_string + ":" + seconds_string);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (started == false) {
					timer.start();
					btn1.setText("STOP");
					started = true;
				} else {
					timer.stop();
					btn1.setText("START");
					started = false;
				}

			}
		});

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				started = false;
				btn1.setText("Start");
				timer.stop();
				elapsedTime = 0;
				minutes = 0;
				seconds = 0;
				seconds_string = String.format("%02d", seconds);
				minutes_string = String.format("%02d", minutes);
				lbl.setText(minutes_string + ":" + seconds_string);

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
				lbl.setText(minutes_string + ":" + seconds_string);
				if (seconds == 3) {
					started = false;
					btn1.setText("Start");
					timer.stop();
					elapsedTime = 0;
					minutes = 0;
					seconds = 0;
					seconds_string = String.format("%02d", seconds);
					minutes_string = String.format("%02d", minutes);
					lbl.setText(minutes_string + ":" + seconds_string);
					Alert nw = new Alert();
					nw.NewScreen();

				}
			}

		});

	}
}
