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
		
		<h1>부서 리스트 입니다</h1>
		<h5>locale a</h5>
		
		<div>
		<table> 
			<thead>
				<tr>
					<th>부서 번호</th>
					<th>부서명</th>
				</tr>
			</thead>
			<tbody>
			
				<c:forEach items="${list}" var="d">
					<tr>
						<td> ${d.departmentId}</td>
						<td> <a href = "/dept/detail?departmentId=${d.departmentId}">${d.departmentName}</a></td>
					</tr>
						
					
					
				
				
				</c:forEach>
			</tbody>
		</table>
		</div>
		
		
		
	</body>
</html>