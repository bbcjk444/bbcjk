package ClientLogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Client.ClientDAO;
import Client.ClientVO;
import ClientView.FirstVIewGUI;
import admin.AdminLogin;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class LoginGUI {

	private JFrame frame;
	private JTextField tf_LoginPN;
	private JPasswordField tf_LoginPW;

	/**
	 * Launch the application.
	 */

	

	/**
	 * Create the application.
	 */
	public LoginGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 240));
		frame.setTitle("로그인");
		frame.setBounds(100, 100, 545, 339);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("\uB85C\uADF8\uC778");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("HY엽서L", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(234, 50, 124, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\uD734\uB300\uC804\uD654 \uBC88\uD638");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("HY엽서L", Font.BOLD, 15));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(82, 102, 124, 42);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setFont(new Font("HY엽서L", Font.BOLD, 15));
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(82, 154, 124, 42);
		frame.getContentPane().add(label_1);
		
		tf_LoginPN = new JTextField();
		tf_LoginPN.setBounds(257, 113, 169, 21);
		frame.getContentPane().add(tf_LoginPN);
		tf_LoginPN.setColumns(10);
		
		JButton btn_Login = new JButton("\uB85C\uADF8\uC778");
		btn_Login.setForeground(new Color(0, 0, 0));
		btn_Login.setBackground(new Color(255, 255, 240));
		btn_Login.setFont(new Font("HY엽서L", Font.PLAIN, 15));
		btn_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tf_LoginPN.getText(); //입력한 값을 변수에 담아야 겠다~
				String pw = tf_LoginPW.getText();
						
				ClientVO vo = new ClientVO(id, pw);
				ClientDAO dao = new ClientDAO();
				boolean success = dao.loginSelect(vo);
				
				if (success==true) {
					FirstVIewGUI view = new FirstVIewGUI(vo, null, null);
					frame.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "ID나 PW가 맞지 않습니다.", "로그인", JOptionPane.ERROR_MESSAGE);
				}
			
			}
		});
		btn_Login.setBounds(126, 235, 97, 37);
		frame.getContentPane().add(btn_Login);
		
		JButton btn_Join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_Join.setForeground(new Color(0, 0, 0));
		btn_Join.setBackground(new Color(255, 255, 240));
		btn_Join.setFont(new Font("HY엽서L", Font.PLAIN, 15));
		btn_Join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				JoinGUI join = new JoinGUI();
				
				
			}
		});
		btn_Join.setBounds(294, 235, 97, 37);
		frame.getContentPane().add(btn_Join);
		
		JButton btnNewButton = new JButton("\uAD00\uB9AC\uC790");
		btnNewButton.setFont(new Font("HY엽서L", Font.PLAIN, 13));
		btnNewButton.setBackground(new Color(255, 255, 240));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin al = new AdminLogin();
				frame.dispose();
				
			}
		});
		btnNewButton.setBounds(432, 10, 85, 25);
		frame.getContentPane().add(btnNewButton);
		
		tf_LoginPW = new JPasswordField();
		tf_LoginPW.setBounds(257, 165, 169, 21);
		frame.getContentPane().add(tf_LoginPW);
		
		ImageIcon icon = new ImageIcon("C:\\Users\\smhrd\\Downloads\\javaproject_semi (2)\\javaproject_semi\\image\\background.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(614, 357, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		JLabel lblNewLabel_1 = new JLabel(changeIcon);
		lblNewLabel_1.setBounds(0, 0, 614, 357);
		frame.getContentPane().add(lblNewLabel_1);
		
		
	}
}
