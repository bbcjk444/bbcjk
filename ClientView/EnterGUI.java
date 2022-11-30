package ClientView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Client.ClientVO;
import Pay.PayVO;
import Seat.SeatDAO;
import Seat.SeatVO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class EnterGUI {

	private JFrame frame;
	private JLabel lb_image;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 * @param vo 
	 * @param pVO 
	 */
	public EnterGUI(ClientVO vo, PayVO pVO) {
		initialize(vo, pVO);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param pVO 
	 * @param vo 
	 * @param pVO 
	 */
	private void initialize(ClientVO vo, PayVO pVO) {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setBounds(100, 100, 291, 228);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("입실");
		frame.setLocationRelativeTo(null);
		
		JButton btnNewButton = new JButton("\uC785\uC2E4\uD558\uAE30");
		btnNewButton.setFont(new Font("HY엽서L", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(255, 255, 240));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SeatDAO sdao = new SeatDAO();
				SeatVO sVO = sdao.enter(vo, pVO);
				if (sVO!=null)
					JOptionPane.showMessageDialog(null, "입실이 완료되었습니다.");
					FirstVIewGUI frist = new FirstVIewGUI(vo, pVO, sVO);
					frame.dispose();
			}
		});
		btnNewButton.setBounds(12, 81, 252, 89);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uC785\uC2E4\uD558\uC2DC\uACA0\uC2B5\uB2C8\uAE4C?");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("HY엽서L", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(41, 21, 189, 50);
		frame.getContentPane().add(lblNewLabel);
		
		
		ImageIcon icon = new ImageIcon("C:\\Users\\smhrd\\Downloads\\javaproject_semi (2)\\javaproject_semi\\image\\background.png");
	    Image img = icon.getImage();
	    Image changeImg = img.getScaledInstance(291, 228, Image.SCALE_SMOOTH); // 크기조절 (넓이, 높이)
	    ImageIcon changeIcon = new ImageIcon(changeImg);
	    lb_image = new JLabel(changeIcon);
	    frame.getContentPane().add(lb_image);
	    lb_image.setBounds(0, 0, 291, 228);
	    frame.getContentPane().add(lb_image);
	}
}
