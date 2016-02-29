package view.patients;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class patient_servlet
 */
@WebServlet("/patient_servlet")
public class patient_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public patient_servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);

		if (session== null || session.getAttribute("user_info") == null) {
			response.sendRedirect(request.getContextPath() + "/Login.jsp");
			System.out.println("sign in first");}
		else{
		String country_filter = request.getParameter("country_filter");
		System.out.println(country_filter);
		
		Patients_ops filtered_patients = new Patients_ops();
		List<Patients_bean> pats_list = filtered_patients.getfiltered(country_filter);
	
		request.setAttribute("Patients", pats_list);

		RequestDispatcher r = request.getRequestDispatcher("/access/Patients_list.jsp");
		r.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);

		if (session== null || session.getAttribute("user_info") == null) {
			response.sendRedirect(request.getContextPath() + "/Login.jsp");
			System.out.println(request.getContextPath());
			System.out.println("sign in first");
		} else {
			Patients_ops all_patients = new Patients_ops();
			List<Patients_bean> pats_list = all_patients.getAllPatients();

			request.setAttribute("Patients", pats_list);

			RequestDispatcher r = request.getRequestDispatcher("/access/Patients_list.jsp");
			r.forward(request, response);
		}

	}

}
