package com.naver.app.Community;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.naver.app.util.DBConnection;

import jakarta.servlet.RequestDispatcher;

public class CommunityDAO {
		private DBConnection dbc;
	
		public CommunityDAO() {
			this.dbc =new DBConnection();
		}
	
		
		public int update (CommunityDTO dto) throws Exception{
			Connection con =dbc.getConnection();
			String sql ="""
					UPDATE COMMUNITY SET
					TITLE=?,
					COUNTENTS=?,
					STAR=?
					WHERE NUM=?
					""";
			PreparedStatement pr=con.prepareStatement(sql);
			
			pr.setString(1, dto.getTitle());
			pr.setString(2, dto.getCountents());
			pr.setInt(3, dto.getStar());
			
			pr.setLong(4, dto.getNum());
			int result = pr.executeUpdate();
			
			pr.close();
			con.close();
			
			return result;
			
		}
		
		
		
		
		
		
		
		
		
		
		public int delete(CommunityDTO dto) throws Exception {
			Connection con = dbc.getConnection();
			String sql= """
					DELETE COMMUNITY WHERE NUM =?
					""";
			PreparedStatement pr = con.prepareStatement(sql);
			pr.setLong(1, dto.getNum());
			int result =pr.executeUpdate();
			
			pr.close();
			con.close();
			return result;
			
			
		}
		
		
		
		
		
		
		
		
		
		public int create(CommunityDTO dto) throws Exception {
			Connection con =dbc.getConnection();
			String sql = """
			INSERT INTO COMMUNITY 
			VALUES (COMM_SEQ.NEXTVAL,?,?,
					?,sysdate,?)
					""";
			PreparedStatement pr = con.prepareStatement(sql);
			
			pr.setString(1,dto.getTitle());
			pr.setString(2, dto.getName());
			pr.setString(3, dto.getCountents());
			pr.setInt(4, dto.getStar());
			int result = pr.executeUpdate();
			
			
			pr.close();
			con.close();
			return result;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public CommunityDTO detail(long num) throws Exception {
		Connection con =dbc.getConnection();
		String sql = """
				SELECT * FROM COMMUNITY
				WHERE NUM=?
				""";
		
		PreparedStatement pr=con.prepareStatement(sql);
		pr.setLong(1, num);
		CommunityDTO dto =null;
		ResultSet rs =pr.executeQuery();
		if(rs.next()) {
			dto=new CommunityDTO();
			dto.setNum(rs.getLong("NUM"));
			dto.setTitle(rs.getString("TITLE"));
			dto.setName(rs.getString("NAME"));
			dto.setCountents(rs.getString("COUNTENTS"));
			dto.setCreateTime(rs.getDate("CREATETIME"));
			dto.setStar(rs.getInt("STAR"));
			
		}
		rs.close();
		pr.close();
		con.close();
		return dto;
	
	
	
	
	
	
	}
		
		
		
		
		
		
		
		
		
		
		
	public ArrayList<CommunityDTO>  list () throws Exception {
		Connection con= dbc.getConnection();
		String sql = """
				SELECT NUM,TITLE,NAME,CREATETIME,STAR FROM COMMUNITY
				ORDER BY CREATETIME DESC
				""";
		PreparedStatement view = con.prepareStatement(sql);
		ResultSet rs =view.executeQuery();
			ArrayList<CommunityDTO> ar= new ArrayList<>();
			
			while(rs.next()) {
				CommunityDTO dto =new CommunityDTO();
				Long num = rs.getLong("NUM");
				String title =rs.getString("TITLE");
				String name= rs.getString("NAME");
				Date date =rs.getDate("CREATETIME");
				int star = rs.getInt("STAR");
				
				dto.setNum(num);
				dto.setTitle(title);
				dto.setName(name);
				dto.setCreateTime(date);
				dto.setStar(star);
				
				ar.add(dto);
				
			}
			rs.close();
			view.close();
			con.close();
			return ar;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
