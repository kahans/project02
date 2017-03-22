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
				<button type="button" class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="brand" href="<c:url value='/library/login'/>">team4 도서관</a>
				
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span8">
				<div class="hero-unit">
					<h1 align="center">도서관관리자등록</h1>
				</div>
				<div class="row-fluid">
					<div class="span4">
					<!-- 도서관관리자등록 -->
						<form action="<c:url value='/library/libraryAdd'/>" method="post">
							<table>
								<tr>
									<th>도서관관리자 ID</th>
									<td><input type="text" name="libraryId"></td>
								</tr>
								<tr>
									<th>비밀번호</th>
									<td><input type="password" name="libraryPw"></td>
								</tr>
								<!-- <tr>
									<th>도서관 이름</th>
									<td><input type="text" name="name"></td>
								</tr> -->
								<tr>
									<th>지역</th>
									<td><select name="localNo">
											<option>지역을 선택해 주세요</option>
											<option value="2">서울</option>
											<option value="3">경기</option>
											<option value="4">전라</option>
											<option value="5">경상</option>
											<option value="6">충청</option>
											<option value="7">강원</option>
									</select></td>
								</tr>
							</table>
							<input type="submit" class="btn btn-primary btn-large" value="가입하기"/>
							<input type="reset" class="btn btn-primary btn-large" value="리셋"/>
						</form>
					</div>
					<!--/span-->

				</div>
				<!--/row-->
			</div>
			<!--/span-->
		</div>
		<!--/row-->

		<hr>

		<footer>
			<p>&copy; tema4</p>
		</footer>

	</div>
	<!--/.fluid-container-->

	<!-- 자바스크립트
    ================================================== -->
	<!-- 페이지를 빨리 읽어들이도록 문서 마지막에 배치 -->
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
