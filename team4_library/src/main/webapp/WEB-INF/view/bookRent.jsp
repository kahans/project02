<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
<meta charset="utf-8">
<title>team4 도서관</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- 스타일 -->
<link href="../css/bootstrap-ko.css" rel="stylesheet">
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
<link href="../css/bootstrap-responsive.css" rel="stylesheet">

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
				<a class="brand" href="../view/mainHome.html">team4 도서관</a>
				<div class="nav-collapse collapse">
					<p class="navbar-text pull-right">
						<!-- 로그인과 로그아웃을 if문으로 설정하기 -->
						<a href="../view/loginform.html" class="navbar-link">로그인</a>
					</p>
					<ul class="nav">
						<li><a href="../view/bookRegister.html">도서관리</a></li>
						<li><a href="../view/memberJoin.html">회원관리</a></li>
						<li class="active"><a href="../view/bookRent.html">대여관리</a></li>
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
						<li class="nav-header">대여관리</li>
						<li class="active"><a href="../view/bookRent.html">도서대여</a></li>
						<li><a href="../view/bookReturn.html">도서반납</a></li>
					</ul>
				</div>
				<!--/.well -->
			</div>
			<!--/span-->
			<div class="span8">
				<div class="hero-unit">
					<h1 align="center">대여</h1>
				</div>
				<div class="row-fluid">
					<div class="span4">
						<!-- 대여 폼 -->
						<form action="#" method="post">
							<div>
								도서코드: <input type="text" name="bookCode" />
							</div>
							<div>
								회원코드: <input type="text" name="memberId" />
							</div>
							<div>
								대여일: <input type="date" name="startDate" />
							</div>
							<div>
								종료일: <input type="date" name="endDate" />
							</div>
							<div>
								결제금액: <input type="text" name="rentalPay" />
							</div>
							<!-- <input type="submit" value="대여" />
							<input type="reset"	value="초기화" /> -->
						</form>
						<input type="submit" class="btn btn-primary btn-large" value="대여" />
						<input type="reset" class="btn btn-primary btn-large" value="리셋" />
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
</body>
</html>
