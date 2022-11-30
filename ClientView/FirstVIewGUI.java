package ClientView;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Client.ClientVO;
import ClientLogin.LoginGUI;
import ClientLogin.RoomClient1;
import Pay.PayVO;
import Seat.SeatDAO;
import Seat.SeatVO;

public class FirstVIewGUI {

	private JFrame frame;
	private JLabel lb_image;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 * @param sVO 
	 */
	public FirstVIewGUI(ClientVO vo, PayVO pVO, SeatVO sVO) {
		initialize(vo, pVO, sVO);
		frame.setVisible(true);
		
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 * @param sVO 
	 */
	private void initialize(ClientVO vo, PayVO pVO, SeatVO sVO) {
		
	
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setBounds(100, 100, 542, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		frame.setTitle("¸Þ´º¼±ÅÃ");
		frame.getContentPane().setLayout(null);
		
		JButton btn_timepay = new JButton("\uC2DC\uAC04 \uACB0\uC81C\uD558\uAE30");
		btn_timepay.setFont(new Font("HY¿±¼­L", Font.PLAIN, 17));
		btn_timepay.setBackground(new Color(255, 255, 240));
		btn_timepay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TimePayGUI pay = new TimePayGUI(vo);
				frame.dispose();
								
			}
		});
		btn_timepay.setBounds(57, 121, 197, 99);
		frame.getContentPane().add(btn_timepay);
		
		JButton btn_seatchoose = new JButton("\uC88C\uC11D \uC120\uD0DD\uD558\uAE30");
		btn_seatchoose.setFont(new Font("HY¿±¼­L", Font.PLAIN, 17));
		btn_seatchoose.setBackground(new Color(255, 255, 240));
		btn_seatchoose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RoomClient1 book = new RoomClient1(vo);
				frame.dispose();
				
				
			}
		});
		btn_seatchoose.setBounds(282, 121, 197, 99);
		frame.getContentPane().add(btn_seatchoose);
		
		JButton btn_out = new JButton("\uD1F4\uC2E4\uD558\uAE30");
		btn_out.setFont(new Font("HY¿±¼­L", Font.PLAIN, 17));
		btn_out.setBackground(new Color(255, 255, 240));
		btn_out.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			SeatDAO sdao = new SeatDAO();
			SeatVO sVO1 = sdao.out(vo, pVO, sVO);
			if (sVO1 != null) {
				JOptionPane.showMessageDialog(null, "Åð½ÇÃ³¸®°¡ ¿Ï·áµÇ¾ú½À´Ï´Ù.");
				frame.dispose();
			}
			
			
			}
		});
		btn_out.setBounds(57, 230, 197, 99);
		frame.getContentPane().add(btn_out);
		
		JButton button = new JButton("\uB85C\uADF8\uC778 \uD398\uC774\uC9C0\uB85C \uC774\uB3D9");
		button.setFont(new Font("HY¿±¼­L", Font.PLAIN, 15));
		button.setBackground(new Color(255, 255, 240));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginGUI login = new LoginGUI();
				frame.dispose();
				
				
			}
		});
		button.setBounds(282, 230, 197, 99);
		frame.getContentPane().add(button);
		
		JLabel lblNewLabel = new JLabel("\uC5B4\uB5A4 \uBA54\uB274\uB97C \uC120\uD0DD\uD558\uC2DC\uACA0\uC2B5\uB2C8\uB2E4?");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("HY¿±¼­L", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(97, 31, 341, 45);
		frame.getContentPane().add(lblNewLabel);
		
		ImageIcon icon = new ImageIcon("C:\\Users\\smhrd\\Downloads\\javaproject_semi (2)\\javaproject_semi\\image\\background.png");
	    Image img = icon.getImage();
	    Image changeImg = img.getScaledInstance(526, 401, Image.SCALE_SMOOTH); // Å©±âÁ¶Àý (³ÐÀÌ, ³ôÀÌ)
	    ImageIcon changeIcon = new ImageIcon(changeImg);
	    lb_image = new JLabel(changeIcon);
	    frame.getContentPane().add(lb_image);
	    lb_image.setBounds(0, 0, 526, 401);
	    frame.getContentPane().add(lb_image);
		
		
	}

}
