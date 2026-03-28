package com.naver.app.Community;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CommunityCreateController
 */
@WebServlet("/comm/create")
public class CommunityCreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommunityCreateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher re= request.getRequestDispatcher("/WEB-INF/views/comm/create.jsp");
		re.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title =request.getParameter("title");
		String name = request.getParameter("name");
		String countents = request.getParameter("countents");
		String star =request.getParameter("star");
		CommunityDTO dto =new CommunityDTO();
		CommunityDAO dao =new CommunityDAO();
		dto.setTitle(title);
		dto.setName(name);
		dto.setCountents(countents);
		dto.setStar(Integer.parseInt(star));
		
		try {
			int result =dao.create(dto);
			
			if(result>0) {
				response.sendRedirect("/comm/list");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
