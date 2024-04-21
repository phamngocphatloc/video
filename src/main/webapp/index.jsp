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
						</ol>
					</nav>
				</div>
			</div>
		</div>
	</div>
	<!-- ##### Breadcrumb Area End ##### -->

	<!-- ##### Archive Grid Posts Area Start ##### -->
	<div class="vizew-grid-posts-area mb-80">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-12 col-lg-8">
					<!-- Archive Catagory & View Options -->
					<div
						class="archive-catagory-view mb-50 d-flex align-items-center justify-content-between">
						<!-- Catagory -->
						<div class="archive-catagory">
							<h4>
								<i class="fa fa-trophy" aria-hidden="true"></i>
								<c:choose>
									<c:when test="${title == 'new'}">
            							Video Mới
         							</c:when>

									<c:when test="${title == 'like'}">
            							Video Bạn Thích
         							</c:when>
									<c:when test="${title == 'search'}">
         								Video Liên Quan ${search}
         							</c:when>
								</c:choose>
							</h4>
						</div>
						<!-- View Options -->
						<div class="view-options">
							<a href="/asm2/home" class="${title=='new'?'active':''}"><i
								class="fa fa-th-large" aria-hidden="true"></i></a> <a
								class="${title=='like'?'active':''}"
								href="/asm2/favorite?page=1"><i class="fa fa-list-ul"
								aria-hidden="true"></i></a>
						</div>
					</div>

					<div class="row">
						<!-- Single Blog Post -->
						<c:forEach items="${listvideo}" var="o">
							<div class="col-12 col-md-6">
								<div class="single-post-area mb-50">
									<!-- Post Thumbnail -->
									<div class="post-thumbnail">
										<img src="${o.poster}" alt="">

										<!-- Video Duration -->

									</div>

									<!-- Post Content -->
									<div class="post-content">
										<a href="/asm2/watch/${o.videoid}" class="post-title">${o.title}</a>
										<div class="post-meta d-flex">
											</a> <a href="#"><i class="fa fa-eye" aria-hidden="true"></i>
												${o.views}</a> <a href="#"><i class="fa fa-thumbs-o-up"
												aria-hidden="true"></i> ${o.favorites.size()}</a> <a href="#"><i
												class="fa fa-eye" aria-hidden="true"></i> ${v.views}</a> <a
												href="#"><i class="fa fa-share-square"
												aria-hidden="true"></i> ${o.shares.size()}</a>
										</div>
									</div>
								</div>
							</div>
						</c:forEach>








					</div>

					<!-- Pagination -->
					<nav class="mt-50">
						<ul class="pagination justify-content-center">
							<c:if test="${title == 'new'}">
								<c:forEach begin="1" end="${totalPage}" var="i">
									<li class="page-item"><a class="page-link"
										href="/asm2/home/${i}">${i}</a></li>
								</c:forEach>
							</c:if>
							<c:if test="${title == 'like'}">
								<c:forEach begin="1" end="${totalPage}" var="i">
									<li class="page-item"><a class="page-link"
										href="/asm2/favorite?page=${i}">${i}</a></li>
								</c:forEach>
							</c:if>
							<c:if test="${title == 'search'}">
								<c:forEach begin="1" end="${totalPage}" var="i">
									<li class="page-item"><a class="page-link"
										href="/asm2/search?search=${search}&&page=${i}">${i}</a></li>
								</c:forEach>
							</c:if>
						</ul>
					</nav>
				</div>

				<div class="col-12 col-md-6 col-lg-4">
					<div class="sidebar-area">

						<!-- ***** Single Widget ***** -->
						<div class="single-widget latest-video-widget mb-50">
							<!-- Section Heading -->
							<div class="section-heading style-2 mb-30">
								<h4>Trending</h4>
								<div class="line"></div>
							</div>


							<c:forEach items="${trending}" var="v">
								<!-- Single Blog Post -->
								<div class="single-blog-post d-flex">
									<div class="post-thumbnail">
										<img src="${v.poster}" alt="">
									</div>
									<div class="post-content">
										<a href="/asm2/watch/${v.videoid}" class="post-title">${v.title}</a>
										<div class="post-meta d-flex justify-content-between">
											<a href="#"><i class="fa fa-eye" aria-hidden="true"></i>
												${v.views}</a> <a href="#"><i class="fa fa-thumbs-o-up"
												aria-hidden="true"></i> ${v.favorites.size()}</a> <a href="#"><i
												class="fa fa-share-square" aria-hidden="true"></i>
												${v.shares.size()}</a>
										</div>
									</div>
								</div>
							</c:forEach>


						</div>

						<!-- ***** Single Widget ***** -->
						<div class="single-widget add-widget mb-50">
							<a href="#"><img src="img/bg-img/add.png" alt=""></a>
						</div>

						<!-- ***** Sidebar Widget ***** -->
						<div class="single-widget youtube-channel-widget mb-50">
							<!-- Section Heading -->




							<!-- ***** Single Widget ***** -->
							<div class="single-widget newsletter-widget mb-50">
								<!-- Section Heading -->
								<div class="section-heading style-2 mb-30">
									<h4>Newsletter</h4>
									<div class="line"></div>
								</div>
								<p>Subscribe our newsletter gor get notification about new
									updates, information discount, etc.</p>
								<!-- Newsletter Form -->
								<div class="newsletter-form">
									<form action="#" method="post">
										<input type="email" name="nl-email" class="form-control mb-15"
											id="emailnl" placeholder="Enter your email">
										<button type="submit" class="btn vizew-btn w-100">Subscribe</button>
									</form>
								</div>
							</div>

							<!-- ***** Single Widget ***** -->
							<div class="single-widget"></div>

						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
	<!-- ##### Footer Area Start ##### -->
	<jsp:include page="Footer.jsp"></jsp:include>

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