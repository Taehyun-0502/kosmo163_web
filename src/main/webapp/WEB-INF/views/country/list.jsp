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
                        <h1 class="display-5 fw-bolder mb-0"><span class="text-gradient d-inline">나라 리스트</span></h1>
                    </div>
			</div>
			<div class="row gx-5 justify-content-center">
				
			<div>
					<div>
						<a class="btn btn-primary" href="/country/create" >나라등록 </a>
					</div>
				<table class="table table-success table-striped-columns">
					<thead>
						
						<tr class="table-info">
							<th>나라 ID</th><th>나라 이름</th><th>REGION_ID</th>
						</tr>				
					</thead>
					<tbody>
						<c:forEach items ="${list}" var= "d">
						<tr class="table-info">
						<td class="table-info">${d.countryId}</td>
						<td class="table-info">
						<a href="/country/detail?countryId=${d.countryId}">${d.countryName}</a> 
						</td>
						<td class="table-info"> ${d.regionId}</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
				
			</div>
		</section>
		
	</main>
	<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
</body>
</html>