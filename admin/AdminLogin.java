package admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Client.ClientDAO;
import Client.ClientVO;
import ClientLogin.LoginGUI;
import ClientView.FirstVIewGUI;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class AdminLogin {

	private JFrame frame;
	private JTextField tf_adminid;
	private JPasswordField tf_adminpw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin window = new AdminLogin();
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
	public AdminLogin() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("관리자 로그인");
		frame.getContentPane().setBackground(new Color(255, 255, 240));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAD00\uB9AC\uC790 \uB85C\uADF8\uC778");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("HY엽서L", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(120, 25, 194, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uAD00\uB9AC\uC790 \uC544\uC774\uB514");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("HY엽서L", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(57, 81, 116, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("\uBE44\uBC00\uBC88\uD638");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("HY엽서L", Font.BOLD, 15));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(77, 141, 96, 32);
		frame.getContentPane().add(label);
		
		tf_adminid = new JTextField();
		tf_adminid.setBounds(207, 87, 169, 21);
		frame.getContentPane().add(tf_adminid);
		tf_adminid.setColumns(10);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 240));
		btnNewButton.setFont(new Font("HY엽서L", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tf_adminid.getText(); //입력한 값을 변수에 담아야 겠다~
				String pw = tf_adminpw.getText();
				
				
				AdminVO vo = new AdminVO(id, pw);
				AdminDAO dao = new AdminDAO();
				AdminVO success = dao.loginSelect(vo);
				
				if (success!=null) {
					AdminGUI admin = new AdminGUI(vo);
					frame.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "ID나 PW가 맞지 않습니다.", "로그인", JOptionPane.ERROR_MESSAGE);
				}
				
				
				
				
			}
		});
		btnNewButton.setBounds(95, 206, 97, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 255, 240));
		btnNewButton_1.setFont(new Font("HY엽서L", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginGUI log = new LoginGUI();
				frame.dispose();
				
				
				
			}
		});
		btnNewButton_1.setBounds(234, 206, 97, 32);
		frame.getContentPane().add(btnNewButton_1);
		
		tf_adminpw = new JPasswordField();
		tf_adminpw.setBounds(207, 147, 169, 21);
		frame.getContentPane().add(tf_adminpw);
		
		
		ImageIcon icon = new ImageIcon("C:\\Users\\smhrd\\Downloads\\javaproject_semi (2)\\javaproject_semi\\image\\background.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(434, 261, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		JLabel lblNewLabel_2 = new JLabel(changeIcon);
		lblNewLabel_2.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
