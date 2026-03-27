package com.naver.app.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.naver.app.util.DBConnection;

public class DepartmentDAO {
		private DBConnection dbc;
		public DepartmentDAO() {
			this.dbc = new DBConnection();
			
		}
		
		public int delete(DepartmentDTO dto) throws Exception {
			Connection con= dbc.getConnection();
			String sql="""
					DELETE DEPARTMENTS WHERE DEPARTMENT_ID = ?
					""";
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, dto.getDepartmentId());
			int result =st.executeUpdate();
			
			st.close();
			con.close();
			
			return result;
			
			
		}
		
		
		
		
		
		
		
		
		
		public int create(DepartmentDTO dto) throws Exception {
			Connection con= dbc.getConnection();
			String sql = """ 
					INSERT INTO DEPARTMENTS
					VALUES (DEPARTMENTS_SEQ.NEXTVAL,?,?,?)
					""";
			PreparedStatement pr =con.prepareStatement(sql);
			pr.setString(1, dto.getDepartmentName());
			pr.setInt(2, dto.getManagerId());
			pr.setInt(3, dto.getLocationId());
			
			int result = pr.executeUpdate();
			
			
			
			pr.close();
			con.close();
			
			return result;
			
		}
		
		
		
		
		
		
	public DepartmentDTO detail(int departmentId) throws Exception {
		
		Connection con=dbc.getConnection();
		String sql = """
					SELECT * FROM DEPARTMENTS 
					WHERE DEPARTMENT_ID =?
		""";
		PreparedStatement pr =con.prepareStatement(sql);
		
		
		pr.setInt(1, departmentId);
		DepartmentDTO dto=null;
		ResultSet rs =pr.executeQuery();
		if(rs.next()) {
			dto =new DepartmentDTO();
			dto.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
			dto.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
			dto.setManagerId(rs.getInt("MANAGER_ID"));
			dto.setLocationId(rs.getInt("LOCATION_ID"));
			
			
		}
		rs.close();
		pr.close();
		con.close();
		return dto;
		
	}
	
	
	
	
	
	
	
	public ArrayList<DepartmentDTO> list () throws Exception {
		//db 진입
		
		Connection con = dbc.getConnection();
		// 쿼리문 잣성
		String sql = "SELECT * FROM DEPARTMENTS"
				+ " ORDER BY DEPARTMENT_ID DESC";
		
		PreparedStatement pr = con.prepareStatement(sql);
	//최종 전송 및 결과 처리 	
	ResultSet rs = pr.executeQuery();
		ArrayList<DepartmentDTO> ar =new ArrayList<>();
		while(rs.next()) {
			DepartmentDTO dto =new DepartmentDTO();
			String name =rs.getString("DEPARTMENT_NAME");
			System.out.println(name);
			int id =rs.getInt("DEPARTMENT_ID");
			System.out.println(id);
			int mid = rs.getInt("MANAGER_ID");
			int lid = rs.getInt("LOCATION_ID");
			
			dto.setDepartmentName(name);
			dto.setDepartmentId(id);
			dto.setManagerId(mid);
			dto.setLocationId(lid);
			
			ar.add(dto);
			
		}
		rs.close();
		pr.close();
		con.close();
		return ar;	
	}
	
	
}
