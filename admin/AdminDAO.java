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
		
		
		
		public void connect() { //연결하는 것은 어떤 메소드를 이용하든 항상 동일하다 복붙하자.
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
			//3. sql 구문 준비 객체(preparedStatement) 생성
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
			//3. sql 구문 준비 객체(preparedStatement) 생성
			try {
				pst = conn.prepareStatement(sql);
				rs = pst.executeQuery();
				//db에 없는 학생 입력할 경우 -> 없는 학생입니다 출력!!! 해보세요!!
			
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
						//학생이 검색이 안됐으면 실행조차 되지 않았기 때문에 stu1에는 null이 그대로 남아 리턴될 것이다.			
				}
			}catch(Exception e) {
				e.printStackTrace();
			}return list1;}
		
		public void corona(JLabel[] x, JButton[] y) {
			int btn = 0;
			try {
				for (int i = 1; i < 12; i+=2) {
					y[i].setBackground(Color.red);
					x[i].setText("사용 X");
					btn++;
				}	
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			}

		
	
	

}
