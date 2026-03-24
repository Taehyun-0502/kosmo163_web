package com.naver.app.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.naver.app.util.DBConnection;

public class DepartmentDAO {
		private DBConnection dbc;
		public DepartmentDAO() {
			this.dbc = new DBConnection();
			
		}
		
		
	public void detail(int departmentId) throws Exception {
		
		Connection con=dbc.getConnection();
		String sql = """
					SELECT * FROM DEPARTMENTS 
					WHERE DEPARTMENT_ID =?
		""";
		PreparedStatement pr =con.prepareStatement(sql);
		
		
		pr.setInt(1, departmentId);
		
		ResultSet rs =pr.executeQuery();
		if(rs.next()) {
			String id = rs.getNString("DEPARTMENT_NAME");
			System.out.println(id);
		}else {
			System.out.println("부서가 없다.");
		}rs.close();
		pr.close();
		con.close();
		
	}
	
	
	
	
	
	
	
	public void list () throws Exception {
		//db 진입
		
		Connection con = dbc.getConnection();
		// 쿼리문 잣성
		String sql = "SELECT * FROM DEPARTMENTS"
				+ " ORDER BY DEPARTMENT_ID DESC";
		
		PreparedStatement pr = con.prepareStatement(sql);
	//최종 전송 및 결과 처리 	
	ResultSet rs = pr.executeQuery();
	
		while(rs.next()) {
			String name =rs.getString("DEPARTMENT_NAME");
			System.out.println(name);
			int id =rs.getInt("DEPARTMENT_ID");
			System.out.println(id);
			
			
		}
		rs.close();
		pr.close();
		con.close();
		
	}
	
	
}
