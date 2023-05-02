<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
html {
   font-size: 24px;
}

#container{
   width: 1100px;
   margin: 0 auto;
}

.itembox {
   border: 1px solid #ccc;
   width: 800px;
   margin: 5px auto;
   padding: 10px;
}

.item{
   font-weight: bold;
   display: inline-block;
   width: 200px;
   
   border-right: 1px solid black;
   margin-right: 10px;
}

#btnBox {
	text-align: center;
	margin-top: 1em;
}

#btnBox button {
	font-size: 30px;
	padding: 10px;
}



</style>
</head>
<body>

<div id="container">

<h1>사원 상세보기</h1>
<hr>

<div class="itembox"><span class="item">사번</span><span class="data">${emp.empno }</span></div>
<div class="itembox"><span class="item">사원이름</span><span class="data">${emp.ename }</span></div>
<div class="itembox"><span class="item">직무</span><span class="data">${emp.job }</span></div>
<div class="itembox"><span class="item">매니저</span><span class="data">${emp.mgr }</span></div>
<%-- <div class="itembox"><span class="item">입사날짜</span><span class="data">${emp.hireDate }</span></div> --%>
<div class="itembox"><span class="item">급여</span><span class="data">${emp.sal }</span></div>
<div class="itembox"><span class="item">상여금</span><span class="data">${emp.comm }</span></div>
<div class="itembox"><span class="item">부서번호</span><span class="data">${emp.deptno }</span></div>

</div>

<div id="btnBox">
	<a href="./list"><button>목록</button></a>
</div>





</body>
</html>