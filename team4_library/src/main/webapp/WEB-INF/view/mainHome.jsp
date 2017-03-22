<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
<meta charset="utf-8">
<title>team4 도서관</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- 스타일 -->
<link href="<c:url value='/resources/css/bootstrap-ko.css'/>" rel="stylesheet">
<style type="text/css">
body {
	padding-top: 60px;
	padding-bottom: 40px;
}

.sidebar-nav {
	padding: 9px 0;
}

@media ( max-width : 980px) {
	/* Enable use of floated navbar text */
	.navbar-text.pull-right {
		float: none;
		padding-left: 5px;
		padding-right: 5px;
	}
}
</style>
<link href="<c:url value='/resources/css/bootstrap-responsive.css'/>" rel="stylesheet">

<!-- IE6~8에서 HTML5 태그를 지원하기위한 HTML5 shim -->
<!--[if lt IE 9]>
      <script src="../assets/js/html5shiv.js"></script>
    <![endif]-->

<!-- 파비콘과 앱 아이콘 -->
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="../assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="../assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="../assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="../assets/ico/apple-touch-icon-57-precomposed.png">
<link rel="shortcut icon" href="../assets/ico/favicon.png">
</head>

<body>

	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container-fluid">
				<button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="brand" href="<c:url value='/library/mainhome'/>">team4 도서관</a>
				<div class="nav-collapse collapse">
					<p class="navbar-text pull-right">
						<!-- 로그인과 로그아웃을 설정하기 -->
						<a href="#" class="navbar-link">${loginCheck.libraryId}</a>관리자님
						<a href="<c:url value='/library/logout'/>" class="navbar-link">로그아웃</a>
					</p>
					<ul class="nav">
						<li><a href="<c:url value='/library/bookAdd'/>">도서관리</a></li>
						<li><a href="<c:url value='/library/memberadd'/>">회원관리</a></li>
						<li><a href="<c:url value='/library/rentbook'/>">대여관리</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>

	<div class="container-fluid">
		<!-- 메인 중앙 화면 -->
		<!-- <div class="row-fluid">사이드바 태그 -->
		<div class="span3">
			<!-- <div class="well sidebar-nav">
					<ul class="nav nav-list">
						<li class="nav-header">사이드바</li>
						<li class="active"><a href="#">Link</a></li>
						<li><a href="#">링크</a></li>
						<li><a href="#">링크</a></li>
						<li><a href="#">링크</a></li>
				
					</ul>
				</div> -->
			<img src="<c:url value='/resources/img/book2.jpg'/>" class="img-rounded" alt="Cinque Terre" />
		</div>
		<!--/span-->
		<div class="span9">
			<!-- <div class="hero-unit">
					<h1>헬로우, 월드!</h1>
					<p>간단한 마케딩이나 정보 웹사이트를 위한 틀이다. 히어로 유닛이라는 커다란 공간과 세가지 부수적인 내용이
						들어있다. 여러분 고유의 웹사이트를 만들 출발점으로 활용하라.</p>
					<p>
						<a href="#" class="btn btn-primary btn-large">더 알아보기 <span
							class="en-font-family">&raquo;</span></a>
					</p>
				</div> -->
			<div class="row-fluid">
				<div class="span4">
					<h2>공지사항</h2>
					<p>목록</p>
					<p>
						<a class="btn" href="#">자세히 보기 <span class="en-font-family">&raquo;</span></a>
					</p>
				</div>

			</div>
		</div>
		<!--/span-->
		<!-- </div> -->
		<!--/row-->

	</div>
	<div>
		<hr>

		<footer>
			<p>&copy; tema4</p>
		</footer>
	</div>
	<!--/.fluid-container-->
	<script src="<c:url value='/resources/js/jquery.js'/>"></script>
	<script src="<c:url value='/resources/js/bootstrap-alert.js'/>"></script>
	<script src="<c:url value='/resources/js/bootstrap-modal.js'/>"></script>
	<script src="<c:url value='/resources/js/bootstrap-dropdown.js'/>"></script>
	<script src="<c:url value='/resources/js/bootstrap-scrollspy.js'/>"></script>
	<script src="<c:url value='/resources/js/bootstrap-tab.js'/>"></script>
	<script src="<c:url value='/resources/js/bootstrap-tooltip.js'/>"></script>
	<script src="<c:url value='/resources/js/bootstrap-popover.js'/>"></script>
	<script src="<c:url value='/resources/js/bootstrap-button.js'/>"></script>
	<script src="<c:url value='/resources/js/bootstrap-collapse.js'/>"></script>
	<script src="<c:url value='/resources/js/bootstrap-carousel.js'/>"></script>
	<script src="<c:url value='/resources/js/bootstrap-typeahead.js'/>"></script>
</body>
</html>
