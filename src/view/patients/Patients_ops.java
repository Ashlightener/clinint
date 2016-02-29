package view.patients;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import screening.Screen_jdbc_connection;

public class Patients_ops {

	//private Connection connection;

	public Patients_ops() {

	}

	/*
	 * public void deleteUser(int userId) { try { PreparedStatement
	 * preparedStatement = connection .prepareStatement(
	 * "delete from users where userid=?"); // Parameters start with 1
	 * preparedStatement.setInt(1, userId); preparedStatement.executeUpdate();
	 * 
	 * } catch (SQLException e) { e.printStackTrace(); } }
	 * 
	 * public void updateUser(User user) { try { PreparedStatement
	 * preparedStatement = connection .prepareStatement(
	 * "update users set firstname=?, lastname=?, dob=?, email=?" +
	 * "where userid=?"); // Parameters start with 1
	 * preparedStatement.setString(1, user.getFirstName());
	 * preparedStatement.setString(2, user.getLastName());
	 * preparedStatement.setDate(3, new java.sql.Date(user.getDob().getTime()));
	 * preparedStatement.setString(4, user.getEmail());
	 * preparedStatement.setInt(5, user.getUserid());
	 * preparedStatement.executeUpdate();
	 * 
	 * } catch (SQLException e) { e.printStackTrace(); } }
	 */

	public List<Patients_bean> getAllPatients() {
		List<Patients_bean> pats = new ArrayList<Patients_bean>();
		Screen_jdbc_connection pats_view = Screen_jdbc_connection.getInstance();
		ResultSet rs;
		try {
			Connection pats_view_connection = pats_view.getConnection();
			PreparedStatement statement = pats_view_connection.prepareStatement("SELECT * FROM patients");
			rs = statement.executeQuery();

			while (rs.next()) {
				Patients_bean patient = new Patients_bean();
				patient.setCountry(rs.getString("Country"));
				patient.setDOB(rs.getDate("dob"));
				patient.setIC(rs.getDate("informed_consent"));
				patient.setScreening_date(rs.getDate("screening_date"));
				patient.setSite(rs.getString("site"));
				patient.setSex(rs.getString("sex"));
				patient.setPatient(rs.getInt("patient"));
				patient.setWeight(rs.getDouble("weight"));
				pats.add(patient);
			}

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return pats;
	}

	public List<Patients_bean> getfiltered(String country) {
		List<Patients_bean> pats = new ArrayList<Patients_bean>();
		Screen_jdbc_connection pats_view = Screen_jdbc_connection.getInstance();
		ResultSet rs = null;
		try {
			Connection pats_view_connection = pats_view.getConnection();
			if (country.equals("All Patients")) {
				PreparedStatement statement = pats_view_connection.prepareStatement("SELECT * FROM patients");
				rs = statement.executeQuery();
			} else {
				PreparedStatement statement = pats_view_connection
						.prepareStatement("SELECT * FROM patients where country = ?");
				statement.setString(1, country);
				rs = statement.executeQuery();
			}
			while (rs.next()) {
				Patients_bean patient = new Patients_bean();
				patient.setCountry(rs.getString("Country"));
				patient.setDOB(rs.getDate("dob"));
				patient.setIC(rs.getDate("informed_consent"));
				patient.setScreening_date(rs.getDate("screening_date"));
				patient.setSite(rs.getString("site"));
				patient.setSex(rs.getString("sex"));
				patient.setPatient(rs.getInt("patient"));
				patient.setWeight(rs.getDouble("weight"));
				pats.add(patient);
			}

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pats;
	}

	/*
	 * public User getUserById(int userId) { User user = new User(); try {
	 * PreparedStatement preparedStatement = connection. prepareStatement(
	 * "select * from users where userid=?"); preparedStatement.setInt(1,
	 * userId); ResultSet rs = preparedStatement.executeQuery();
	 * 
	 * if (rs.next()) { user.setUserid(rs.getInt("userid"));
	 * user.setFirstName(rs.getString("firstname"));
	 * user.setLastName(rs.getString("lastname"));
	 * user.setDob(rs.getDate("dob")); user.setEmail(rs.getString("email")); } }
	 * catch (SQLException e) { e.printStackTrace(); }
	 * 
	 * return user; }
	 */
}