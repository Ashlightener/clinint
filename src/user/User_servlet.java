package user;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class User_servlet
 */
public class User_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public User_servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("In here get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user = request.getParameter("user_name");
		String passwor = request.getParameter("passw");

		System.out.println(user);
		System.out.println(passwor);

		try {
			Login_user user_log = new Login_user(user, passwor);
			Boolean is_user = user_log.getValidate();
			// System.out.println(is_user);
			if (is_user) {
				System.out.println("Hes validated");	
				//get useful info of the user using User_details class
				User_details user_info = new User_details(user_log);
				
				HttpSession user_session = request.getSession();
				user_session.setAttribute("user_info", user_info);
				
				String eror = user_log.getEr_counter();

				response.setContentType("application/json");
				response.setCharacterEncoding("UTF-8");
				response.getWriter().write(eror);
			} else {
				String eror = user_log.getEr_counter();

				response.setContentType("application/json");
				response.setCharacterEncoding("UTF-8");
				response.getWriter().write(eror);
			}
		} catch (ClassNotFoundException | SQLException | NoSuchAlgorithmException | InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
