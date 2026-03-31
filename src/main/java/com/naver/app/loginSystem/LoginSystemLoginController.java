package com.naver.app.loginSystem;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class LoginSystemLoginController
 */
@WebServlet("/login/login")
public class LoginSystemLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSystemLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher re =request.getRequestDispatcher("/WEB-INF/views/login/login.jsp");
		re.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id =request.getParameter("id");
		String password =request.getParameter("password");
		
		
		LoginSystemDTO dto = new LoginSystemDTO();
		dto.setId(id);
		dto.setPassword(password);
		
		LoginSystemDAO dao= new LoginSystemDAO();
		
		try {
			dto = dao.login(dto);
			if(dto !=null) {
				System.out.println("ok");
				
			}else {
				System.out.println("fail");
			}
			
			HttpSession sess = request.getSession();
			sess.setAttribute("dto", dto);
			response.sendRedirect("/home");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
