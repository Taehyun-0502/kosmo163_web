<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>디테일 수정 폼</h1>
	
	<form action="/dept/update" method="post"> 
	
				<input type="hidden" name = "departmentId" value="${dto.departmentId}"  >
				<div>
					<label >부서명</label>
					<!-- DTO 의 setter의 이름과 동일하게  -->
					<input type="text" name="departmentName" value="${dto.departmentName}">
				</div>
				<div>
					<label>관리자 </label>
					<input type="text" name="managerId" value="${dto.managerId}">
				</div>
				<div>
					<lable>지역 코드</lable>
					<input type="text" name="locationId" value="${dto.locationId}">
				</div>
				<button type="submit">button</button>
				<input type="submit"value="create">
				<input type="button" value= "등록">
				<input type="reset" value= "reset">
		</form>
	
	
	
	
</body>
</html>