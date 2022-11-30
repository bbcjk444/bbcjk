package ClientLogin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Client.ClientVO;
import ClientView.EnterGUI;
import ClientView.FirstVIewGUI;
import Pay.PayDAO;
import Pay.PayVO;
import Seat.SeatVO;
import admin.AdminDAO;
import admin.AdminGUI;

public class RoomClient1 {

	private JFrame frame;
	private JLabel lb_corona1;
	private JLabel lb_corona8;
	private JButton btn_seat_05;
	private JButton btn_seat_06;
	private JButton btn_seat_07;
	private JButton btn_seat_08;
	private JLabel lb_corona5;
	private JLabel lb_corona6;
	private JLabel lb_corona7;
	private JButton btn_seat_01;
	private JLabel lb_corona2;
	private JLabel lb_corona4;
	private JLabel lb_corona10;
	private JLabel lb_corona12;
	private JButton btn_seat_02;
	private JButton btn_seat_03;
	private JButton btn_seat_04;
	private JButton btn_seat_09;
	private JButton btn_seat_12;
	private JButton btn_seat_10;
	private JButton btn_seat_11;
	private JButton btn_seat_13;
	private JButton btn_seat_14;
	private JButton btn_seat_15;
	private JButton btn_seat_16;
	private JButton btn_seat_17;
	private JButton btn_seat_18;
	private JButton btn_seat_19;
	private JButton btn_seat_20;
	private JButton btn_seat_21;
	private JButton btn_seat_22;
	private JButton btn_seat_23;
	private JButton btn_seat_24;
	private JButton btn_seat_25;

	private JLabel lb_corona3;

	private JLabel lb_corona9;

	private JLabel lb_corona11;

	private JLabel lb_corona17;

	private JLabel lb_corona16;

	private JLabel lb_corona15;

	private JLabel lb_corona14;

	private JLabel lb_corona13;

	private JLabel lb_corona18;

	private JLabel lb_corona19;

	private JLabel lb_corona20;

	private JLabel lb_corona21;

	private JLabel lb_corona22;

	private JLabel lb_corona23;

	private JLabel lb_corona25;

	private JLabel lb_corona24;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 * @param vo 
	 */
	
	
	
	AdminDAO dao = new AdminDAO();
	
