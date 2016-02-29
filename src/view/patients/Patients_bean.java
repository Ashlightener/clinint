package view.patients;

import java.util.Date;

public class Patients_bean {
	private String Country;
	private String Site;
	private Date DOB;
	private Date IC;
	private double Weight;
	private Date Screening_date;
	private String Sex;
	private int patient;
	
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
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public Date getIC() {
		return IC;
	}
	public void setIC(Date iC) {
		IC = iC;
	}
	public double getWeight() {
		return Weight;
	}
	public void setWeight(double weight) {
		Weight = weight;
	}
	public Date getScreening_date() {
		return Screening_date;
	}
	public void setScreening_date(Date screening_date) {
		Screening_date = screening_date;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public int getPatient() {
		return patient;
	}
	public void setPatient(int patient) {
		this.patient = patient;
	}
	
	
}
