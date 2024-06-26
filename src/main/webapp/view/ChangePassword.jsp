3
<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="description" content="">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<!-- Title -->
<title>Vizew - Blog &amp; Magazine HTML Template</title>

<!-- Favicon -->
<link rel="icon"
	href="<c:url value="/view/img/core-img/favicon.ico" /> ">

<!-- Stylesheet -->
<link rel="stylesheet" href='<c:url value ="/view/style.css" />'>

</head>

<body>
	<!-- Preloader -->
	<div class="preloader d-flex align-items-center justify-content-center">
		<div class="lds-ellipsis">
			<div></div>
			<div></div>
			<div></div>
			<div></div>
		</div>
	</div>
	<!-- ##### Header Area Start ##### -->
	<c:import url="/nav"></c:import>
	<!-- ##### Header Area End ##### -->

	<!-- ##### Breadcrumb Area Start ##### -->
	<div class="vizew-breadcrumb">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<nav aria-label="breadcrumb">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="#"><i
									class="fa fa-home" aria-hidden="true"></i> Home</a></li>
							<li class="breadcrumb-item active" aria-current="page">Login</li>
						</ol>
					</nav>
				</div>
			</div>
		</div>
	</div>
	<!-- ##### Breadcrumb Area End ##### -->

	<!-- ##### Login Area Start ##### -->
	<div class="vizew-login-area section-padding-80">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-12 col-md-6">
					<div class="login-content">
						<!-- Section Title -->
						<div class="section-heading">
							<h4>Đổi Mật Khẩu</h4>
							<div class="line"></div>
						</div>

						<form action="/asm2/changepassword" method="post">
							<div class="form-group">
								<input name="passwordOld" type="password" class="form-control"
									id="exampleInputEmail1" placeholder="Nhập Mật Khẩu Củ">
							</div>
							<div class="form-group">
								<input name="newPassword" type="password" class="form-control"
									id="exampleInputEmail1" placeholder="Nhập Mật Khẩu Mới">
							</div>
							<div class="form-group">
								<input name="returnPassword" type="password" class="form-control"
									id="exampleInputEmail1" placeholder="Nhập Lại Mật Khẩu Mới">
							</div>

							<button type="submit" class="btn vizew-btn w-100 mt-30">Đổi
								mật khẩu</button>
						</form>
						<a href="/asm2/home" class="btn vizew-btn w-100 mt-30">Quay
							Lại</a> <span style="color: red">${error}</span>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- ##### Login Area End ##### -->

	<!-- ##### Footer Area Start ##### -->
	<footer class="footer-area">
		<div class="container">
			<div class="row">
				<!-- Footer Widget Area -->
				<div class="col-12 col-sm-6 col-xl-3">
					<div class="footer-widget mb-70">
						<!-- Logo -->
						<a href="index.html" class="foo-logo d-block mb-4"><img
							src="img/core-img/logo2.png" alt=""></a>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna</p>
						<!-- Footer Newsletter Area -->
						<div class="footer-nl-area">
							<form action="#" method="post">
								<input type="email" name="nl-email" class="form-control"
									id="nlEmail" placeholder="Your email">
								<button type="submit">
									<i class="fa fa-paper-plane" aria-hidden="true"></i>
								</button>
							</form>
						</div>
					</div>
				</div>

				<!-- Footer Widget Area -->
				<div class="col-12 col-sm-6 col-xl-3">
					<div class="footer-widget mb-70">
						<h6 class="widget-title">Latest Twister</h6>
						<!-- Twitter Slides -->
						<div class="twitter-slides owl-carousel">

							<!-- Single Twitter Slide -->
							<div class="single--twitter-slide">
								<!-- Single Twit -->
								<div class="single-twit">
									<p>
										<i class="fa fa-twitter"></i> <span>@Leonard</span> I am so
										happy because I found this magazine, and it just made
										Vizeweasier. Thanks for sharing
									</p>
								</div>
								<!-- Single Twit -->
								<div class="single-twit">
									<p>
										<i class="fa fa-twitter"></i> <span>@Leonard</span> I am so
										happy because I found this magazine, and it just made
										Vizeweasier. Thanks for sharing
									</p>
								</div>
							</div>

							<!-- Single Twitter Slide -->
							<div class="single--twitter-slide">
								<!-- Single Twit -->
								<div class="single-twit">
									<p>
										<i class="fa fa-twitter"></i> <span>@Colorlib</span> I am so
										happy because I found this magazine, and it just made
										Vizeweasier. Thanks for sharing
									</p>
								</div>
								<!-- Single Twit -->
								<div class="single-twit">
									<p>
										<i class="fa fa-twitter"></i> <span>@Colorlib</span> I am so
										happy because I found this magazine, and it just made
										Vizeweasier. Thanks for sharing
									</p>
								</div>
							</div>

						</div>
					</div>
				</div>

				<!-- Footer Widget Area -->
				<div class="col-12 col-sm-6 col-xl-3">
					<div class="footer-widget mb-70">
						<h6 class="widget-title">Sport Videos</h6>

						<!-- Single Blog Post -->
						<div class="single-blog-post d-flex">
							<div class="post-thumbnail">
								<img src="img/bg-img/1.jpg" alt="">
							</div>
							<div class="post-content">
								<a href="single-post.html" class="post-title">DC Shoes:
									gymkhana the</a>
								<div class="post-meta d-flex justify-content-between">
									<a href="#"><i class="fa fa-comments-o" aria-hidden="true"></i>
										14</a> <a href="#"><i class="fa fa-eye" aria-hidden="true"></i>
										34</a> <a href="#"><i class="fa fa-thumbs-o-up"
										aria-hidden="true"></i> 84</a>
								</div>
							</div>
						</div>

						<!-- Single Blog Post -->
						<div class="single-blog-post d-flex">
							<div class="post-thumbnail">
								<img src="img/bg-img/2.jpg" alt="">
							</div>
							<div class="post-content">
								<a href="single-post.html" class="post-title">Sweet Yummy
									Chocolatea Tea</a>
								<div class="post-meta d-flex justify-content-between">
									<a href="#"><i class="fa fa-comments-o" aria-hidden="true"></i>
										14</a> <a href="#"><i class="fa fa-eye" aria-hidden="true"></i>
										34</a> <a href="#"><i class="fa fa-thumbs-o-up"
										aria-hidden="true"></i> 84</a>
								</div>
							</div>
						</div>

					</div>
				</div>

				<!-- Footer Widget Area -->
				<div class="col-12 col-sm-6 col-xl-3">
					<div class="footer-widget mb-70">
						<h6 class="widget-title">Our Address</h6>
						<!-- Contact Address -->
						<div class="contact-address">
							<p>
								101 E 129th St, East Chicago, <br>IN 46312, US
							</p>
							<p>Phone: 001-1234-88888</p>
							<p>Email: info.colorlib@gmail.com</p>
						</div>
						<!-- Footer Social Area -->
						<div class="footer-social-area">
							<a href="#" class="facebook"><i class="fa fa-facebook"></i></a> <a
								href="#" class="google-plus"><i class="fa fa-google-plus"></i></a>
							<a href="#" class="instagram"><i class="fa fa-instagram"></i></a>
							<a href="#" class="twitter"><i class="fa fa-twitter"></i></a> <a
								href="#" class="linkedin"><i class="fa fa-linkedin"></i></a>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- Copywrite Area -->
		<div class="copywrite-area">
			<div class="container">
				<div class="row align-items-center">
					<!-- Copywrite Text -->
					<div class="col-12 col-sm-6">
						<p class="copywrite-text">
							<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
							Copyright &copy;
							<script>document.write(new Date().getFullYear());</script>
							All rights reserved | This template is made with <i
								class="fa fa-heart-o" aria-hidden="true"></i> by <a
								href="https://colorlib.com" target="_blank">Colorlib</a>
							<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
						</p>
					</div>
					<div class="col-12 col-sm-6">
						<nav class="footer-nav">
							<ul>
								<li><a href="#">Advertise</a></li>
								<li><a href="#">About</a></li>
								<li><a href="#">Contact</a></li>
								<li><a href="#">Disclaimer</a></li>
								<li><a href="#">Privacy</a></li>
							</ul>
						</nav>
					</div>
				</div>
			</div>
		</div>
	</footer>
	<!-- ##### Footer Area End ##### -->

	<!-- ##### All Javascript Script ##### -->
	<!-- jQuery-2.2.4 js -->
	<script src="<c:url value="/view/js/jquery/jquery-2.2.4.min.js" />"></script>
	<!-- Popper js -->
	<script src="<c:url value="/view/js/bootstrap/popper.min.js" />"></script>
	<!-- Bootstrap js -->
	<script src="<c:url value="/view/js/bootstrap/bootstrap.min.js" />"></script>
	<!-- All Plugins js -->
	<script src="<c:url value="/viewjs/plugins/plugins.js"/>"></script>
	<!-- Active js -->
	<script src="<c:url value="/view/js/active.js" />"></script>
</body>

</html>