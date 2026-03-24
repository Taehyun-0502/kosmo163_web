package com.naver.app.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import com.naver.app.util.DBConnection;

public class EmployeesDAO {

	private DBConnection dbc;
	
	public EmployeesDAO() {
		this.dbc = new DBConnection();
		
		
	}
	public void detail(int id) throws Exception {
		Connection con= dbc.getConnection();
		
		String sql = "SELECT * FROM EMPLOYEES "
				+ " WHERE EMPLOYEE_ID=?";
		
		PreparedStatement pr=con.prepareStatement(sql);
		pr.setInt(1,id );
		
		ResultSet rs=pr.executeQuery();
		
		if(rs.next()) {
			int sar = rs.getInt("SALARY");
			System.out.println(sar);
			
		}else {
			System.out.println("없습니다");
		}
		rs.close();
		pr.close();
		con.close();
		
		
		
	}
	
	
	
	public void list() throws Exception {
		Connection con = dbc.getConnection();
		
		String sql = "SELECT * FROM EMPLOYEES";
		
		PreparedStatement pr = con.prepareStatement(sql);
		ResultSet rs = pr.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt("EMPLOYEE_ID");
			String fm =rs.getString("FIRST_NAME");
			String lm = rs.getString("LAST_NAME");
			String email = rs.getString("EMAIL");
			Date date = rs.getDate("HIRE_DATE");
			String job = rs.getString("JOB_ID");
			int sal = rs.getInt("SALARY");
			double comm = rs.getDouble("COMMISSION_PCT");
			int manaer = rs.getInt("MANAGER_ID");
			int deid = rs.getInt("DEPARTMENT_ID");
			
			System.out.println(id+" : "+fm+" : "+ lm);
			
			
		}
		
		
		
		
		
	}
	
	
	
	
}
