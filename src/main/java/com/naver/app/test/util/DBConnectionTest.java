package com.naver.app.test.util;

import java.sql.Connection;

import com.naver.app.countries.CountrieDAO;
import com.naver.app.departments.DepartmentDAO;
import com.naver.app.util.DBConnection;

public class DBConnectionTest {

	public static void main(String[] args) {
		DBConnection db =new DBConnection();
		
		CountrieDAO cdo = new CountrieDAO();
		try {
			cdo.conlist();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
