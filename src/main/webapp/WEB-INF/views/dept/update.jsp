<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="/WEB-INF/views/temp/head.jsp"></c:import>
<title>Insert title here</title>
</head>
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<c:import url="/WEB-INF/views/temp/nave.jsp"></c:import>
		
		
			<div class="row gx-5 justify-content-center">
				<form action="/dept/update" method="post"> 
				<div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">부서명</label>
		    <input type="text" name="departmentName"  value="${dto.departmentName}" 
		    class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
				</div>
				
				<input type="hidden" name = "departmentId" value="${dto.departmentId}"  >
				
				<div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">관리자</label>
		    <input type="text" name="managerId"  value="${dto.managerId}" 
		    class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
				</div>
				<div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">지역 코드</label>
		    <input type="text" name="locationId"  value="${dto.locationId}" 
		    class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
				</div>
				
				
				
				
				<button type="submit">button</button>
				<input type="submit"value="create">
				<input type="button" value= "등록">
				<input type="reset" value= "reset">
		</form>
				
			</div>
		</section>
		
	</main>
	<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
</body>
</html>