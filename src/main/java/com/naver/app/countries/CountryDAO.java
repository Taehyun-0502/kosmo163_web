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
	
	public int create(CountryDTO dto) throws Exception {
			Connection connection=db.getConnection();
			String sql ="""
					INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME,REGION_ID)
					VALUES (?,?,?)
					""";
			
			PreparedStatement st= connection.prepareStatement(sql);
			st.setString(1, dto.getCountryId());
			st.setString(2, dto.getCountryName());
			st.setInt(3, dto.getRegionId());
			
			int result = st.executeUpdate();
			
			st.close();
			connection.close();
			
			return result;
	}
	
	
	
	
	public CountryDTO detail(String name1) throws Exception {
		
		Connection con = db.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES"
				+ " WHERE COUNTRY_ID =?";
		
		PreparedStatement pr = con.prepareStatement(sql);
		pr.setString(1,name1);
		CountryDTO dto =null;
		ResultSet rs = pr.executeQuery();
		
		if(rs.next()) {
			dto =new CountryDTO();
			dto.setCountryId(rs.getString("COUNTRY_ID"));
			String name = rs.getString("COUNTRY_NAME");
			dto.setRegionId(rs.getInt("REGION_ID"));
			System.out.println(name);
			
		}
		rs.close();
		pr.close();
		con.close();
		return dto;
		
		
		
		
		
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
