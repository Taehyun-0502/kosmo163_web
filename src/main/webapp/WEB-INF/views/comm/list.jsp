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
		<h1>커뮤니티 리스트 입니다</h1>
		<div>
			<table>
					<thead>
						<tr>
						<th>글번호</th><th>글 제목</th><th>작성자</th><th>작성시간</th><th>평점</th>	
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list}" var="d">
							<tr>
							<td>${d.num}</td>
							<td><a href="/comm/detail">${d.title}</a></td>
							<td>${d.name}</td>
							<td>${d.createTime}</td>
							<td>${d.star}</td>
							</tr>
						</c:forEach>
					
					</tbody>
					
					
			</table>

		</div>
		
		
		
</body>
</html>