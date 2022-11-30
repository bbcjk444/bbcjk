package admin;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

import Seat.SeatVO;

public class AdminDAO {


		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		
		
		public void connect() { //�����ϴ� ���� � �޼ҵ带 �̿��ϵ� �׻� �����ϴ� ��������.
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "hr";
				String password = "hr";
				conn = DriverManager.getConnection(url, user, password);
						
			}catch(Exception e){
				e.printStackTrace();
			}
		}

		public void close() {
			try {
				if(rs!= null) rs.close();
				if(pst!= null) pst.close();
				if(conn!=null) conn.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public AdminVO loginSelect(AdminVO vo) {
			connect();
		boolean success = false;
		try {
			String sql = "select * from bookingroomadmin where adminid=? AND adminpassword=?";
			//3. sql ���� �غ� ��ü(preparedStatement) ����
			pst = conn.prepareStatement(sql);
			
			pst.setNString(1,vo.getId());
			pst.setNString(2,vo.getPw());

			rs = pst.executeQuery();
			rs.next();
						
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return vo;}
				
		
		public ArrayList<SeatVO> Timecheck() {
			ArrayList<SeatVO> list1 = new ArrayList<SeatVO>();
			SeatVO vo = null;
			connect();
			String sql = "select * from bookingroomseat";
			//3. sql ���� �غ� ��ü(preparedStatement) ����
			try {
				pst = conn.prepareStatement(sql);
				rs = pst.executeQuery();
				//db�� ���� �л� �Է��� ��� -> ���� �л��Դϴ� ���!!! �غ�����!!
			
				while(rs.next()) {
					int seatnumber = rs.getInt(1);
					int seatpartition = rs.getInt(2);
					String starttime = rs.getString(3);
					String endtime = rs.getNString(4);
					String admin = rs.getString(5);
					int liveuse = rs.getInt(6);
					int paytime = rs.getInt(7);
					
					vo = new SeatVO(seatnumber, seatpartition, starttime, endtime, admin, liveuse, paytime);
					list1.add(vo);
						//�л��� �˻��� �ȵ����� �������� ���� �ʾұ� ������ stu1���� null�� �״�� ���� ���ϵ� ���̴�.			
				}
			}catch(Exception e) {
				e.printStackTrace();
			}return list1;}
		
		public void corona(JLabel[] x, JButton[] y) {
			int btn = 0;
			try {
				for (int i = 1; i < 12; i+=2) {
					y[i].setBackground(Color.red);
					x[i].setText("��� X");
					btn++;
				}	
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			}

		
	
	

}
