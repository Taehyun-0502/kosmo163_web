package com.naver.app.employees;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class EmployeeLoginController
 */
@WebServlet("/emp/login")
public class EmployeeLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/emp/login.jsp");
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id =request.getParameter("employeeId");
		String password =request.getParameter("passWord");
	    int i = Integer.parseInt(id);
		EmployeeDTO dto =new EmployeeDTO();
		dto.setEmployeeId(i);
		dto.setPassWord(password);
		
		EmployeesDAO dao =new EmployeesDAO();
		
		try {
			dto = dao.login(dto);
			if(dto  != null) {
				System.out.println("ok");
				
			}else {
				System.out.println("fail");
			}
			
			
			HttpSession session = request.getSession();
			session.setAttribute("dto", dto);
			
			response.sendRedirect("/home");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
