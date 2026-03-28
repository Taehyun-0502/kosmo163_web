<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> 글 내용</h1>
		<a href="/comm/update?num=${detail.num}">수정</a> 
		<a href="/comm/delete?num=${detail.num}">삭제</a> 
	<table>
		<thead>
			<th>글 번호</th><th>글 제목</th><th>작성자</th><th>글 내용</th><th>작성일</th><th>평점</th>
		</thead>
		<tbody>
			<tr>
				<td>${detail.num}</td>
				<td>${detail.title}</td>			
				<td>${detail.name}</td>			
				<td>${detail.countents}</td>			
				<td>${detail.createTime}</td>
				<td>${detail.star}</td>
							
			</tr>				
		</tbody>
	
	
	
	</table>
	
	
	
	

</body>
</html>