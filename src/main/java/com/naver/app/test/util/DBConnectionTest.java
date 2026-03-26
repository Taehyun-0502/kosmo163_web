package com.naver.app.test.util;

import java.sql.Connection;

import com.naver.app.countries.CountryDAO;
import com.naver.app.departments.DepartmentDAO;
import com.naver.app.departments.DepartmentDTO;
import com.naver.app.util.DBConnection;

public class DBConnectionTest {

	public static void main(String[] args) {
		DBConnection db =new DBConnection();
		
		CountryDAO cdo = new CountryDAO();
		
		DepartmentDAO dao=new DepartmentDAO();
		
		try {
			DepartmentDTO dto = new DepartmentDTO();
			dto.setDepartmentName("class3");
			dto.setManagerId(null);
			dto.setLocationId(null);
			dao.create(dto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
