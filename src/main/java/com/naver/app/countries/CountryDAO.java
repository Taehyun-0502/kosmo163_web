package com.naver.app.countries; 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.naver.app.util.DBConnection;

public class CountryDAO {
	private DBConnection db;
	
	public CountryDAO() {
		this.db =new DBConnection();
	}
	
	
	
	public void detail(String name1) throws Exception {
		
		Connection con = db.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES"
				+ " WHERE COUNTRY_ID =?";
		
		PreparedStatement pr = con.prepareStatement(sql);
		pr.setString(1,name1);
		
		ResultSet rs = pr.executeQuery();
		
		if(rs.next()) {
			String name = rs.getString("COUNTRY_NAME");
			System.out.println(name);
			
		}else {
			System.out.println("나라명이 없습니다");
		}
		rs.close();
		pr.close();
		con.close();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

	public ArrayList<CountryDTO> conlist() throws Exception {
		
		Connection con = db.getConnection();
		
		String sql ="SELECT * FROM COUNTRIES";
		
		PreparedStatement pr= con.prepareStatement(sql);
		
		ResultSet rs =pr.executeQuery();
		ArrayList<CountryDTO> ar=new ArrayList<>();
		
		while(rs.next()) {
			CountryDTO dto =new CountryDTO();
			String id = rs.getString("COUNTRY_ID");
			String name = rs.getString("COUNTRY_NAME");
			int reid = rs.getInt("REGION_ID");
			dto.setCountryId(id);
			dto.setCountryName(name);
			dto.setRegionId(reid);
			
			ar.add(dto);
			
			System.out.println(id+" : "+name+" : "+reid);
			
		}
		rs.close();
		pr.close();
		con.close();
		return ar;
		
	}
	
	
}
