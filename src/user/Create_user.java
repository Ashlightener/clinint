package user;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import screening.Screen_jdbc_connection;

public class Create_user {
	private String user;
	private String passwor;
	
	public Create_user(String user, String passwor) throws ClassNotFoundException, SQLException {
		super();
		this.user = user;
		this.passwor = passwor;
		
		String id;
		PreparedStatement ps = null;
		ResultSet user_db = null;
		Screen_jdbc_connection jdb = Screen_jdbc_connection.getInstance();
		Connection con = (Connection) jdb.getConnection();
		ps = (PreparedStatement) con.prepareStatement("SELECT userid FROM users where User_name = ?");		
		ps.setString(1, user);
		user_db = ps.executeQuery();
		
		while(user_db.next())
		{
			id=user_db.getString("useid");
			System.out.println(id);
		}
		
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPasswor() {
		return passwor;
	}

	public void setPasswor(String passwor) {
		this.passwor = passwor;
	}
	
	
}
