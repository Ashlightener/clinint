/*package screening;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;

public class jdbc_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps = null;
			int recordCounter = 0;
			Screen_jdbc_connection jd = Screen_jdbc_connection.getInstance();
			Connection con = jd.getConnection();
			ps = (PreparedStatement) con.prepareStatement("SELECT IFNULL(max(patient),1000) FROM patients");
			ps.setString(1, "123");
			ps.setString(2, "Male");
			recordCounter = ps.executeUpdate();

			System.out.println(recordCounter);
		} catch (Exception e) {
			e.printStackTrace();
		}



}
*/