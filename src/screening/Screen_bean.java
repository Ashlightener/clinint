package screening;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Screen_bean {

	public int Validate = 200;
	private String Country;
	private String Site;
	private String DOB;
	private String IC;
	private String Weight;
	private String Screening_date;
	private String Sex;

	public Screen_bean(String country, String site, String dOB, String iC, String weight, String screening_date,
			String sex) {
		super();
		Country = country;
		Site = site;
		DOB = dOB;
		IC = iC;
		Weight = weight;
		Screening_date = screening_date;
		Sex = sex;

	}

	public static String getsites(String sel_country) {
		try {
			PreparedStatement ps = null;
			ResultSet site_results = null;
			List<String> s = new ArrayList<String>();					
			Screen_jdbc_connection jdb = Screen_jdbc_connection.getInstance();
			Connection con = (Connection) jdb.getConnection();
			// getting all the sites
			System.out.println("in screen_bean");
			//System.out.println(sel_country);

			ps = (PreparedStatement) con.prepareStatement("SELECT Site FROM sites WHERE country= ?");
			ps.setString(1, sel_country);
			site_results = ps.executeQuery();

			while (site_results.next()) {
				s.add(site_results.getString("Site"));
			}

			String sites_sel = new Gson().toJson(s);
			System.out.println(sites_sel);
		   return sites_sel;
			
		} catch (Exception e) {
			e.printStackTrace();
			return "Error_in_Screen_bean ";
		}
		
		
	}

	public String getValidate() {
		// Create a list
		List<Object> error_list = new ArrayList<Object>();
		// Date format for general use and todays date available.
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate today = LocalDate.now();
		System.out.println(Site);
		// validate
		if (Country.equals("Country")) {
			error_list.add("Please choose your country");
			Validate++;
		}
		if (Site.equals("Site")) {
			error_list.add("Please choose your Site");
			Validate++;
		}
		if (DOB == null || DOB.trim().length() == 0) {
			error_list.add("Please enter DOB");
			Validate++;
		} else {
			LocalDate dob_date = LocalDate.parse(getDOB(), formatter);
			Period Age = Period.between(dob_date, today);
			if (Age.getYears() < 18 || Age.getYears() > 65) {
				error_list.add("Date of birth entered corresponds to age outside protocol limits");
				Validate++;
			}
		}

		if (IC == null || IC.trim().length() == 0) {
			error_list.add("Please enter Informed consent");
			Validate++;
		}

		// Weight checks
		if (Weight.trim().length() == 0) {
			error_list.add("Weight cannot be empty");
			Validate++;
		} else {
			double weith = Double.parseDouble(Weight);
			System.out.println(weith);
			// System.out.println(weith);
			if (weith <= 10.00 || weith >= 100.00) {

				error_list.add("Weight outside protocol range");
				Validate++;

			}
		}
		//
		if (Screening_date == null || Screening_date.trim().length() == 0) {
			error_list.add("Screening date cant be empty");
			Validate++;
		} else {
			LocalDate scr_date = LocalDate.parse(getScreening_date(), formatter);
			if (scr_date.isAfter(today)) {
				error_list.add("Screening date cant be less than todays date");
				Validate++;
			}

		}
		if (Sex.equals("Gender")) {
			error_list.add("Need to fill Sex");
			Validate++;
		}
		// error_list.add(Validate);
		String jsonresponse = new Gson().toJson(error_list);
		return jsonresponse;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getSite() {

		return Site;

	}

	public void setSite(String site) {
		Site = site;
	}

	public String getDOB() {

		return DOB;

	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getIC() {

		return IC;

	}

	public void setIC(String iC) {
		IC = iC;
	}

	public String getWeight() {
		return Weight;

	}

	public void setWeight(String weight) {
		Weight = weight;
	}

	public String getScreening_date() {

		return Screening_date;

	}

	public void setScreening_date(String screening_date) {
		Screening_date = screening_date;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}
}
