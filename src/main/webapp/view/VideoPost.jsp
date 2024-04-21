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
	<div class="modal fade" id="shareModal" role="dialog">
		<div class="modal-dialog">

			<!-- Modal nội dung -->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Chia Sẻ Video</h4>
				</div>
				<div class="modal-body">
					<!-- Form nhập liệu -->
					<form id="shareForm">
						<div class="form-group">
							<label for="email">Email:</label> <input type="email"
								class="form-control" id="email"
								placeholder="Nhập địa chỉ email của bạn">
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Hủy</button>
					<button type="button" class="btn btn-primary" id="shareButton">Chia
						Sẻ</button>
				</div>
			</div>

		</div>
	</div>
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
							<li class="breadcrumb-item"><a href="#">Archives</a></li>
							<li class="breadcrumb-item active" aria-current="page">${video.title}</li>
						</ol>
					</nav>
				</div>
			</div>
		</div>
	</div>
	<!-- ##### Breadcrumb Area End ##### -->

	<!-- ##### Pager Area Start ##### -->

	<!-- ##### Pager Area End ##### -->

	<!-- ##### Post Details Area Start ##### -->
	<section class="post-details-area mb-80">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<div class="single-video-area">
						<iframe src="${video.url}"
							allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
							allowfullscreen></iframe>
					</div>
				</div>
			</div>

			<div class="row justify-content-center">
				<!-- Post Details Content Area -->
				<div class="col-12 col-lg-8">
					<div class="post-details-content d-flex">
						<!-- Post Share Info -->


						<!-- Blog Content -->
						<div class="blog-content">

							<!-- Post Content -->
							<div class="post-content mt-0">
								<a href="#" class="post-cata cata-sm cata-danger">Mới</a> <a
									href="/asm2/watch/${video.videoid}" class="post-title mb-2">${video.title}</a>

								<div class="d-flex justify-content-between mb-30">
									<div class="post-meta d-flex align-items-center">
										<a href="#" class="post-author">By Admin</a> <i
											class="fa fa-circle" aria-hidden="true"></i>
									</div>
									<div class="post-meta d-flex">
										<!-- Model -->
										<a href="#"><i class="fa fa-eye" aria-hidden="true"></i> <span
											class="view">${video.views}</span></a> <a onclick="LikeVideo()"><i
											class="fa fa-thumbs-o-up" aria-hidden="true"></i> <span
											class="like">${video.favorites.size()}</span></a> <a
											href="#shareModal" data-toggle="modal"><i
											class="fa fa-share-square" aria-hidden="true"></i>
											${video.shares.size()}</a>


									</div>
								</div>
							</div>

							<p>${video.description}</p>

							<!-- Post Tags -->
							<div class="post-tags mt-30">
								<ul>
									<li><a href="#">Mới</a></li>
								</ul>
							</div>


							<!-- Related Post Area -->
							<div class="related-post-area mt-5">
								<!-- Section Title -->
								<div class="section-heading style-2">
									<h4>Video Mới</h4>
									<div class="line"></div>
								</div>

								<div class="row">

									<!-- Single Blog Post -->
									<c:forEach items="${ListVideo}" var="v">
										<div class="col-12 col-md-6">
											<div class="single-post-area mb-50">
												<!-- Post Thumbnail -->
												<div class="post-thumbnail">
													<img src="${v.poster}" alt="">
												</div>

												<!-- Post Content -->
												<div class="post-content">
													<a href="#" class="post-cata cata-sm cata-success">Mới</a>
													<a href="/asm2/watch/${v.videoid}" class="post-title">${video.title}</a>
													<div class="post-meta d-flex">
														<a href="#"><i class="fa fa-eye" aria-hidden="true"></i>
															${v.views}</a> <a href="#"><i class="fa fa-thumbs-o-up"
															aria-hidden="true">${v.favorites.size()}</i></a> <a href="#"><i
															class="fa fa-share-square" aria-hidden="true"></i>
															${v.shares.size()}</a>
													</div>
												</div>
											</div>
										</div>
									</c:forEach>
								</div>
							</div>

							<!-- Comment Area Start -->
							<div class="comment_area clearfix mb-50">

								<!-- Section Title -->


							</div>



						</div>
					</div>
				</div>

				<!-- Sidebar Widget -->
				<div class="col-12 col-md-6 col-lg-4">
					<div class="sidebar-area">

						<!-- ***** Single Widget ***** -->
						<div class="single-widget followers-widget mb-50">
							<a href="#" class="facebook"><i class="fa fa-facebook"
								aria-hidden="true"></i><span class="counter">198</span><span>Fan</span></a>
							<a href="#" class="twitter"><i class="fa fa-twitter"
								aria-hidden="true"></i><span class="counter">220</span><span>Followers</span></a>
							<a href="#" class="google"><i class="fa fa-google"
								aria-hidden="true"></i><span class="counter">140</span><span>Subscribe</span></a>
						</div>

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
												${v.views}</a> <a href="#"><i class="fa fa-share-square"
												aria-hidden="true"></i> ${v.shares.size()}</a>
										</div>
									</div>
								</div>
							</c:forEach>


						</div>






					</div>
				</div>
			</div>
	</section>
	<!-- ##### Post Details Area End ##### -->

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
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"
		integrity="sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g=="
		crossorigin="anonymous" referrerpolicy="no-referrer"></script>
