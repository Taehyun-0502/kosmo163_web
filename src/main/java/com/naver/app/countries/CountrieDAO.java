package com.naver.app.countries; 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.naver.app.util.DBConnection;

public class CountrieDAO {

	public void conlist() throws Exception {
		DBConnection dbc = new DBConnection();
		Connection con = dbc.getConnection();
		
		String sql ="SELECT * FROM COUNTRIES";
		
		PreparedStatement pr= con.prepareStatement(sql);
		
		ResultSet rs =pr.executeQuery();
		
		
		while(rs.next()) {
			
			String id = rs.getString("COUNTRY_ID");
			String name = rs.getString("COUNTRY_NAME");
			int reid = rs.getInt("REGION_ID");
			
			System.out.println(id+" : "+name+" : "+reid);
			
		}
		rs.close();
		pr.close();
		con.close();
		
		
	}
	
	
}
