package ClientLogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Client.ClientDAO;
import Client.ClientVO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

public class JoinGUI {

	private JFrame frame;
	private JTextField tf_ClientName;
	private JTextField tf_ClientPhonenumber;
	private JTextField tf_ClientPassword;
	private JTextField tf_ClientPasswordCheck;
	private JTextField tf_ClientAddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinGUI window = new JoinGUI();
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
	public JoinGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 240));
		frame.setTitle("회원가입");
		frame.setBounds(100, 100, 503, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("HY엽서L", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(219, 30, 115, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\uC774\uB984");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("HY엽서L", Font.BOLD, 15));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(87, 82, 115, 34);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\uD734\uB300\uD3F0 \uBC88\uD654");
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setFont(new Font("HY엽서L", Font.BOLD, 15));
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(87, 126, 115, 40);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setFont(new Font("HY엽서L", Font.BOLD, 15));
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(87, 176, 115, 34);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setFont(new Font("HY엽서L", Font.BOLD, 15));
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(87, 220, 115, 40);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\uC8FC\uC18C");
		label_4.setForeground(new Color(255, 255, 255));
		label_4.setFont(new Font("HY엽서L", Font.BOLD, 15));
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(87, 270, 115, 34);
		frame.getContentPane().add(label_4);
		
		tf_ClientName = new JTextField();
		tf_ClientName.setBounds(219, 89, 168, 21);
		frame.getContentPane().add(tf_ClientName);
		tf_ClientName.setColumns(10);
		
		tf_ClientPhonenumber = new JTextField();
		tf_ClientPhonenumber.setColumns(10);
		tf_ClientPhonenumber.setBounds(219, 136, 168, 21);
		frame.getContentPane().add(tf_ClientPhonenumber);
		
		tf_ClientPassword = new JTextField();
		tf_ClientPassword.setColumns(10);
		tf_ClientPassword.setBounds(219, 183, 168, 21);
		frame.getContentPane().add(tf_ClientPassword);
		
		tf_ClientPasswordCheck = new JTextField();
		tf_ClientPasswordCheck.setColumns(10);
		tf_ClientPasswordCheck.setBounds(219, 230, 168, 21);
		frame.getContentPane().add(tf_ClientPasswordCheck);
		
		tf_ClientAddress = new JTextField();
		tf_ClientAddress.setColumns(10);
		tf_ClientAddress.setBounds(219, 277, 168, 21);
		frame.getContentPane().add(tf_ClientAddress);
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 240));
		btnNewButton.setFont(new Font("HY엽서L", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tf_ClientName.getText(); //입력한 값을 변수에 담아야 겠다~
				String ph = tf_ClientPhonenumber.getText();
				String pw = tf_ClientPassword.getText();
				String pwcheck = tf_ClientPasswordCheck.getText();
				String ad = tf_ClientAddress.getText();
				
				
				if(pw.equals(pwcheck)) {
				ClientVO vo = new ClientVO(ph, pw, name, ad);
				ClientDAO dao = new ClientDAO();
				int cnt = dao.joinInsert(vo);
					if(cnt==1) 
						JOptionPane.showMessageDialog(null, "회원가입  성공");
						
				}else{
					JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.","회원가입", JOptionPane.ERROR_MESSAGE);
					tf_ClientPassword.setText("");
					tf_ClientPasswordCheck.setText("");
				}
				frame.dispose();
				LoginGUI dddd = new LoginGUI();
			}
		});
		btnNewButton.setBounds(87, 358, 115, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 255, 240));
		btnNewButton_1.setFont(new Font("HY엽서L", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				LoginGUI ssss = new LoginGUI();
			}
		});
		btnNewButton_1.setBounds(279, 358, 108, 34);
		frame.getContentPane().add(btnNewButton_1);
		
		ImageIcon icon = new ImageIcon("C:\\Users\\smhrd\\Downloads\\javaproject_semi (2)\\javaproject_semi\\image\\background.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(487, 423, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		JLabel lblNewLabel_1 = new JLabel(changeIcon);
		lblNewLabel_1.setBounds(0, 0, 487, 423);
		frame.getContentPane().add(lblNewLabel_1);
		
	}
}
