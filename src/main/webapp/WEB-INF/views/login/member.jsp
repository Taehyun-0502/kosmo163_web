<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입 페이지</h1>
	<form action="/login/member"method="post">
		<label>ID 입력</label>
		<input type="text" name="id">
		<label>PASSWORD 입력</label>
		<input type="password" name="password">
		<label>이름 입력</label>
		<input type="text" name="name">
		<label>EMAIL 입력</label>
		<input type="email" name="email">
		<button>입력</button>
	</form>
	
	
	

</body>
</html>