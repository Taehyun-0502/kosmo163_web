<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>부서 등록 페이지</h1>
	
		<form action="/dept/create" method="post"> 
				<div>
					<label >부서명</label>
					<input type="text" >
				</div>
				<div>
					<label>관리자 </label>
					<input type="text" >
				</div>
				<div>
					<lable>지역 코드</lable>
					<input type="text">
				</div>
				<button type="submit">button</button>
				<input type="submit"value="create">
				<input type="button" value= "등록">
				<input type="reset" value= "reset">
		</form>
				
	
	
	
</body>
</html>