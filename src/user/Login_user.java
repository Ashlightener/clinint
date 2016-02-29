package user;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.google.gson.Gson;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import screening.Screen_jdbc_connection;
import secure.password.Password;

public class Login_user {
	private String user;
	private String passwor;
	private int er_counter = 200;
	private int user_id = 0;

	public String getEr_counter() {
		String eror = new Gson().toJson(er_counter);
		return eror;
	}

	public Login_user(String user, String passwor) {
		super();
		this.user = user;
		this.passwor = passwor;
		System.out.println("in contructor");

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

	public Boolean getValidate()
			throws ClassNotFoundException, SQLException, NoSuchAlgorithmException, InvalidKeySpecException {

		String valid_hash_pass = "";
		PreparedStatement ps = null;
		ResultSet user_db = null;
		ResultSet pas = null;
		int no_of_users = 0;
		Screen_jdbc_connection jdb = Screen_jdbc_connection.getInstance();
		Connection con = (Connection) jdb.getConnection();

		ps = (PreparedStatement) con.prepareStatement("SELECT COUNT(*) AS user_count FROM users WHERE User_name = ?");
		ps.setString(1, user);
		user_db = ps.executeQuery();

		// getting no of users
		while (user_db.next())
			no_of_users = user_db.getInt("user_count");

		if (no_of_users == 1) {
			ps = (PreparedStatement) con.prepareStatement("SELECT User_password,userid FROM users WHERE User_name= ?");
			ps.setString(1, user);
			pas = ps.executeQuery();
			while (pas.next()) {
				valid_hash_pass = pas.getString("User_password");
				user_id = pas.getInt("userid");
				System.out.println(valid_hash_pass);
			}
			Boolean is_user = Password.validate_pass(valid_hash_pass, passwor);
			System.out.println(is_user);
			if (is_user) {
				System.out.println("how te fuck");
				return true;
			} else {
				er_counter++;
				return false;
			}
		} else {
			// NO such user
			System.out.println("No user found");
			er_counter++;
			return false;
		}

	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

}
