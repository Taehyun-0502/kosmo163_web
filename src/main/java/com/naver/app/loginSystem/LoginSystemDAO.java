package com.naver.app.loginSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.naver.app.util.DBConnection;



public class LoginSystemDAO {
	
	private DBConnection dbc;
	
	public LoginSystemDAO() {
		this.dbc = new DBConnection();	
	}
	
	public LoginSystemDTO login(LoginSystemDTO dto) throws Exception {
		Connection con =dbc.getConnection();
		String sql = """
				SELECT * FROM LOGINSYSTEM
				WHERE ID=? AND PASSWORD =? 
				""";
		PreparedStatement pr = con.prepareStatement(sql);
		pr.setString(1, dto.getId());
		pr.setString(2, dto.getPassword());
		ResultSet re = pr.executeQuery();
		
		if(re.next()) {
			dto.setId(re.getString("id"));
			dto.setPassword(re.getString("password"));
			dto.setName(re.getString("name"));
			dto.setEmail(re.getString("email"));
			return dto;
		}else {
			return null;
			}
		
		
		
	}
	
	
	
	
	
	
	
	
	public LoginSystemDTO membership (LoginSystemDTO dto) throws Exception {
		Connection con =dbc.getConnection();
		String sql ="""
				INSERT  INTO LOGINSYSTEM 
				VALUES (?,?,?,?)
				""";
		PreparedStatement pr = con.prepareStatement(sql);
		pr.setString(1, dto.getId());
		pr.setString(2, dto.getPassword());
		pr.setString(3, dto.getName());
		pr.setString(4, dto.getEmail());
		
		int result = pr.executeUpdate();
		
		if(result>0) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("다시 시도하세요");
		}
		return dto;
		
		
	}
	
	
	

}
