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

import Client.ClientDAO;
import Client.ClientVO;
public class ClientSearchGUI {

	private JFrame frame;
	private JTextField tf_year;
	private JTextField tf_month;
	private JTextField tf_day;
	private JTextField tf_hour;
	private JTextField tf_minute;
	private JTable table;
	JScrollPane scrollPane;
	private JTextField tf_hour1;
	private JTextField tf_minute1;

	
	String[] title = {"전화번호","이름","주소","시간","시작시간","끝난시간"};
	Object[][] data;
	private JTable table_1;
	Scanner sc = new Scanner(System.in);
	private JTextField tf_second;
	private JTextField tf_second1;
	
	String year1;
	String month1;
	String day1;
	String hour1;
	String minutes1;
	String seconds1;
	String hours1;
	String minutess1;
	String secondss1;
	
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public ClientSearchGUI() {
		initialize();
		frame.setVisible(true);
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
		frame.setTitle("회원조회 - 시간");
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uC870\uD68C");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("HY엽서L", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(376, 10, 92, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("HY엽서L", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 255, 240));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminGUI admin = new AdminGUI(null);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(722, 469, 97, 33);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("\uB144\uB3C4");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(123, 76, 34, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC6D4");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(193, 76, 20, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\uC77C");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setBounds(251, 76, 20, 15);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("\uC2DC");
		lblNewLabel_2_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_3.setBounds(309, 76, 20, 15);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("\uBD84");
		lblNewLabel_2_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_4.setBounds(373, 76, 20, 15);
		frame.getContentPane().add(lblNewLabel_2_4);
		
		
		
		
		tf_year = new JTextField();
		tf_year.setBounds(34, 73, 83, 21);
		frame.getContentPane().add(tf_year);
		tf_year.setColumns(10);
		tf_year.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 year1 = tf_year.getText();
				
			}
		});


		tf_month = new JTextField();
		tf_month.setColumns(10);
		tf_month.setBounds(154, 73, 34, 21);
		frame.getContentPane().add(tf_month);
		tf_month.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				month1 = tf_month.getText();
				
			}
		});
		
		tf_day = new JTextField();
		tf_day.setColumns(10);
		tf_day.setBounds(214, 73, 34, 21);
		frame.getContentPane().add(tf_day);
		tf_day.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day1 = tf_day.getText();
				
			}
		});
		
		tf_hour = new JTextField();
		tf_hour.setBounds(265, 73, 41, 21);
		frame.getContentPane().add(tf_hour);
		tf_hour.setColumns(10);
		tf_hour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 hour1 = tf_hour.getText();
				
			}
		});
		
		tf_minute = new JTextField();
		tf_minute.setBounds(329, 73, 41, 21);
		frame.getContentPane().add(tf_minute);
		tf_minute.setColumns(10);
		tf_minute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minutes1 = tf_minute.getText();
				
			}
		});
		
		
		
		JLabel lblNewLabel_3 = new JLabel("~");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(468, 76, 20, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		tf_hour1 = new JTextField();
		tf_hour1.setColumns(10);
		tf_hour1.setBounds(494, 73, 41, 21);
		frame.getContentPane().add(tf_hour1);
		tf_hour1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hours1 = tf_hour1.getText();
				
			}
		});
		
		JLabel lblNewLabel_2_3_1 = new JLabel("\uC2DC");
		lblNewLabel_2_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_3_1.setBounds(538, 76, 20, 15);
		frame.getContentPane().add(lblNewLabel_2_3_1);
		
		tf_minute1 = new JTextField();
		tf_minute1.setColumns(10);
		tf_minute1.setBounds(559, 73, 41, 21);
		frame.getContentPane().add(tf_minute1);
		tf_minute1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minutess1 = tf_minute1.getText();
				
			}
		});
		
		frame.setVisible(true);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("\uBD84");
		lblNewLabel_2_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_4_1.setBounds(605, 76, 20, 15);
		frame.getContentPane().add(lblNewLabel_2_4_1);
		
		
		JButton btn_search = new JButton("\uAC80\uC0C9");
		btn_search.setBackground(new Color(255, 255, 240));
		btn_search.setFont(new Font("HY엽서L", Font.PLAIN, 12));
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String year = tf_year.getText();
				String month = tf_month.getText();
				String day = tf_day.getText();
				String hour = tf_hour.getText();
				String minute = tf_minute.getText();
				String second = tf_second.getText();
				String hour1 = tf_hour1.getText();
				String minute1 = tf_minute1.getText();
				String second1 = tf_second1.getText();
				String start = year+month+day+hour+minute+second;
				String end = year+month+day+hour1+minute1+second1;
			
				
				ClientDAO dao = new ClientDAO();
				
				if (year=="2021") {
					
				
					ArrayList<ClientVO> list = dao.allSearch(start, end);
					ArrayList<String> list1 = new ArrayList<String>();
					
					
					// 1. 검색버튼 눌렀을때 입력한 값을 가져와서 새로운 변수명에 저장
					
					// 2. 날짜(0109), 9, 12 -> DB select
					//select ? from 테이블 명 (where -> 0109, 9<= , 12>=)
					// 가지고 온 값들을 새로운 변수에 저장
					
					// 3. DB로 부터 가져온 정보를 보여줄 판넬 영역 필요!
					// 판넬에 추가해서 띄워주기 -> get/변수명
									
					data = new Object[list.size()][6];
					
					for(int i = 0; i < list.size(); i++) {
						
						data[i][0] = list.get(i).getPhonenumber();
						data[i][1] = list.get(i).getName();
						data[i][2] = list.get(i).getAddress();
						data[i][3] = list.get(i).getPaytime();
						data[i][4] = list.get(i).getStarttime();
						data[i][5] = list.get(i).getEndtime();
					}
									
					table = new JTable(data, title);
					table.setVisible(true);
					scrollPane = new JScrollPane(table);
					scrollPane.setBounds(45, 131, 730, 280);
					scrollPane.setVisible(true);
					frame.getContentPane().add(scrollPane);}
				
				else {
					
					ArrayList<ClientVO> list = dao.allSearch();
					ArrayList<String> list1 = new ArrayList<String>();
					
					
					// 1. 검색버튼 눌렀을때 입력한 값을 가져와서 새로운 변수명에 저장
					
					// 2. 날짜(0109), 9, 12 -> DB select
					//select ? from 테이블 명 (where -> 0109, 9<= , 12>=)
					// 가지고 온 값들을 새로운 변수에 저장
					
					// 3. DB로 부터 가져온 정보를 보여줄 판넬 영역 필요!
					// 판넬에 추가해서 띄워주기 -> get/변수명
									
					data = new Object[list.size()][6];
					
					for(int i = 0; i < list.size(); i++) {
						
						data[i][0] = list.get(i).getPhonenumber();
						data[i][1] = list.get(i).getName();
						data[i][2] = list.get(i).getAddress();
						data[i][3] = list.get(i).getPaytime();
						data[i][4] = list.get(i).getStarttime();
						data[i][5] = list.get(i).getEndtime();

					}
									
					table = new JTable(data, title);
					table.setVisible(true);
					scrollPane = new JScrollPane(table);
					scrollPane.setBounds(45, 131, 730, 280);
					scrollPane.setVisible(true);
					frame.getContentPane().add(scrollPane);
					
				
				
				
			}}
		});
		btn_search.setBounds(699, 72, 66, 23);
		frame.getContentPane().add(btn_search);
		
		tf_second = new JTextField();
		tf_second.setColumns(10);
		tf_second.setBounds(403, 73, 41, 21);
		frame.getContentPane().add(tf_second);
		tf_second.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 seconds1 = tf_second.getText();
				
			}
		});
		
		JLabel lblNewLabel_2_5 = new JLabel("\uCD08");
		lblNewLabel_2_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_5.setBounds(448, 76, 20, 15);
		frame.getContentPane().add(lblNewLabel_2_5);
		
		tf_second1 = new JTextField();
		tf_second1.setColumns(10);
		tf_second1.setBounds(626, 73, 41, 21);
		frame.getContentPane().add(tf_second1);
		tf_second1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondss1 = tf_second1.getText();
				
			}
		});
		
		JLabel lblNewLabel_2_4_2 = new JLabel("\uCD08");
		lblNewLabel_2_4_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_4_2.setBounds(671, 76, 20, 15);
		frame.getContentPane().add(lblNewLabel_2_4_2);
		
		
		ImageIcon icon = new ImageIcon("C:\\Users\\smhrd\\Downloads\\javaproject_semi (2)\\javaproject_semi\\image\\background.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance( 847, 551, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		JLabel lblNewLabel_4 = new JLabel(changeIcon);
		lblNewLabel_4.setBounds(0, 0, 831, 512);
		frame.getContentPane().add(lblNewLabel_4);
		

		System.out.println(year1 + month1 + day1 + hour1 + minutes1 + seconds1);
	}
	}

