<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>나라 입력 페이지</h1>
			
					<form action="/country/create" method="post">
						<div>
						<label>나라 아이디</label>
						<input type ="text"name="countryId">
						</div>
						<div>
						<label>나라 이름</label>
						<input type= "text"name="countryName">
						</div>
						<div>
						<label>나라 코드</label>
						<input type ="txet" name="regionId">
						</div>
						<button type="submit" >등록</button>
						
					</form>
				
		
		
		
		
		
		
		
		
</body>
</html>