package screening;

import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.mysql.jdbc.PreparedStatement;

public class Patient_create {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String pat_next = null;
	Screen_bean pat_info;
	Date scr_date;
	
	public Patient_create(Screen_bean patient_info) {
		// Generate a Screening number
		try {			
			System.out.println(patient_info.getScreening_date());
			Screen_jdbc_connection jd = Screen_jdbc_connection.getInstance();
			con = jd.getConnection();
			ps = (PreparedStatement) con.prepareStatement("SELECT IFNULL(max(patient)+1,1000) patient from patients");
			rs = ps.executeQuery();
			while (rs.next()) {
				// gets next free patient number 
				pat_next = rs.getString("patient");
			}

			// create SimpleDateFormat object with source string date format
			SimpleDateFormat sdfSource = new SimpleDateFormat("MM/dd/yyyy");
			// create SimpleDateFormat object with desired date format
			SimpleDateFormat sdfDestination = new SimpleDateFormat("yyyy-MM-dd");
			
			// parse the string into Date object
			scr_date = sdfSource.parse(patient_info.getScreening_date());
			Date dob = sdfSource.parse(patient_info.getDOB());
			Date ic = sdfSource.parse(patient_info.getIC());
		
			// parse the date into another format
			String Screen_string = sdfDestination.format(scr_date);
			String dob_string = sdfDestination.format(dob);
			String ic_string = sdfDestination.format(ic);
			
			//Setting the new format for the dates for use to store in the database
			patient_info.setScreening_date(Screen_string);
			patient_info.setDOB(dob_string);
			patient_info.setIC(ic_string);
			
			//Assigning a new reference of thr patient_info for use outside of constructor
			pat_info = patient_info;

		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}
	
	public void insert_patient()
	{
		try{
			int recordCounter;
			ps = null;
			ps = (PreparedStatement) con
					.prepareStatement("INSERT INTO PATIENTS(patient,sex,weight,screening_date,informed_consent,dob,country,site)values (?,?,?,?,?,?,?,?)");
			ps.setString(1, pat_next);
			ps.setString(2, pat_info.getSex());
			ps.setString(3, pat_info.getWeight());
		/*	ps.setString(4, pat_info.getScreening_date());*/
			ps.setDate(4, new java.sql.Date(scr_date.getTime()));
			ps.setString(5, pat_info.getIC());
			ps.setString(6, pat_info.getDOB());
			ps.setString(7, pat_info.getCountry());
			ps.setString(8, pat_info.getSite());
			
			//counts number of records inserted
			recordCounter = ps.executeUpdate();
							
		}catch (Exception e){
			e.printStackTrace();
		}
		
	
	}
	
}
