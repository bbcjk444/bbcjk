//package ClientLogin;
//
//import java.awt.BorderLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.SwingConstants;
//
//import Client.ClientVO;
//import ClientView.EnterGUI_1;
//import ClientView.FirstVIewGUI;
//import Pay.PayDAO;
//import Pay.PayVO;
//
//public class BookingRoomClient {
//
//	private JFrame frame;
//
//	/**
//	 * Launch the application.
//	 */
//
//	/**
//	 * Create the application.
//	 */
//	public BookingRoomClient(ClientVO vo) {
//		initialize(vo);
//		frame.setVisible(true);
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize(ClientVO vo) {
//		frame = new JFrame();
//		frame.setBounds(100, 100, 818, 585);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		
//		JButton btn_seat_13 = new JButton("\uC88C\uC11D13");
//		btn_seat_13.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 13;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//			//		EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_13.setVerticalAlignment(SwingConstants.TOP);
//		btn_seat_13.setBounds(668, 10, 97, 57);
//		frame.getContentPane().add(btn_seat_13);
//		
//		JButton btn_seat_14 = new JButton("\uC88C\uC11D14");
//		btn_seat_14.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 14;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					//EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_14.setVerticalAlignment(SwingConstants.TOP);
//		btn_seat_14.setBounds(559, 10, 97, 57);
//		frame.getContentPane().add(btn_seat_14);
//		
//		JButton btn_seat_15 = new JButton("\uC88C\uC11D15");
//		btn_seat_15.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 15;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//				//	EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_15.setVerticalAlignment(SwingConstants.TOP);
//		btn_seat_15.setBounds(450, 10, 97, 57);
//		frame.getContentPane().add(btn_seat_15);
//		
//		JButton btn_seat_16 = new JButton("\uC88C\uC11D16");
//		btn_seat_16.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 16;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_16.setVerticalAlignment(SwingConstants.TOP);
//		btn_seat_16.setBounds(339, 10, 97, 57);
//		frame.getContentPane().add(btn_seat_16);
//		
//		JButton btn_seat_17 = new JButton("\uC88C\uC11D17");
//		btn_seat_17.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 17;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_17.setVerticalAlignment(SwingConstants.TOP);
//		btn_seat_17.setBounds(230, 10, 97, 57);
//		frame.getContentPane().add(btn_seat_17);
//		
//		JButton btn_seat_18 = new JButton("\uC88C\uC11D18");
//		btn_seat_18.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 18;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_18.setVerticalAlignment(SwingConstants.TOP);
//		btn_seat_18.setBounds(121, 10, 97, 57);
//		frame.getContentPane().add(btn_seat_18);
//		
//		JButton btn_seat_19 = new JButton("\uC88C\uC11D19");
//		btn_seat_19.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 19;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_19.setVerticalAlignment(SwingConstants.TOP);
//		btn_seat_19.setBounds(12, 10, 97, 57);
//		frame.getContentPane().add(btn_seat_19);
//		
//		JButton btn_seat_20 = new JButton("\uC88C\uC11D20");
//		btn_seat_20.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 20;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_20.setVerticalAlignment(SwingConstants.TOP);
//		btn_seat_20.setBounds(12, 77, 97, 57);
//		frame.getContentPane().add(btn_seat_20);
//		
//		JButton btn_seat_21 = new JButton("\uC88C\uC11D21");
//		btn_seat_21.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 21;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_21.setBounds(12, 145, 97, 57);
//		frame.getContentPane().add(btn_seat_21);
//		
//		JButton btn_seat_22 = new JButton("\uC88C\uC11D22");
//		btn_seat_22.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 22;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_22.setBounds(12, 212, 97, 57);
//		frame.getContentPane().add(btn_seat_22);
//		
//		JButton btn_seat_24 = new JButton("\uC88C\uC11D24");
//		btn_seat_24.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 24;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_24.setBounds(12, 412, 97, 57);
//		frame.getContentPane().add(btn_seat_24);
//		
//		JButton btn_seat_25 = new JButton("\uC88C\uC11D25");
//		btn_seat_25.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 25;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_25.setBounds(12, 479, 97, 57);
//		frame.getContentPane().add(btn_seat_25);
//		
//		JButton btn_seat_23 = new JButton("\uC88C\uC11D23");
//		btn_seat_23.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 23;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_23.setBounds(12, 345, 97, 57);
//		frame.getContentPane().add(btn_seat_23);
//		
//		JButton btn_seat_01 = new JButton("\uC88C\uC11D01");
//		btn_seat_01.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 1;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			
//				
//			}
//		});
//		btn_seat_01.setBounds(230, 145, 97, 57);
//		frame.getContentPane().add(btn_seat_01);
//		
//		JButton btn_seat_02 = new JButton("\uC88C\uC11D02");
//		btn_seat_02.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				int seatNum = 2;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			
//			
//			}
//		});
//		btn_seat_02.setBounds(361, 145, 97, 57);
//		frame.getContentPane().add(btn_seat_02);
//		
//		JButton btn_seat_07 = new JButton("\uC88C\uC11D07");
//		btn_seat_07.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 7;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_07.setBounds(361, 229, 97, 57);
//		frame.getContentPane().add(btn_seat_07);
//		
//		JButton btn_seat_03 = new JButton("\uC88C\uC11D03");
//		btn_seat_03.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 3;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_03.setBounds(539, 145, 97, 57);
//		frame.getContentPane().add(btn_seat_03);
//		
//		JButton btn_seat_04 = new JButton("\uC88C\uC11D04");
//		btn_seat_04.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 4;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_04.setBounds(668, 145, 97, 57);
//		frame.getContentPane().add(btn_seat_04);
//		
//		JButton btn_seat_06 = new JButton("\uC88C\uC11D06");
//		btn_seat_06.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 6;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_06.setBounds(539, 229, 97, 57);
//		frame.getContentPane().add(btn_seat_06);
//		
//		JButton btn_seat_05 = new JButton("\uC88C\uC11D05");
//		btn_seat_05.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 5;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_05.setBounds(668, 229, 97, 57);
//		frame.getContentPane().add(btn_seat_05);
//		
//		JButton btn_seat_09 = new JButton("\uC88C\uC11D09");
//		btn_seat_09.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 9;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_09.setBounds(293, 412, 97, 57);
//		frame.getContentPane().add(btn_seat_09);
//		
//		JButton btn_seat_10 = new JButton("\uC88C\uC11D10");
//		btn_seat_10.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 10;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_10.setBounds(411, 412, 97, 57);
//		frame.getContentPane().add(btn_seat_10);
//		
//		JButton btn_seat_11 = new JButton("\uC88C\uC11D11");
//		btn_seat_11.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 11;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_11.setBounds(411, 479, 97, 57);
//		frame.getContentPane().add(btn_seat_11);
//		
//		JButton btn_seat_12 = new JButton("\uC88C\uC11D12");
//		btn_seat_12.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 12;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//		btn_seat_12.setBounds(293, 479, 97, 57);
//		frame.getContentPane().add(btn_seat_12);
//		
//		JPanel panel = new JPanel();
//		panel.setBounds(230, 229, 97, 57);
//		frame.getContentPane().add(panel);
//		panel.setLayout(new BorderLayout(0, 0));
//		
//		JButton btn_seat_08 = new JButton("\uC88C\uC11D08");
//		panel.add(btn_seat_08, BorderLayout.NORTH);
//		
//		JLabel lblNewLabel = new JLabel("\uC0AC\uC6A9\uAC00\uB2A5");
//		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		panel.add(lblNewLabel, BorderLayout.CENTER);
//		
//		JLabel lblNewLabel_1 = new JLabel("");
//		panel.add(lblNewLabel_1, BorderLayout.EAST);
//		
//		JButton button = new JButton("\uB4A4\uB85C \uAC00\uAE30");
//		button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			FirstVIewGUI first = new FirstVIewGUI(null, null, null);
//			frame.dispose();
//			
//			}
//		});
//		button.setBounds(539, 412, 97, 35);
//		frame.getContentPane().add(button);
//		btn_seat_08.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int seatNum = 8;
//				PayDAO pay = new PayDAO();
//				PayVO pVO = pay.seatSelect(vo, seatNum);
//				if (pVO!=null) {
//					JOptionPane.showMessageDialog(null, pVO.getSeatnumber()+"번 좌석이 예약되었습니다.");
//					EnterGUI_1 enter = new EnterGUI_1(vo, pVO);
//					frame.dispose();
//				}
//			}
//		});
//	}
//}
