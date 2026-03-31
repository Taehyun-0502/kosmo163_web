<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 화면 </h1>
	
		<form action="/emp/login"method="post">
		<label>ID 입력</label>
		<input type="text" name="employeeId" >
		<label>PASSWORD 입력</label>
		<input type="password" name="passWord">
		<button type="submit"> Login </button>
		
		
		</form>
	
	

</body>
</html>