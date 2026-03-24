package com.naver.app.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.naver.app.util.DBConnection;

public class DepartmentDAO {

	public void list () throws Exception {
		//db 진입
		DBConnection dbc = new DBConnection();
		Connection con = dbc.getConnection();
		// 쿼리문 잣성
		String sql = "SELECT * FROM DEPARTMENTS";
		
		PreparedStatement pr = con.prepareStatement(sql);
	//최종 전송 및 결과 처리 	
	ResultSet rs = pr.executeQuery();
	
		while(rs.next()) {
			String name =rs.getString("DEPARTMENT_NAME");
			System.out.println(name);
			int id =rs.getInt("DEPARTMENT_ID");
			System.out.println(id);
			
			
		}
		rs.close();
		pr.close();
		con.close();
		
	}
	
	
}
