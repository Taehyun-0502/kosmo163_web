package com.naver.app.test.departments;

import com.naver.app.departments.DepartmentDAO;

public class DepartmentTset {

	public static void main(String[] args) {
		DepartmentDAO dao = new DepartmentDAO();
		try {
			dao.detail(50);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
