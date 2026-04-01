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
                        <h1 class="display-5 fw-bolder mb-0"><span class="text-gradient d-inline">나라 정보 입력 </span></h1>
                    </div>
			</div>
			<div class="row gx-5 justify-content-center">
				
			
					<form action="/country/create" method="post">
						<div>
						<label>나라 아이디</label>
						<input type ="text"name="countryId">
						</div>
						<div>
						<label>나라 이름</label>
						<input type= "text"name="countryName">
						</div>
						<div>
						<label>나라 코드</label>
						<input type ="txet" name="regionId">
						</div>
						<button type="submit" >등록</button>
						
					</form>
				
				
			</div>
		</section>
		
	</main>
	<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
</body>
</html>