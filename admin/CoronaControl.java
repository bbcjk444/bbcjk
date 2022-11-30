package admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Corona.Corona1;
import Corona.Corona15;
import Corona.Corona2;
import Corona.Corona25;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class CoronaControl {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 * @param btn_corona 
	 * @param corona 
	 */
	public CoronaControl(JLabel[] corona, JButton[] btn_corona) {
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
		frame.setTitle("ÄÚ·Î³ª ´Ü°èº° °ü¸®");
		frame.getContentPane().setBackground(new Color(255, 255, 240));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("\uCF54\uB85C\uB098 \uB2E8\uACC4\uBCC4 \uC88C\uC11D \uAD00\uB9AC");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("HY¿±¼­L", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(113, 53, 201, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button = new JButton("\uC0AC\uD68C\uC801 \uAC70\uB9AC\uB450\uAE30 1.5\uB2E8\uACC4");
		button.setBackground(new Color(255, 255, 240));
		button.setFont(new Font("HY¿±¼­L", Font.PLAIN, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Corona15 corona11 = new Corona15(corona, btn_corona);
				frame.dispose();
				
			}
		});
		button.setBounds(226, 110, 178, 44);
		frame.getContentPane().add(button);
		
		JButton button_3 = new JButton("\uC0AC\uD68C\uC801 \uAC70\uB9AC\uB450\uAE30 1\uB2E8\uACC4");
		button_3.setFont(new Font("HY¿±¼­L", Font.PLAIN, 12));
		button_3.setBackground(new Color(255, 255, 240));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Corona1 corona11 = new Corona1(corona, btn_corona);
				frame.dispose();
				
				
				
				
			}
		});
		button_3.setBounds(22, 110, 178, 44);
		frame.getContentPane().add(button_3);
		
		JButton button_1 = new JButton("\uC0AC\uD68C\uC801 \uAC70\uB9AC\uB450\uAE30 2\uB2E8\uACC4");
		button_1.setBackground(new Color(255, 255, 240));
		button_1.setFont(new Font("HY¿±¼­L", Font.PLAIN, 12));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Corona2 corona11 = new Corona2(corona, btn_corona);
				frame.dispose();
			}
		});
		button_1.setBounds(22, 185, 178, 44);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\uC0AC\uD68C\uC801 \uAC70\uB9AC\uB450\uAE30 2.5\uB2E8\uACC4");
		button_2.setBackground(new Color(255, 255, 240));
		button_2.setFont(new Font("HY¿±¼­L", Font.PLAIN, 12));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Corona25 corona11 = new Corona25(corona, btn_corona);
				frame.dispose();
			}
		});
		button_2.setBounds(226, 185, 178, 44);
		frame.getContentPane().add(button_2);
		
		
		ImageIcon icon = new ImageIcon("C:\\Users\\smhrd\\Downloads\\javaproject_semi (2)\\javaproject_semi\\image\\background.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(487, 423, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		JLabel lblNewLabel_1 = new JLabel(changeIcon);
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
