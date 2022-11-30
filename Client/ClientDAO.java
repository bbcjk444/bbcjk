package Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class ClientDAO {
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
	
	public int joinInsert(ClientVO vo) {
		connect();
		int cnt = 0;
		try {
			pst = conn.prepareStatement("insert into bookingroomclient values(?, ?, ?, ?, null, null, null, null)");
			pst.setNString(1, vo.getPhonenumber());
			pst.setNString(2, vo.getPassword());
			pst.setNString(3, vo.getName());
			pst.setString(4, vo.getAddress());
			
			cnt = pst.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;
	}
	
	public boolean loginSelect(ClientVO vo) {
		connect();
		boolean success = false;
		try {
			String sql = "select * from bookingroomclient where phonenumber=? AND password=?";
			//3. sql 구문 준비 객체(preparedStatement) 생성
			pst = conn.prepareStatement(sql);
			
			pst.setNString(1,vo.getPhonenumber());
			pst.setNString(2,vo.getPassword());

			rs = pst.executeQuery();
			//db에 없는 학생 입력할 경우 -> 없는 학생입니다 출력!!! 해보세요!!
			success = rs.next();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return success;
				}

	public ClientVO Timepay(ClientVO vo, int cnt) {
		connect();
		
		try {
			String sql = "update bookingroomclient set paytime = ? where phonenumber = ?"; 
					//3. sql 구문 준비 객체(preparedStatement) 생성
				
			pst = conn.prepareStatement(sql);
			pst.setInt(1, cnt);
			pst.setNString(2,vo.getPhonenumber());
			rs = pst.executeQuery();
			//db에 없는 학생 입력할 경우 -> 없는 학생입니다 출력!!! 해보세요!!
			rs.next();
			vo.setPaytime(cnt);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
			
		return vo;
	}
	
	public ArrayList<ClientVO> allSearch() {
		ArrayList<ClientVO> list = new ArrayList<ClientVO>();
		connect();
		try {
			String sql = "select * from bookingroomclient";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {

				String phonenumber = rs.getString(1);
				String password = rs.getString(2);
				String name = rs.getString(3);
				String address = rs.getString(4);
				int paytime = rs.getInt(5);
				int live = rs.getInt(6);
				String starttime = rs.getString(7);
				String endtime = rs.getString(8);
				
				
				ClientVO dto = new ClientVO(phonenumber, password, name, address, paytime, live, starttime, endtime);
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

	public ArrayList<ClientVO> allSearch(String start, String end) {
		ArrayList<ClientVO> list = new ArrayList<ClientVO>();
//		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		String start1 = "";
//		String end1 = "";
//		try {
//			Date start2 = format.parse(start);
//			Date end2 = format.parse(end);
//			start1 = format.format(start2);
//			end1 = format.format(end2);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		
		connect();
		try {
			String sql = "select * from bookingroomclient where starttime between (To_date(?, 'YYYY/MM/DD HH24:MI:SS')) "
					+ "and (To_date(?, 'YYYY/MM/DD HH24:MI:SS'))";
			pst = conn.prepareStatement(sql);
			pst.setString(1, start);
			pst.setString(2, end);
				
			
			rs = pst.executeQuery();
			while (rs.next()) {

				String phonenumber = rs.getString(1);
				String password = rs.getString(2);
				String name = rs.getString(3);
				String address = rs.getString(4);
				int paytime = rs.getInt(5);
				int live = rs.getInt(6);
				String starttime = rs.getString(7);
				String endtime = rs.getString(8);
				
				ClientVO dto = new ClientVO(phonenumber, password, name, address, paytime, live,starttime, endtime);
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