	public RoomClient1(ClientVO vo) {
		initialize(vo);
		frame.setVisible(true);
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @param vo 
	 * @wbp.parser.entryPoint
	 */
	private void initialize(ClientVO vo) {
		frame = new JFrame();
		frame.setTitle("좌석선택");
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 927, 658);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		// 확인 버튼
		JButton btn_check = new JButton("\uD655\uC778");
		btn_check.setForeground(new Color(0, 0, 0));
		btn_check.setFont(new Font("HY엽서L", Font.PLAIN, 15));
		btn_check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FirstVIewGUI first = new FirstVIewGUI(vo, null, null);
				frame.dispose();
			}
		});
		btn_check.setBackground(new Color(255, 255, 240));
		
		btn_check.setBounds(799, 562, 97, 30);
		frame.getContentPane().add(btn_check);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 240));
		panel.setBounds(307, 158, 78, 76);
		frame.getContentPane().add(panel);

		btn_seat_01 = new JButton("\uC88C\uC11D01");
		btn_seat_01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 1;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		panel.add(btn_seat_01);
		btn_seat_01.setBackground(new Color(255, 255, 255));
	
		lb_corona1 = new JLabel("");
		panel.add(lb_corona1);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 240));
		panel_1.setBounds(307, 291, 78, 76);
		frame.getContentPane().add(panel_1);

		btn_seat_08 = new JButton("\uC88C\uC11D08");
		btn_seat_08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 8;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		panel_1.add(btn_seat_08);
		btn_seat_08.setBackground(new Color(255, 255, 255));
	

		lb_corona8 = new JLabel("");
		panel_1.add(lb_corona8);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(255, 255, 240));
		panel_1_1.setBounds(408, 291, 81, 73);
		frame.getContentPane().add(panel_1_1);

		btn_seat_07 = new JButton("\uC88C\uC11D07");
		btn_seat_07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 7;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		panel_1_1.add(btn_seat_07);
		btn_seat_07.setBackground(new Color(255, 255, 255));
		

		lb_corona7 = new JLabel("");
		panel_1_1.add(lb_corona7);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(255, 255, 240));
		panel_1_2.setBounds(567, 291, 78, 76);
		frame.getContentPane().add(panel_1_2);

		btn_seat_06 = new JButton("\uC88C\uC11D06");
		btn_seat_06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 6;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		panel_1_2.add(btn_seat_06);
		btn_seat_06.setBackground(new Color(255, 255, 255));
	

		lb_corona6 = new JLabel("");
		panel_1_2.add(lb_corona6);

		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(new Color(255, 255, 240));
		panel_1_3.setBounds(670, 291, 81, 76);
		frame.getContentPane().add(panel_1_3);

		btn_seat_05 = new JButton("\uC88C\uC11D05");
		btn_seat_05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 5;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		panel_1_3.add(btn_seat_05);
		btn_seat_05.setBackground(new Color(255, 255, 255));
	

		lb_corona5 = new JLabel("");
		panel_1_3.add(lb_corona5);

		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBackground(new Color(255, 255, 240));
		panel_1_4.setBounds(411, 158, 78, 73);
		frame.getContentPane().add(panel_1_4);

		btn_seat_02 = new JButton("\uC88C\uC11D02");
		btn_seat_02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 2;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_02.setBackground(Color.WHITE);
	
		panel_1_4.add(btn_seat_02);

		lb_corona2 = new JLabel("");
		panel_1_4.add(lb_corona2);

		JPanel panel_1_5 = new JPanel();
		panel_1_5.setBackground(new Color(255, 255, 240));
		panel_1_5.setBounds(567, 158, 78, 76);
		frame.getContentPane().add(panel_1_5);

		btn_seat_03 = new JButton("\uC88C\uC11D03");
		btn_seat_03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 3;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_03.setBackground(Color.WHITE);
	
		panel_1_5.add(btn_seat_03);

		JLabel lb_corona3 = new JLabel("");
		panel_1_5.add(lb_corona3);

		JPanel panel_1_5_1 = new JPanel();
		panel_1_5_1.setBackground(new Color(255, 255, 240));
		panel_1_5_1.setBounds(670, 158, 81, 76);
		frame.getContentPane().add(panel_1_5_1);

		btn_seat_04 = new JButton("\uC88C\uC11D04");
		btn_seat_04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 4;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_04.setBackground(Color.WHITE);
	
		
		panel_1_5_1.add(btn_seat_04);

		lb_corona4 = new JLabel("");
		panel_1_5_1.add(lb_corona4);

		JPanel panel_1_5_2 = new JPanel();
		panel_1_5_2.setBackground(new Color(255, 255, 240));
		panel_1_5_2.setBounds(307, 410, 83, 76);
		frame.getContentPane().add(panel_1_5_2);

		btn_seat_09 = new JButton("\uC88C\uC11D09");
		btn_seat_09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 9;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_09.setBackground(Color.WHITE);
	
		panel_1_5_2.add(btn_seat_09);

		JLabel lb_corona9 = new JLabel("");
		panel_1_5_2.add(lb_corona9);

		JPanel panel_1_5_3 = new JPanel();
		panel_1_5_3.setBackground(new Color(255, 255, 240));
		panel_1_5_3.setBounds(307, 516, 83, 76);
		frame.getContentPane().add(panel_1_5_3);

		btn_seat_12 = new JButton("\uC88C\uC11D12");
		btn_seat_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 12;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_12.setBackground(Color.WHITE);
	
		panel_1_5_3.add(btn_seat_12);

		lb_corona12 = new JLabel("");
		panel_1_5_3.add(lb_corona12);

		JPanel panel_1_5_4 = new JPanel();
		panel_1_5_4.setBackground(new Color(255, 255, 240));
		panel_1_5_4.setBounds(408, 410, 81, 76);
		frame.getContentPane().add(panel_1_5_4);

		btn_seat_10 = new JButton("\uC88C\uC11D10");
		btn_seat_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 10;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_10.setBackground(Color.WHITE);
	
		panel_1_5_4.add(btn_seat_10);

		lb_corona10 = new JLabel("");
		panel_1_5_4.add(lb_corona10);

		JPanel panel_1_5_5 = new JPanel();
		panel_1_5_5.setBackground(new Color(255, 255, 240));
		panel_1_5_5.setBounds(408, 516, 81, 76);
		frame.getContentPane().add(panel_1_5_5);

		btn_seat_11 = new JButton("\uC88C\uC11D11");
		btn_seat_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 11;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_11.setBackground(Color.WHITE);
	
		panel_1_5_5.add(btn_seat_11);

		JLabel lb_corona11 = new JLabel("");
		panel_1_5_5.add(lb_corona11);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 240));
		panel_2.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_2.setBounds(799, 10, 81, 76);
		frame.getContentPane().add(panel_2);
		
		btn_seat_13 = new JButton("\uC88C\uC11D13");
		btn_seat_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 13;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_13.setBackground(Color.WHITE);
	
		panel_2.add(btn_seat_13);
		
		JLabel lb_corona13 = new JLabel("");
		panel_2.add(lb_corona13);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 240));
		panel_3.setBounds(709, 10, 78, 76);
		panel_3.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.getContentPane().add(panel_3);
		
		btn_seat_14 = new JButton("\uC88C\uC11D14");
		btn_seat_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 14;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_14.setBackground(Color.WHITE);
	
		panel_3.add(btn_seat_14);
		
		JLabel lb_corona14 = new JLabel("");
		panel_3.add(lb_corona14);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 240));
		panel_4.setBounds(619, 10, 78, 76);
		frame.getContentPane().add(panel_4);
		
		btn_seat_15 = new JButton("\uC88C\uC11D15");
		btn_seat_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 15;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_15.setBackground(Color.WHITE);
	
		panel_4.add(btn_seat_15);
		
		JLabel lb_corona15 = new JLabel("");
		panel_4.add(lb_corona15);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 240));
		panel_5.setBounds(529, 10, 78, 76);
		panel_5.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.getContentPane().add(panel_5);
		
		btn_seat_16 = new JButton("\uC88C\uC11D16");
		btn_seat_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 16;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_16.setBackground(Color.WHITE);
		
		panel_5.add(btn_seat_16);
		
		JLabel lb_corona16 = new JLabel("");
		panel_5.add(lb_corona16);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 240));
		panel_6.setBounds(439, 10, 78, 76);
		panel_6.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.getContentPane().add(panel_6);
		
		btn_seat_17 = new JButton("\uC88C\uC11D17");
		btn_seat_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 17;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_17.setBackground(Color.WHITE);
		
		panel_6.add(btn_seat_17);
		
		JLabel lb_corona17 = new JLabel("");
		panel_6.add(lb_corona17);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 240));
		panel_7.setBounds(349, 10, 78, 76);
		panel_7.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.getContentPane().add(panel_7);
		
		btn_seat_18 = new JButton("\uC88C\uC11D18");
		btn_seat_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 18;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_18.setBackground(Color.WHITE);
	
		panel_7.add(btn_seat_18);
		
		JLabel lb_corona18 = new JLabel("");
		panel_7.add(lb_corona18);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 255, 240));
		panel_8.setBounds(259, 10, 78, 76);
		panel_8.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.getContentPane().add(panel_8);
		
		btn_seat_19 = new JButton("\uC88C\uC11D19");
		btn_seat_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 19;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_19.setBackground(Color.WHITE);
	
		panel_8.add(btn_seat_19);
		
		JLabel lb_corona19 = new JLabel("");
		panel_8.add(lb_corona19);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 255, 240));
		panel_9.setBounds(169, 10, 78, 76);
		panel_9.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.getContentPane().add(panel_9);
		
		btn_seat_20 = new JButton("\uC88C\uC11D20");
		btn_seat_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 20;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_20.setBackground(Color.WHITE);
	
		panel_9.add(btn_seat_20);
		
		JLabel lb_corona20 = new JLabel("");
		panel_9.add(lb_corona20);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 255, 240));
		panel_10.setBounds(22, 91, 78, 76);
		panel_10.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.getContentPane().add(panel_10);
		
		btn_seat_21 = new JButton("\uC88C\uC11D21");
		btn_seat_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 21;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_21.setBackground(Color.WHITE);
	
		panel_10.add(btn_seat_21);
		
		JLabel lb_corona21 = new JLabel("");
		panel_10.add(lb_corona21);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 255, 240));
		panel_11.setBounds(22, 177, 78, 76);
		panel_11.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.getContentPane().add(panel_11);
		
		btn_seat_22 = new JButton("\uC88C\uC11D22");
		btn_seat_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 22;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_22.setBackground(Color.WHITE);
		
		panel_11.add(btn_seat_22);
		
		JLabel lb_corona22 = new JLabel("");
		panel_11.add(lb_corona22);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(255, 255, 240));
		panel_12.setBounds(22, 263, 78, 76);
		panel_12.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.getContentPane().add(panel_12);
		
		btn_seat_23 = new JButton("\uC88C\uC11D23");
		btn_seat_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 23;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_23.setBackground(Color.WHITE);
		
		panel_12.add(btn_seat_23);
		
		JLabel lb_corona23 = new JLabel("");
		panel_12.add(lb_corona23);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(255, 255, 240));
		panel_13.setBounds(22, 430, 78, 76);
		panel_13.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.getContentPane().add(panel_13);
		
		btn_seat_24 = new JButton("\uC88C\uC11D24");
		btn_seat_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 24;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_24.setBackground(Color.WHITE);
		
		panel_13.add(btn_seat_24);
		
		JLabel lb_corona24 = new JLabel("");
		panel_13.add(lb_corona24);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(255, 255, 240));
		panel_14.setBounds(22, 516, 78, 76);
		panel_14.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.getContentPane().add(panel_14);
		
		btn_seat_25 = new JButton("\uC88C\uC11D25");
		btn_seat_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seatNum = 25;
				PayDAO pay = new PayDAO();
				PayVO pVO = pay.seatSelect(vo, seatNum);
				if (pVO!=null) {
					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
					EnterGUI enter = new EnterGUI(vo, pVO);
					frame.dispose();
				}
			}
		});
		btn_seat_25.setBackground(Color.WHITE);
		
		
		panel_14.add(btn_seat_25);
		
		JLabel lb_corona25 = new JLabel("");
		panel_14.add(lb_corona25);
		
		Panel panel_15 = new Panel();
		panel_15.setBounds(799, 83, 81, 10); // 83,81
		frame.getContentPane().add(panel_15);
		panel_15.setBackground(new Color(0, 0, 0));

		Panel panel_15_1 = new Panel();
		panel_15_1.setBackground(Color.BLACK);
		panel_15_1.setBounds(619, 83, 78, 10);
		frame.getContentPane().add(panel_15_1);

		Panel panel_15_1_1 = new Panel();
		panel_15_1_1.setBackground(Color.BLACK);
		panel_15_1_1.setBounds(709, 83, 78, 10);
		frame.getContentPane().add(panel_15_1_1);

		Panel panel_15_1_1_1 = new Panel();
		panel_15_1_1_1.setBackground(Color.BLACK);
		panel_15_1_1_1.setBounds(529, 83, 78, 10);
		frame.getContentPane().add(panel_15_1_1_1);

		Panel panel_15_1_1_2 = new Panel();
		panel_15_1_1_2.setBackground(Color.BLACK);
		panel_15_1_1_2.setBounds(439, 83, 78, 10);
		frame.getContentPane().add(panel_15_1_1_2);

		Panel panel_15_1_1_3 = new Panel();
		panel_15_1_1_3.setBackground(Color.BLACK);
		panel_15_1_1_3.setBounds(349, 83, 78, 10);
		frame.getContentPane().add(panel_15_1_1_3);

		Panel panel_15_1_1_4 = new Panel();
		panel_15_1_1_4.setBackground(Color.BLACK);
		panel_15_1_1_4.setBounds(259, 83, 78, 10);
		frame.getContentPane().add(panel_15_1_1_4);

		Panel panel_15_1_1_4_1 = new Panel();
		panel_15_1_1_4_1.setBackground(Color.BLACK);
		panel_15_1_1_4_1.setBounds(169, 83, 78, 10);
		frame.getContentPane().add(panel_15_1_1_4_1);

		Panel panel_16 = new Panel();
		panel_16.setBackground(new Color(0, 0, 0));
		panel_16.setBounds(100, 91, 10, 76);
		frame.getContentPane().add(panel_16);

		Panel panel_16_1 = new Panel();
		panel_16_1.setBackground(Color.BLACK);
		panel_16_1.setBounds(100, 263, 10, 76);
		frame.getContentPane().add(panel_16_1);

		Panel panel_16_1_1 = new Panel();
		panel_16_1_1.setBackground(Color.BLACK);
		panel_16_1_1.setBounds(100, 430, 10, 76);
		frame.getContentPane().add(panel_16_1_1);

		Panel panel_16_1_1_1 = new Panel();
		panel_16_1_1_1.setBackground(Color.BLACK);
		panel_16_1_1_1.setBounds(100, 516, 10, 76);
		frame.getContentPane().add(panel_16_1_1_1);

		Panel panel_16_1_1_2 = new Panel();
		panel_16_1_1_2.setBackground(Color.BLACK);
		panel_16_1_1_2.setBounds(100, 178, 10, 76);
		frame.getContentPane().add(panel_16_1_1_2);

		Panel panel_16_1_1_2_1 = new Panel();
		panel_16_1_1_2_1.setBackground(new Color(105, 105, 105));
		panel_16_1_1_2_1.setBounds(521, 158, 10, 209);
		frame.getContentPane().add(panel_16_1_1_2_1);

		Panel panel_15_1_1_1_1 = new Panel();
		panel_15_1_1_1_1.setBackground(new Color(105, 105, 105));
		panel_15_1_1_1_1.setBounds(287, 256, 478, 10);
		frame.getContentPane().add(panel_15_1_1_1_1);

		Panel panel_15_1_1_1_1_1 = new Panel();
		panel_15_1_1_1_1_1.setBackground(SystemColor.controlDkShadow);
		panel_15_1_1_1_1_1.setBounds(289, 500, 228, 10);
		frame.getContentPane().add(panel_15_1_1_1_1_1);
		
		// 비상구 사진 넣는 부분
		
		ImageIcon icon = new ImageIcon("C:\\Users\\smhrd\\Downloads\\javaproject_semi (2)\\javaproject_semi\\image\\exit.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(88, 71, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		JLabel lblNewLabel = new JLabel(changeIcon);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setBounds(22,349,88,71);
		
		// 입구 사진
				ImageIcon icon1 = new ImageIcon("C:\\Users\\smhrd\\Downloads\\javaproject_semi (2)\\javaproject_semi\\image\\door.jpg");
				Image img1 = icon1.getImage();
				Image changeImg1= img1.getScaledInstance(99, 99, Image.SCALE_SMOOTH);
				ImageIcon changeIcon1 = new ImageIcon(changeImg1);
				JLabel lblNewLabel_1 = new JLabel(changeIcon1);
				lblNewLabel_1.setBounds(602, 537, 81, 93);
				frame.getContentPane().add(lblNewLabel_1);
	
		
		JLabel[] corona = {lb_corona1, lb_corona2, lb_corona3, lb_corona4, lb_corona5,
				lb_corona6, lb_corona7, lb_corona8, lb_corona9, lb_corona10, lb_corona11,
				lb_corona12, lb_corona13, lb_corona14, lb_corona15, lb_corona16, lb_corona17,
				lb_corona18, lb_corona19, lb_corona20, lb_corona21, lb_corona22, lb_corona23,
				lb_corona24, lb_corona25};
		
		JButton[] btn_corona = {btn_seat_01, btn_seat_02, btn_seat_03, btn_seat_04, btn_seat_05
				, btn_seat_06, btn_seat_07, btn_seat_08, btn_seat_09, btn_seat_10, btn_seat_11
				, btn_seat_12, btn_seat_13, btn_seat_14, btn_seat_15, btn_seat_16, btn_seat_17,
				btn_seat_18, btn_seat_19, btn_seat_20, btn_seat_21, btn_seat_22, btn_seat_23,
				btn_seat_24, btn_seat_25};
		
		
		ArrayList<SeatVO> stop = dao.Timecheck();
		for (int i = 0; i < btn_corona.length; i++) {
			if(stop.get(i).getLivetableuse()==1) {
				corona[i].setText("사용중");
				btn_corona[i].setBackground(Color.blue);
				}
		}
		dao.corona(corona, btn_corona);
		JOptionPane.showMessageDialog(null, "코로나 2단계로 특정 좌석이 제한됩니다.");
		
}}