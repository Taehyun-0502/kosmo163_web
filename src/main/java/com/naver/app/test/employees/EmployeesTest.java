package com.naver.app.test.employees;

import java.sql.Connection;

import com.naver.app.employees.EmployeesDAO;
import com.naver.app.util.DBConnection;

public class EmployeesTest {

	public static void main(String[] args) {
		
		DBConnection dbc =new DBConnection();
		EmployeesDAO edo= new EmployeesDAO();
		try {
			edo.detail(104);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
