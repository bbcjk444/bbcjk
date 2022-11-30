package Corona;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import admin.AdminDAO;
import admin.ClientSeat;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Corona1 {

	private JFrame frame;
	private JLabel lb_image;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 * @param btn_corona 
	 * @param corona 
	 */
	public Corona1(JLabel[] corona, JButton[] btn_corona) {
		initialize(corona, btn_corona);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param btn_corona 
	 * @param corona 
	 */
	private void initialize(JLabel[] corona, JButton[] btn_corona) {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(34, 139, 34));
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setTitle("ÄÚ·Î³ª 1´Ü°è");
		frame.setLocationRelativeTo(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(0, 0, 0));
		textArea.setBackground(new Color(255, 255, 255));
		textArea.setFont(new Font("HY¿±¼­L", Font.PLAIN, 15));
		textArea.setText("\uCF54\uB85C\uB098 1\uB2E8\uACC4 \uC900\uC218 \uC0AC\uD56D(\uC77C\uBC18\uAD00\uB9AC\uC2DC\uC124)\r\n\r\n(\uC77C\uBC18\uAD00\uB9AC\uC2DC\uC124) \uB9C8\uC2A4\uD06C \uCC29\uC6A9, \uCD9C\uC785\uC790 \uBA85\uB2E8 \uAD00\uB9AC, \r\n\uC8FC\uAE30\uC801 \uD658\uAE30,\uC18C\uB3C5\r\n\r\n\uAE30\uBCF8\uC218\uCE59 \uC758\uBB34\uD654, \uC704\uBC18 \uC2DC \uACFC\uD0DC\uB8CC \uBD80\uACFC\r\n");
		textArea.setBounds(12, 47, 410, 132);
		
		frame.getContentPane().add(textArea);
		

		
		  JButton btnNewButton = new JButton("\uD655\uC778");
		  btnNewButton.setFont(new Font("HY¿±¼­L", Font.BOLD, 17));
		  btnNewButton.setForeground(new Color(0, 0, 0));
			btnNewButton.setBackground(new Color(255, 255, 240));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ClientSeat seat = new ClientSeat();
					frame.dispose();
									
				}
			});
			btnNewButton.setBounds(165, 210, 97, 23);
			frame.getContentPane().add(btnNewButton);
			btnNewButton.setBorderPainted(false);
			btnNewButton.setContentAreaFilled(false);
			btnNewButton.setFocusPainted(false);
	
			textArea.setBorder(null);
		
		JLabel lblNewLabel = new JLabel("\uCF54\uB85C\uB098 1\uB2E8\uACC4 \uC815\uBD80 \uC9C0\uCE68");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("HY¿±¼­L", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(94, 10, 247, 27);
		frame.getContentPane().add(lblNewLabel);
		
		ImageIcon icon = new ImageIcon("C:\\Users\\smhrd\\Downloads\\javaproject_semi (2)\\javaproject_semi\\image\\background.png");
	      Image img = icon.getImage();
	      Image changeImg = img.getScaledInstance(613, 357, Image.SCALE_SMOOTH); // Å©±âÁ¶Àý (³ÐÀÌ, ³ôÀÌ)
	      ImageIcon changeIcon = new ImageIcon(changeImg);
	      lb_image = new JLabel(changeIcon);
	      frame.getContentPane().add(lb_image);
	      lb_image.setBounds(0, 0, 434, 261);
	      frame.getContentPane().add(lb_image);
		
	    
}}
