package Pay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Client.ClientVO;

public class PayDAO {
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
	
	public PayVO seatSelect(ClientVO vo, int seatnum) {
	connect();
	PayVO pVO = null;
	try{
		String sql = "insert into bookingroompay values(paynum.nextval, ?, ?, ?, null, null, ?)";
		pst = conn.prepareStatement(sql);
		pst.setString(1, vo.getPhonenumber());
		pst.setInt(2, seatnum);
		pst.setInt(3, vo.getPaytime());
		pst.setString(4, vo.getName());
		pst.executeUpdate();
		
		pVO = new PayVO(vo.getPhonenumber(), seatnum, vo.getPaytime());
				
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		close();
	}
	return pVO;}
	
	public ArrayList<PayVO> allSearch() {
		ArrayList<PayVO> list = new ArrayList<PayVO>();
		connect();
		
		try {
		
		String sql = "select * from bookingroompay";
		
		pst = conn.prepareStatement(sql);
		rs = pst.executeQuery();

			while (rs.next()) {

				int paynum = rs.getInt(1);
				String phonenumber = rs.getString(2);
				int seatnumber = rs.getInt(3);
				int paytime = rs.getInt(4);
				String starttime = rs.getString(5);
				String endtime = rs.getString(6);
				String name = rs.getString(7);
				
				PayVO dto = new PayVO(paynum, phonenumber, name, seatnumber, paytime, starttime,
						endtime);
				list.add(dto);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
			}
		

		return list;
	}
	
	
	
	
	

}
