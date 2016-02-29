package view.patients;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patients_ops all_patients  = new Patients_ops();
		List<Patients_bean> pats_list= all_patients.getAllPatients();
		
		Patients_bean p;
		p = pats_list.get(0);
		System.out.println(p.getPatient());
		System.out.println("1");
			
	}

}
