<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<title>Signin Bootstrap</title>

<!-- 
<!-- Custom styles for this template -->
<link href="<c:url value='/resources/css/signin.css'/>" rel="stylesheet">
<link href="<c:url value='/resources/css/bootstrap.min.css'/>" rel="stylesheet">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
</head>
<!-- 자바스크립트로 로그인 -->
<script type="text/javascript">
	/* function idPw(){
		if(document.getElementById("id").value=="id001"){
			if(document.getElementById("pw").value=="1111"){
				
				alert("로그인합니다.")
				document.getElementById("f1").submit();
			}else{
				alert("비번틀림")
			}
		}else{
			alert("아이디가 틀림")
		}
	} */
</script>
<style>
body, html {
	height: 100%
}
.bgimg {
	background-image: c:url (value='/resources/img/book2.jpg');
	min-height: 100%;
	background-position: center;
	background-size: cover;
}
</style>
<body>

	<div class="bgimg w3-display-container w3-animate-opacity ">
		<div class="w3-display-topleft w3-padding-large w3-xlarge">
			<h1>Team4</h1>
		</div>
		<form id="f1" class="form-signin " action="<c:url value='/library/login'/>" method="post">
			<!-- <h2 class="form-signin-heading">로그인</h2> -->
			<label for="libraryId" class="sr-only">아이디</label>
			<input type="text" id="libraryId" name="libraryId"class="form-control"  placeholder="ID" value="id001" required autofocus>
			<label for="libraryPw" class="sr-only">비밀번호</label>
			<input type="password" id="libraryPw" name="libraryPw" class="form-control" placeholder="Password" value="pw001" required>
			<input class="btn btn-lg btn-primary btn-block" type="submit" value="로그인"/>
			<a href="<c:url value='/libraryAdd'/>" class="btn btn-lg btn-primary btn-block" type="button">도서관관리자 등록</a>
<!-- 		<button class="btn btn-lg btn-primary btn-block" type="button">도서관관리자 등록</button>-->
		</form>

	</div>
	<!-- /container -->


	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
</body>
</html>
