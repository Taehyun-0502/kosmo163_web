
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>country</title>
	</head>
	<body>
		<h1>나라 리스트 입니다</h1>
			<div>
				<table>
					
					<thead>
						<tr>
							<th>나라 ID</th><th>나라 이름</th><th>REGION_ID</th>
						</tr>				
					</thead>
					<tbody>
						<c:forEach items ="${list}" var= "d">
						
						<tr>
						<td>${d.countryId}</td>
						<td>
						<a href="/country/detail?countryId=${d.countryId}">${d.countryName}</a> 
						</td>
						<td> ${d.regionId}</td>
						</tr>
						
						
						
						
						</c:forEach>
					
					</tbody>
				
				
				
				
				
				
				</table>
			</div>
			
		
		
		
		
		
	</body>
</html>