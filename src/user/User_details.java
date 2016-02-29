package user;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import screening.Screen_jdbc_connection;

public class User_details {
	private String user_id;
	private String full_name;
	private String role;
	private String country;
	private String state;
	private String zip;

	public User_details(Login_user logged_user) {
		// get a connection instance
		PreparedStatement ps = null;
		ResultSet user_details = null;

		Screen_jdbc_connection jdb = Screen_jdbc_connection.getInstance();
		try {
			Connection con = (Connection) jdb.getConnection();

			ps = (PreparedStatement) con.prepareStatement(
					"SELECT ud.* FROM user_details ud JOIN users u on (ud.user_id = u.userid) WHERE u.userid=?");
			ps.setInt(1, logged_user.getUser_id());
			user_details = ps.executeQuery();

			while (user_details.next()) {
				// get the user details
				full_name = user_details.getString("Full_name");
				role = user_details.getString("Full_name");
				country = user_details.getString("Full_name");
				state = user_details.getString("Full_name");
				zip = user_details.getString("Full_name");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error from User_details class");
		}

	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

}
