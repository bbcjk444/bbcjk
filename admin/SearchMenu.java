package admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class SearchMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public SearchMenu() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 240));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("È¸¿øÁ¶È¸");
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0 \uC870\uD68C\uD558\uAE30");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("HY¿±¼­L", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(124, 13, 185, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uC2DC\uAC04\uC73C\uB85C \uC870\uD68C\uD558\uAE30");
		btnNewButton.setFont(new Font("HY¿±¼­L", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(255, 255, 240));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			ClientSearchGUI gui = new ClientSearchGUI();
			frame.dispose();
			}
		});
		btnNewButton.setBounds(61, 73, 317, 44);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\uC774\uB984 \uBC0F \uD578\uB4DC\uD3F0 \uBC88\uD638\uB85C \uC870\uD68C\uD558\uAE30");
		button.setBackground(new Color(255, 255, 240));
		button.setFont(new Font("HY¿±¼­L", Font.PLAIN, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClientSearchNameGUI gui = new ClientSearchNameGUI();
				frame.dispose();
			}
		});
		button.setBounds(61, 146, 317, 44);
		frame.getContentPane().add(button);
		
		JButton btnNewButton_1 = new JButton("\uB4A4\uB85C \uAC00\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminGUI admingui = new AdminGUI(null);
				frame.dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 255, 240));
		btnNewButton_1.setFont(new Font("HY¿±¼­L", Font.PLAIN, 15));
		btnNewButton_1.setBounds(315, 218, 107, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		
		ImageIcon icon = new ImageIcon("C:\\Users\\smhrd\\Downloads\\javaproject_semi (2)\\javaproject_semi\\image\\background.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(434, 261, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		JLabel lblNewLabel_1 = new JLabel(changeIcon);
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
