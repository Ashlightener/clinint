package screening;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class Screening_servlet
 */
@WebServlet("/Screening_servlet")
public class Screening_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Screening_servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//Getting the country selected
		 String sub = request.getParameter("selsub");
		 	
		 if (!sub.equalsIgnoreCase("submit"))
		 {			
		 String sel_country = request.getParameter("selcountry");
		 String sel_site = request.getParameter("selsite");
		
		    System.out.println(sel_site);
			 String sites_sel = Screen_bean.getsites(sel_country);		 
			 response.setContentType("application/json");		
			 response.setCharacterEncoding("UTF-8");
			 response.getWriter().write(sites_sel);	
		 }
		System.out.println(sub); 
		if (sub.equalsIgnoreCase("submit")) {
			// Get all the parameters from the screening form through ajax
			System.out.println("h");
			String iC = request.getParameter("infc");
			String weight = request.getParameter("weight");
			System.out.println(weight);
			String country = request.getParameter("country");
			String site = request.getParameter("siteid");
			String dOB = request.getParameter("dob");
			String screening_date = request.getParameter("scrdate");
			String sex = request.getParameter("sex");

			// For debugging purpose only

			/*System.out.println(weight);
			System.out.println(iC);
			System.out.println(country);
			System.out.println(site);
			System.out.println(dOB);
			System.out.println(screening_date);
			System.out.println(sex);*/

			// Create an instance of Screen_bean class
			Screen_bean Screen_info = new Screen_bean(country, site, dOB, iC, weight, screening_date, sex);
			String bean_respones = Screen_info.getValidate();
			System.out.println(Screen_info.Validate);
			System.out.println("here in servlet");
			// For debugging purpose only
			System.out.println(bean_respones);
			if (Screen_info.Validate != 200) { // Something is wrong in the
												// form, so
												// show those errors
				response.setContentType("application/json");
				response.setCharacterEncoding("UTF-8");
				response.getWriter().write(bean_respones);
			} else {
				System.out.println("success");
				// Success, insert that patient
				Patient_create Patient = new Patient_create(Screen_info);
				Patient.insert_patient();
			}
		}			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		System.out.println("Country hit");

	}

}
