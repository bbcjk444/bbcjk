package Corona;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import admin.AdminDAO;
import admin.ClientSeat;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class Corona25 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 * @param btn_corona 
	 * @param corona 
	 */
	public Corona25(JLabel[] corona, JButton[] btn_corona) {
		initialize(corona, btn_corona);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(JLabel[] corona, JButton[] btn_corona) {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setTitle("ÄÚ·Î³ª 2.5´Ü°è");
		frame.setLocationRelativeTo(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("HY¿±¼­L", Font.PLAIN, 15));
		textArea.setBackground(new Color(255, 255, 255));
		textArea.setText("\uCF54\uB85C\uB098 2.5\uB2E8\uACC4 \uC900\uC218 \uC0AC\uD56D(\uC77C\uBC18\uAD00\uB9AC\uC2DC\uC124)\r\n\r\n\uB3C5\uC11C\uC2E4, \uC2A4\uD130\uB514\uCE74\uD398\uC640 \uAC19\uC740 \uC77C\uBC18\uAD00\uB9AC\uC2DC\uC124\uC740\r\n\r\n**21\uC2DC \uC774\uD6C4 \uC6B4\uC601 \uC911\uB2E8\r\n**\uC74C\uC2DD \uC12D\uCDE8 \uAE08\uC9C0(\uCE78\uB9C9\uC774 \uB0B4\uC5D0\uC11C \uAC1C\uBCC4 \uC12D\uCDE8 \uC2DC \uC81C\uC678)\r\n**\uC88C\uC11D \uD55C \uCE78 \uB744\uC6B0\uAE30(\uCE78\uB9C9\uC774 \uC788\uB294 \uACBD\uC6B0 \uC81C\uC678)\r\n**\uB2E8\uCCB4\uB8F8\uC740 50%\uB85C \uC778\uC6D0 \uC81C\uD55C");
		textArea.setBounds(12, 47, 410, 171);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.setFont(new Font("HY¿±¼­L", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(34, 139, 34));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClientSeat seat = new ClientSeat();
				AdminDAO dao = new AdminDAO();
				dao.corona(corona, btn_corona);
							
				
				frame.dispose();
					
			}
		});
		btnNewButton.setBounds(164, 228, 97, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFocusPainted(false);
		
		JLabel lblNewLabel = new JLabel("\uCF54\uB85C\uB098 2.5\uB2E8\uACC4 \uC815\uBD80 \uC9C0\uCE68");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("HY¿±¼­L", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(92, 10, 263, 27);
		frame.getContentPane().add(lblNewLabel);
		
		
		ImageIcon icon = new ImageIcon("C:\\Users\\smhrd\\Downloads\\javaproject_semi (2)\\javaproject_semi\\image\\background.png");
	      Image img = icon.getImage();
	      Image changeImg = img.getScaledInstance(613, 357, Image.SCALE_SMOOTH); // Å©±âÁ¶Àý (³ÐÀÌ, ³ôÀÌ)
	      ImageIcon changeIcon = new ImageIcon(changeImg);
	      lblNewLabel = new JLabel(changeIcon);
	      frame.getContentPane().add(lblNewLabel);
	      lblNewLabel.setBounds(0, 0, 434, 261);
	      frame.getContentPane().add(lblNewLabel);
		
	}

}
