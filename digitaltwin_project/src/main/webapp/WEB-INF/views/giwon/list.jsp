<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org" xmlns:layout="http://www.ultraq.net.nz/web/thymeleaf/layout">
<head>
<meta charset="UTF-8" />
<title>스프링부트 thymeleaf</title>

<meta name="viewport" content="width=device-width, initial-scale=1"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>


<style>
	.devCss {
		 text-align: center;
	}
</style>

</head>
<body>
	
	<div class="container">
		<div class="row col-md-7 table-responsive">
			<table class="table devCss" id="listTable">
		    <thead>
			    <tr>
			         <th>제목</th>
			         <th>내용</th>
			         <th>등록한 ID</th>
			         <th>등록한 날짜</th>
			     </tr>
		     </thead>
		     <tbody>
			     <tr th:if="${totalCnt} > 0" th:each="list : ${list}">
			         <td th:text="${list.title}">title</td>    
			         <td th:text="${list.content}">content</td>
			         <td th:text="${list.regid}">regid</td>
			         <td th:text="${list.regdate}">regdate</td>
			     </tr>	
			     <tr th:unless="${totalCnt} > '0'">
			     	<td colspan="4">게시물 없음</td>
			     </tr>
		     </tbody>
		     </table>
	     </div>
	</div>
	
</body>
</html>