</body>

<script>
		
	</script>

<script>
		
        // Hàm sử dụng Ajax để gửi yêu cầu cập nhật số lượng lượt xem
        function updatePageViews() {
        	id = ${video.videoid};
            $.ajax({
                url: 'http://localhost:8080/asm2/watch/'+id, // Đường dẫn đến trang JSP xử lý cập nhật lượt xem
                type: 'POST',
                success: function(data) {
                    // Cập nhật số lượng lượt xem trên trang
                	document.querySelector(".view").textContent = data; // Match the first div

                }
            });
        }
        
        setTimeout(() => {
        	updatePageViews()
		}, 30000);
        
        
        
        function LikeVideo() {
        	id = ${video.videoid};
            $.ajax({
                url: 'http://localhost:8080/asm2/favorite', // Đường dẫn đến trang JSP xử lý cập nhật lượt xem
                type: 'POST',
                data: {
                    id: id
                },
                success: function(data) {
                    // Cập nhật số lượng lượt like trên trang
                    console.log(data);
                	document.querySelector(".like").textContent = data; // Match the first div

                }
            });
        }
        
        
        
    </script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/sweetalert2@10/dist/sweetalert2.min.css">
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@10"></script>

<!-- JavaScript -->
<script>
  // Xử lý sự kiện khi nút Chia Sẻ được nhấp
   // Select the button and attach a click event handler
document.querySelector('#shareButton').addEventListener('click', function() {
    // Lấy giá trị email từ ô nhập liệu
    var email = document.querySelector('#email').value;
    var id = ${video.videoid};
    // Kiểm tra nếu email không trống
    if (email.trim() !== "") {
        // Gửi yêu cầu AJAX POST đến URL "/sharevideo"
    	$.ajax({
    	    url: 'http://localhost:8080/asm2/sharevideo',
    	    type: 'POST',
    
    	    data: {
    	        id: id,
    	        email: email
    	    },
    	    success: function(data) {
    	    	console.log(data)
    	        // Hiển thị dữ liệu trả về trong cửa sổ cảnh báo của SweetAlert2
    	        Swal.fire({
    	            icon: 'success',
    	            title: 'thông báo!',
    	            text: data
    	        }).then((result) => {
    	            // Nếu người dùng nhấn vào nút "Đóng", đóng modal và reload trang
    	            if (result.isConfirmed) {
    	                $('#shareModal').modal('hide');
    	                location.reload();
    	            }
    	        });
    	    },
    	    error: function(xhr, status, error) {
    	        // Hiển thị cửa sổ cảnh báo lỗi nếu yêu cầu gặp vấn đề
    	        Swal.fire({
    	            icon: 'error',
    	            title: 'Lỗi!',
    	            text: 'Đã xảy ra lỗi khi chia sẻ video.'
    	        });
    	    }
    	});
    } else {
        // Nếu ô nhập liệu email trống, hiển thị cửa sổ cảnh báo thông báo lỗi
        Swal.fire({
            icon: 'error',
            title: 'Lỗi!',
            text: 'Vui lòng nhập địa chỉ email của bạn.'
        });
    }
});
</script>

</html>