<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>country detail Page</h1>
	<h4>${detail.countryId} </h4>
	<h4>${detail.countryName}  </h4>
	<h4>${detail.regionId}  </h4>
	
		<form action ="/country/delete" method="get">
		
		<input type ="hidden" name="countryId" value="${detail.countryId}">
		<button type = "submit" name= "countryId" >delete</button>
		
		</form>
	
	
	
	
	
	
</body>
</html>