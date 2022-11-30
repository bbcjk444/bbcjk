package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClientSearchDAO {

	private Connection conn = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	private PreparedStatement pst1 = null;
	private ResultSet rs1 = null;
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";

	public ArrayList<ClientSearchDTO> allSearch() {
		ArrayList<ClientSearchDTO> list = new ArrayList<ClientSearchDTO>();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, user, password);

			String sql = "select * from bookingroompay";

			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {

				int paynum = rs.getInt(1);
				String phonenumber = rs.getString(2);
				String name = rs.getString(3);
				int seatnumber = rs.getInt(4);
				int paytime = rs.getInt(5);
				String starttime = rs.getString(6);
				String endtime = rs.getString(7);

				ClientSearchDTO dto = new ClientSearchDTO(paynum, phonenumber, name, seatnumber, paytime, starttime,
						endtime);
				list.add(dto);

			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pst != null)
					pst.close();
				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return list;
	}

}
