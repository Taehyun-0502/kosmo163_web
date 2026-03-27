package com.naver.app.departments;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class DepartmentUpdateController
 */
@WebServlet("/dept/update")
public class DepartmentUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("departmentId");
		int n =Integer.parseInt(id);
		
		DepartmentDAO dao =new DepartmentDAO();
		try {
			DepartmentDTO dto = dao.detail(n);
			request.setAttribute("dto", dto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher re= request.getRequestDispatcher("/WEB-INF/views/dept/update.jsp");
		
		re.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		DepartmentDTO dto = new DepartmentDTO();
		
		dto.setDepartmentId(Integer.parseInt(request.getParameter("departmentId")));
		dto.setDepartmentName(request.getParameter("departmentName"));
		dto.setManagerId(Integer.parseInt(request.getParameter("managerId")));
		dto.setLocationId(Integer.parseInt(request.getParameter("locationId")));
		
		DepartmentDAO dao =new DepartmentDAO();
		
		
		try {
			int result =dao.update(dto);
			if(result>0) {
				response.sendRedirect("/dept/list");
				
			}else {
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
