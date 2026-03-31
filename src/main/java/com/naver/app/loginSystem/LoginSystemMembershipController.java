package com.naver.app.loginSystem;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LoginSystemMembershipController
 */
@WebServlet("/login/member")
public class LoginSystemMembershipController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSystemMembershipController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher re = request.getRequestDispatcher("/WEB-INF/views/login/member.jsp");
		re.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id =request.getParameter("id");
		String password =request.getParameter("password");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		LoginSystemDTO dto =new LoginSystemDTO();
		LoginSystemDAO dao =new LoginSystemDAO();
		dto.setId(id);
		dto.setPassword(password);
		dto.setName(name);
		dto.setEmail(email);
		
		try {
			dto = dao.membership(dto);
			if (dto !=null) {
				System.out.println("가입 성공");
				
			} else {
				System.out.println("가입 실패");
			} 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
