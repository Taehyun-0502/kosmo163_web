package com.naver.app.test.countries;

import com.naver.app.countries.CountryDAO;
import com.naver.app.util.DBConnection;

public class CountryTest {

	public static void main(String[] args) {
DBConnection db =new DBConnection();
		
		CountryDAO cdo = new CountryDAO();
		try {
			cdo.detail("BE");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
