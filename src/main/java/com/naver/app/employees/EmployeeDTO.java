package com.naver.app.employees;

import java.sql.Date;

public class EmployeeDTO {
	
	// DTO 만드는 규칙 
	//멤버 변수의 접근제한자는 private으로 한다 
	//멤버 변수의 데이터 타입과 변수명은 테이블과 동일하게 한다. 
	//database는 snake, java는 camel
	//getter, setter가 필수다 
	//생성자는 여러개 있어도 상관 없지만 기본 생성자는 필수다 
	
	private int employeeId;
	private String passWord;
	private String firstName;
	private String lastName;
	private String  email;
	private String phoneNumber;
	private Date hireDate;
	private String jobId;
	private double salary;
	private Double commissionPct;
	private int managerId;
	private Integer departmentId;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Double getCommissionPct() {
		return commissionPct;
	}
	public void setCommissionPct(Double commissionPct) {
		this.commissionPct = commissionPct;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	
	
	
	
	
	
	

}
