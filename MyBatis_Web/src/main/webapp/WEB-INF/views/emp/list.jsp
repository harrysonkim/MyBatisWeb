<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>+ + harryson + +</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-2.2.4.min.js"></script>
<script type="text/javascript">
$( () => {

	$("#ename").click(function() {
		var empno = $("#empno").html()
		location.href = "/emp/detail?empno=" + empno
		console.log(empno);
	})

})
</script>
</head>
<body>
<div class="container text-center">
<h1 class="mt-5">사원 목록</h1>
<table class="table mt-5">
	<thead>
		<tr> 
			<th scope="col">사원번호</th>
			<th scope="col">사원이름</th>
			<th scope="col">직무</th>
			<th scope="col">관리자번호</th>
		</tr>
	</thead>
	<tbody class="table-group-divider">
	<c:forEach var ="emp" items="${emplist }">
		<tr>
			<td id="empno">${emp.empno }</td>
			<td id="ename">${emp.ename }</td>
			<td>${emp.job }</td>
			<td>${emp.mgr }</td>
		</tr>
	</c:forEach>
</tbody>
</table>
</div>

</body>
</html>