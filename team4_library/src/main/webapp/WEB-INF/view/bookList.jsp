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
th{
	font-size: 15px;
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
				<a class="brand" href="<c:url value='/library/mainhome'/>">team4 도서관</a>
				<div class="nav-collapse collapse">
					<p class="navbar-text pull-right">
						<a href="#" class="navbar-link">${loginCheck.libraryId}</a>관리자님
						<a href="<c:url value='/library/logout'/>" class="navbar-link">로그아웃</a>
					</p>
					<ul class="nav">
						<li class="active"><a href="<c:url value='/library/bookAdd'/>">도서관리</a></li>
						<li><a href="<c:url value='/library/memberadd'/>">회원관리</a></li>
						<li><a href="<c:url value='/library/rentbook'/>">대여관리</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span3">
				<div class="well sidebar-nav">
					<ul class="nav nav-list">
						<li class="nav-header">도서관리</li>
						<li><a href="<c:url value='/library/bookAdd'/>">도서등록</a></li>
						<li class="active"><a href="<c:url value='/library/bookList'/>">도서목록</a>
						<li><a href="<c:url value='/library/bookDis'/>">도서폐기등록</a></li>
					</ul>
				</div>
				<!--/.well -->
			</div>
			<!--/span-->
			<div class="span8">
				<div class="hero-unit">
					<h1 align="center">도서목록</h1>
				</div>
				<div class="row-fluid">
					<div class="span4">
						<!-- 도서등록 폼 -->
						<table border="1">
							<thead>
								<tr>
									<th>도서코드</th>
									<th>도서이름</th>
									<th>도서저자</th>
									<th>출판사</th>
									<th>장르</th>
									<th>상태</th>
									<th>대여상황</th>
									<th>최신 대여일</th>
									<th>총대여일수</th>
									<th>총대여횟수</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="b" items="${list}">
									<tr>
										<td>${b.bookCode}</td>
										<td>${b.bookName}</td>
										<td>${b.bookAuthor}</td>
										<td>${b.bookPublisher}</td>
										<td>${b.genroName}</td>
										<td>${b.stateName}</td>
										<td>${b.rentalstateName}</td>
										<td>${b.bookFirstday}</td>
										<td>${b.bookTotalDay}</td>
										<td>${b.bookTotalCount}</td>										
									</tr>
								</c:forEach>
							</tbody>
						</table>

						<div>
							<c:if test="${currentPage>1}">
								<a
									href="<c:url value='/library/bookList?currentPage=${currentPage-1}'/>">이전</a>
							</c:if>
							<c:if test="${currentPage < lastPage}">
								<a
									href="<c:url value='/library/bookList?currentPage=${currentPage+1}'/>">다음</a>
							</c:if>
						</div>
					</div>
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
