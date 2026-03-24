package com.naver.app.test.util;

import java.sql.Connection;

import com.naver.app.util.DBConnection;

public class DBConnectionTest {

	public static void main(String[] args) {
		DBConnection db =new DBConnection();
		try {
			Connection con= db.getConnection();
			if(con !=null) {
				System.out.println("연결 성공");
			}else {
				System.out.println("연결 실패");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
