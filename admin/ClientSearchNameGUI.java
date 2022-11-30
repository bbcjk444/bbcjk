package admin;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Pay.PayDAO;
import Pay.PayVO;

public class ClientSearchNameGUI {

	private JFrame frame;
	private JTable table;
	JScrollPane scrollPane;

	String[] title = { "결제순서", "휴대폰번호", "이름", "좌석번호", "이용권구매시간", "시작시간", "끝난시간" };
	Object[][] data;
	Object[][] data1;
	private JTable table_1;
	Scanner sc = new Scanner(System.in);
	String textField1;
	int cnt = 0;
	
	private JTextField textField;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public ClientSearchNameGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 240));
		frame.setBounds(100, 100, 847, 551);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("회원조회 - 이름or휴대폰번호");
		frame.setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uC870\uD68C");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("HY엽서L", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(352, 10, 92, 48);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("HY엽서L", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(255, 255, 240));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminGUI gui = new AdminGUI(null);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(722, 469, 97, 33);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("\uD734\uB300\uD3F0OR\uC774\uB984");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(416, 72, 161, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setText("휴대폰번호 또는 이름을 입력하세요");
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1=textField.getText();
				
				
			}
		});

		// 1. 검색버튼 눌렀을때 입력한 값을 가져와서 새로운 변수명에 저장

		// 2. 날짜(0109), 9, 12 -> DB select
		// select ? from 테이블 명 (where -> 0109, 9<= , 12>=)
		// 가지고 온 값들을 새로운 변수에 저장

		// 3. DB로 부터 가져온 정보를 보여줄 판넬 영역 필요!
		// 판넬에 추가해서 띄워주기 -> get/변수명

		frame.setVisible(true);

		JButton btnNewButton_1 = new JButton("\uAC80\uC0C9");
		btnNewButton_1.setBackground(new Color(255, 255, 240));
		btnNewButton_1.setFont(new Font("HY엽서L", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PayDAO dao = new PayDAO();
				ArrayList<PayVO> list = dao.allSearch();
				data = new Object[list.size()][7];
				data1 = new Object[list.size()][7];

				for (int i = 0; i < list.size(); i++) {
					
					data[i][0] = list.get(i).getPaynum();
					data[i][1] = list.get(i).getPhonenumber();
					data[i][2] = list.get(i).getName();
					data[i][3] = list.get(i).getSeatnumber();
					data[i][4] = list.get(i).getPaytime();
					data[i][5] = list.get(i).getStarttime();
					data[i][6] = list.get(i).getEndtime();

				}
				for (int i = 0; i < list.size(); i++) {
					if (textField1.equals(data[i][1]) || textField1.equals(data[i][2])) {	
					data1[cnt][0] = data[i][0];
						data1[cnt][1] = data[i][1];
						data1[cnt][2] = data[i][2];
						data1[cnt][3] = data[i][3];
						data1[cnt][4] = data[i][4];
						data1[cnt][5] = data[i][5];
						data1[cnt][6] = data[i][6];
						cnt++;

					}	
				}
				table = new JTable(data1, title);
				table.setVisible(true);
				scrollPane = new JScrollPane(table);
				scrollPane.setBounds(45, 131, 730, 280);
				scrollPane.setVisible(true);
				frame.getContentPane().add(scrollPane);

			}
		});
		btnNewButton_1.setBounds(552, 72, 66, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
		textField.setBounds(79, 73, 365, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		ImageIcon icon = new ImageIcon("C:\\Users\\smhrd\\Downloads\\javaproject_semi (2)\\javaproject_semi\\image\\background.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(831, 512, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		JLabel lblNewLabel_2 = new JLabel(changeIcon);
		lblNewLabel_2.setBounds(0, 0, 831, 512);
		frame.getContentPane().add(lblNewLabel_2);
		
	}
}