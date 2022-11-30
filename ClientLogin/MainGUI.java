package ClientLogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Color;

public class MainGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
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
	public MainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("BOOKINGROOM");
		frame.setBounds(100, 100, 458, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JButton btn_start = new JButton("");
		btn_start.setBounds(0, 0, 442, 389);
		btn_start.setBorder(null);
		btn_start.setBackground(new Color(0, 0, 0, 0));
		btn_start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginGUI login = new LoginGUI();
				frame.dispose();
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btn_start);
		
		
		
		ImageIcon icon = new ImageIcon("C:\\Users\\smhrd\\Downloads\\javaproject_semi (2)\\javaproject_semi\\image\\logo.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(442, 389, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(changeIcon);
		lblNewLabel.setBounds(0, 0, 442, 389);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		
	}
}
