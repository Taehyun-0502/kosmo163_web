<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Index Page TH </h1>
		<a href="/comm/list">	전달 사항 리스트		</a>
		
		<c:if test="${empty dto}">
		<a href="/login/member">회원가입</a> 
		<a href="/login/login">로그인</a>
		</c:if>
		<c:if test="${not empty dto}">
		<a href="/login/logout">로그아웃</a>
		<a href="/login/mypage">Mypage</a>
		</c:if>
	</body>
</html>