package com.naver.app.departments;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class DepartmentCreateController
 */
@WebServlet("/dept/create")
public class DepartmentCreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentCreateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/dept/create.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("db에 저장하기");
		
		String name = request.getParameter("departmentName");
		String n = request.getParameter("managerId");
		String r = request.getParameter("locationId");
		DepartmentDTO dto=new DepartmentDTO();
		DepartmentDAO dao =new DepartmentDAO();
		dto.setDepartmentName(name);
		dto.setManagerId(Integer.parseInt(n));
		dto.setLocationId(Integer.parseInt(r));
		try {
			int result = dao.create(dto);
			if(result >0) {
				response.sendRedirect("/dept/list");
				
				
				
			}else {RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/dept/list.jsp");
			rd.forward(request, response);
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}




