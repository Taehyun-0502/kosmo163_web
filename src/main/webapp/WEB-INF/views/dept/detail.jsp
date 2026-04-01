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
		
		<section class="py-5">
			<div class="container px-5 mb-5">
				<div class="text-center mb-5">
                        <h1 class="display-5 fw-bolder mb-0"><span class="text-gradient d-inline">Detail page</span></h1>
                    </div>
			</div>
			<div class="row gx-5 justify-content-center">
				<div class="row gx-5 justify-content-center">
					<ul class="list-group">
			  			<li class="list-group-item">부서 ID : ${detail.departmentId}</li>
			  			<li class="list-group-item">부서 명 : ${detail.departmentName}</li>
			  			<li class="list-group-item">관리자ID : ${detail.managerId}</li>
						  <li class="list-group-item">지역ID : ${detail.locationId}</li>  
					</ul>
				</div>	 
                              
					
		<a href="/dept/update?departmentId=${detail.departmentId}">수정</a>
		<a href="/dept/delete?departmentId=${detail.departmentId}">삭제</a>
		<form action="/dept/delete"method="get">
			<input type="hidden" name="departmentId"  value="${detail.departmentId}">
			<button type= "submit">delete</button>
		</form>
				
			</div>
		</section>
		
	</main>
	<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
</body>
</html>