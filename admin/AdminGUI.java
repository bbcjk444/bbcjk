package admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import ClientLogin.LoginGUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class AdminGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 * @param vo 
	 */
	public AdminGUI(AdminVO vo) {
		initialize(vo);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param vo 
	 */
	private void initialize(AdminVO vo) {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 240));
		frame.setBounds(100, 100, 329, 239);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("°ü¸®ÀÚ¸ðµå");
		frame.setLocationRelativeTo(null);
		
		JButton btn_clientSearch = new JButton("\uD68C\uC6D0\uC870\uD68C");
		btn_clientSearch.setForeground(new Color(0, 0, 0));
		btn_clientSearch.setFont(new Font("HY¿±¼­L", Font.PLAIN, 15));
		btn_clientSearch.setBackground(new Color(255, 255, 240));
		btn_clientSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SearchMenu menu = new SearchMenu();
				frame.dispose();
								
			}
		});
		btn_clientSearch.setBounds(29, 80, 123, 72);
		frame.getContentPane().add(btn_clientSearch);
		
		
		JButton btn_seatSearch = new JButton("\uC88C\uC11D\uC870\uD68C");
		btn_seatSearch.setFont(new Font("HY¿±¼­L", Font.PLAIN, 15));
		btn_seatSearch.setBackground(new Color(255, 255, 240));
		btn_seatSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClientSeat seat = new ClientSeat();
				frame.dispose();
			}
		});
		btn_seatSearch.setBounds(164, 80, 123, 72);
		frame.getContentPane().add(btn_seatSearch);
		
		JLabel lblNewLabel = new JLabel("\uAD00\uB9AC\uC790 \uBAA8\uB4DC");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("HY¿±¼­L", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(85, 10, 137, 44);
		frame.getContentPane().add(lblNewLabel);
		
		//"C:\\Users\\smhrd\\Desktop\\\uC774\uBBF8\uC9C0\\\uC2A4\uD130\uB5142.png"
		ImageIcon icon = new ImageIcon("C:\\Users\\smhrd\\Downloads\\javaproject_semi (2)\\javaproject_semi\\image\\background.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(487, 423, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		JLabel lblNewLabel_1 = new JLabel(changeIcon);
		lblNewLabel_1.setBounds(0, 0, 313, 200);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
