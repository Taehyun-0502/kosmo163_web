<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>수정 페이지</h1>
		<form action="/comm/update" method="post"> 
		<input type="hidden" name = "num" value="${dto.num}" >
		<div>
			<label>글 제목</label>
			<input type="text" name="title">
		</div>
		<div>
			<label>내용</label>
			<input type="text" name="countents">
		</div>
		<div>
			<label>중요도</label>
			<input type="text" name="star">
		</div>
		<button type="submit">수정</button>
		</form>
		
</body>
</html>