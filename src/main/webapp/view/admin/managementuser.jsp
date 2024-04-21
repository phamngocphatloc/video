
<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<title>PL TUBE</title>
<link rel="stylesheet"
	href='<c:url value="/view/admin/assets/vendors/mdi/css/materialdesignicons.min.css" />' />
<link rel="stylesheet"
	href='<c:url value="/view/admin/assets/vendors/flag-icon-css/css/flag-icon.min.css" />' />
<link rel="stylesheet"
	href="<c:url value="/view/admin/assets/vendors/css/vendor.bundle.base.css" />" />
<link rel="stylesheet"
	href="<c:url value="/view/admin/assets/vendors/font-awesome/css/font-awesome.min.css"/>" />
<link rel="stylesheet"
	href="<c:url value="/view/admin/assets/vendors/bootstrap-datepicker/bootstrap-datepicker.min.css"/>" />
<link rel="stylesheet"
	href="<c:url value="/view/admin/assets/css/style.css"/>" />
<link rel="shortcut icon"
	href="<c:url value="/view/admin/assets/images/favicon.png" />" />
</head>
<body>
	<div class="container-scroller">
		<c:import url="/admin/nav"></c:import>
		<div class="container-fluid page-body-wrapper">

			<nav class="navbar col-lg-12 col-12 p-lg-0 fixed-top d-flex flex-row">
				<div
					class="navbar-menu-wrapper d-flex align-items-stretch justify-content-between">
					<a class="navbar-brand brand-logo-mini align-self-center d-lg-none"
						href="index.html"><img src="assets/images/logo-mini.svg"
						alt="logo" /></a>
					<button
						class="navbar-toggler navbar-toggler align-self-center mr-2"
						type="button" data-toggle="minimize">
						<i class="mdi mdi-menu"></i>
					</button>
					<ul class="navbar-nav">
						<li class="nav-item dropdown"><a
							class="nav-link count-indicator dropdown-toggle"
							id="notificationDropdown" href="#" data-toggle="dropdown"> <i
								class="mdi mdi-bell-outline"></i> <span
								class="count count-varient1">7</span>
						</a>
							<div
								class="dropdown-menu navbar-dropdown navbar-dropdown-large preview-list"
								aria-labelledby="notificationDropdown">
								<h6 class="p-3 mb-0">Notifications</h6>
								<a class="dropdown-item preview-item">
									<div class="preview-thumbnail">
										<img src="assets/images/faces/face4.jpg" alt=""
											class="profile-pic" />
									</div>
									<div class="preview-item-content">
										<p class="mb-0">
											Dany Miles <span class="text-small text-muted">commented
												on your photo</span>
										</p>
									</div>
								</a> <a class="dropdown-item preview-item">
									<div class="preview-thumbnail">
										<img src="assets/images/faces/face3.jpg" alt=""
											class="profile-pic" />
									</div>
									<div class="preview-item-content">
										<p class="mb-0">
											James <span class="text-small text-muted">posted a
												photo on your wall</span>
										</p>
									</div>
								</a> <a class="dropdown-item preview-item">
									<div class="preview-thumbnail">
										<img src="assets/images/faces/face2.jpg" alt=""
											class="profile-pic" />
									</div>
									<div class="preview-item-content">
										<p class="mb-0">
											Alex <span class="text-small text-muted">just
												mentioned you in his post</span>
										</p>
									</div>
								</a>
								<div class="dropdown-divider"></div>
								<p class="p-3 mb-0">View all activities</p>
							</div></li>
						<li class="nav-item dropdown d-none d-sm-flex"><a
							class="nav-link count-indicator dropdown-toggle"
							id="messageDropdown" href="#" data-toggle="dropdown"> <i
								class="mdi mdi-email-outline"></i> <span
								class="count count-varient2">5</span>
						</a>
							<div
								class="dropdown-menu navbar-dropdown navbar-dropdown-large preview-list"
								aria-labelledby="messageDropdown">
								<h6 class="p-3 mb-0">Messages</h6>
								<a class="dropdown-item preview-item">
									<div class="preview-item-content flex-grow">
										<span class="badge badge-pill badge-success">Request</span>
										<p class="text-small text-muted ellipsis mb-0">Suport
											needed for user123</p>
									</div>
									<p class="text-small text-muted align-self-start">4:10 PM</p>
								</a> <a class="dropdown-item preview-item">
									<div class="preview-item-content flex-grow">
										<span class="badge badge-pill badge-warning">Invoices</span>
										<p class="text-small text-muted ellipsis mb-0">Invoice for
											order is mailed</p>
									</div>
									<p class="text-small text-muted align-self-start">4:10 PM</p>
								</a> <a class="dropdown-item preview-item">
									<div class="preview-item-content flex-grow">
										<span class="badge badge-pill badge-danger">Projects</span>
										<p class="text-small text-muted ellipsis mb-0">New project
											will start tomorrow</p>
									</div>
									<p class="text-small text-muted align-self-start">4:10 PM</p>
								</a>
								<h6 class="p-3 mb-0">See all activity</h6>
							</div></li>
						<li
							class="nav-item nav-search border-0 ml-1 ml-md-3 ml-lg-5 d-none d-md-flex">
							<form class="nav-link form-inline mt-2 mt-md-0">
								<div class="input-group">
									<input type="text" class="form-control" placeholder="Search" />
									<div class="input-group-append">
										<span class="input-group-text"> <i
											class="mdi mdi-magnify"></i>
										</span>
									</div>
								</div>
							</form>
						</li>
					</ul>
					<ul class="navbar-nav navbar-nav-right ml-lg-auto">

					</ul>
					<button
						class="navbar-toggler navbar-toggler-right d-lg-none align-self-center"
						type="button" data-toggle="offcanvas">
						<span class="mdi mdi-menu"></span>
					</button>
				</div>
			</nav>
			<div class="main-panel">
				<div class="card">
					<div class="card-body">
						<h4 class="card-title">Danh Sách User</h4>
						</p>
						<div class="table-responsive">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>Id</th>
										<th>FullName</th>
										<th>Email</th>
										<th>Role</th>
										<th>Active</th>
									</tr>
								</thead>
								<tbody style="height: 400px; overflow: scroll;">
									<c:forEach items="${listUser}" var="u">
										<tr onclick="openModal(${u.userid})">
											<td>${u.userid}</td>
											<td>${u.fullName}</td>
											<td>${u.email}</td>
											<td>${u.admin==true ? 'Admin' : 'User'}</td>
											<td>${u.isActive()==true ? 'Đang Hoạt Động' : 'Tắt Hoạt Động'}</td>
										</tr>
									</c:forEach>
									<!-- Các hàng khác -->
								</tbody>
							</table>
							<!-- Modal -->

							<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
								aria-labelledby="myModalLabel" aria-hidden="true">
								<div class="modal-dialog" role="document">
									<div class="modal-content">
										<div class="modal-header">
											<h5 class="modal-title" id="videoModalLabel">Thông Tin
												User</h5>
											<button type="button" class="close" data-dismiss="modal"
												aria-label="Close">
												<span aria-hidden="true">&times;</span>
											</button>
										</div>
										<div class="modal-body">
											<form id="videoForm">
												<div class="form-group">
													<label for="videoName">User Id</label> <input type="text"
														class="form-control" id="userId" placeholder="UserId"
														readonly="readonly">
												</div>
												<div class="form-group">
													<label for="videoName">Tên</label> <input type="text"
														class="form-control" id="fullName" placeholder="Nhập Tên">
												</div>
												<div class="form-group">
													<label for="youtubeLink">Email</label> <input type="email"
														class="form-control" id="email" placeholder="Nhập Email">
												</div>
												<div class="form-group" style="margin-left: 20px;">
													<div class="form-check">
														<input class="form-check-input" type="checkbox"
															value="active" id="isActive"> <label
															class="form-check-label" for="isActive"> Active </label>
													</div>
												</div>
												<div class="form-group" style="margin-left: 20px;">
													<div class="form-check">
														<input class="form-check-input" type="checkbox"
															value="active" id="isAdmin"> <label
															class="form-check-label" for="isAdmin"> Admin </label>
													</div>
												</div>
											</form>
										</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-secondary"
												data-dismiss="modal">Close</button>
											<button type="button" class="btn btn-primary"
												id="blockUserButton" onclick="blockUser()">Khóa Tài
												Khoản</button>
											<button type="button" class="btn btn-primary"
												id="updateAdminUserButton" onclick="updateAdmin()">Nâng
												Cấp Admin</button>
										</div>
									</div>
								</div>
							</div>
							<!-- End Modal -->
							<!-- Pagination -->
							<nav aria-label="Page navigation example">
								<ul class="pagination">
									<c:forEach begin="1" end="${totalPage}" var="i">
										<li class="page-item"><a class="page-link"
											href="/asm2/admin/user/${i}">${i}</a></li>
									</c:forEach>

								</ul>
							</nav>
						</div>
					</div>
				</div>
				<footer class="footer">
					<div
						class="d-sm-flex justify-content-center justify-content-sm-between">
						<span
							class="text-muted d-block text-center text-sm-left d-sm-inline-block">Copyright
							© bootstrapdash.com 2020</span> <span
							class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">
							Free <a href="https://www.bootstrapdash.com/" target="_blank">Bootstrap
								dashboard template</a> from Bootstrapdash.com
						</span>
					</div>
				</footer>
			</div>
		</div>
		<!-- main-panel ends -->
	</div>
	<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->
	<!-- plugins:js -->
	<script
		src="<c:url value='/view/admin/assets/vendors/js/vendor.bundle.base.js' />"></script>
	<!-- endinject -->
	<!-- Plugin js for this page -->
	<script
		src="<c:url value='/view/admin/assets/vendors/chart.js/Chart.min.js' />"></script>
	<script
		src="<c:url value='/view/admin/assets/vendors/bootstrap-datepicker/bootstrap-datepicker.min.js' />"></script>
	<script
		src="<c:url value='/view/admin/assets/vendors/flot/jquery.flot.js' />"></script>
	<script
		src="<c:url value='/view/admin/assets/vendors/flot/jquery.flot.resize.js' />"></script>
	<script
		src="<c:url value='/view/admin/assets/vendors/flot/jquery.flot.categories.js' />"></script>
	<script
		src="<c:url value='/view/admin/assets/vendors/flot/jquery.flot.fillbetween.js' />"></script>
	<script
		src="<c:url value='/view/admin/assets/vendors/flot/jquery.flot.stack.js' />"></script>
	<script
		src="<c:url value='/view/admin/assets/vendors/flot/jquery.flot.pie.js' />"></script>
	<!-- End plugin js for this page -->
	<!-- inject:js -->
	<script src="<c:url value='/view/admin/assets/js/off-canvas.js' />"></script>
	<script
		src="<c:url value='/view/admin/assets/js/hoverable-collapse.js' />"></script>
	<script src="<c:url value='/view/admin/assets/js/misc.js' />"></script>
	<!-- endinject -->
	<!-- Custom js for this page -->
	<script src="<c:url value='/view/admin/assets/js/dashboard.js' />"></script>
	<!-- End custom js for this page -->
</body>
<script src="path/to/gson.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<script>
	function openModal(id) {
		// Lấy ra các phần tử input trong form có id là "videoForm"
		var inputs = document.querySelectorAll('#videoForm input');

		// Lặp qua từng phần tử input và thiết lập thuộc tính readonly
		inputs.forEach(function(input) {
		    input.setAttribute('readonly', 'readonly');
		});
		$.ajax({
		    url: 'http://localhost:8080/asm2/admin/user',
		    type: 'POST',
		    data: {
		    	userid: id,
		        action: "getUser"
		    },
		    success: function(response) {
		        // Xử lý dữ liệu phản hồi ở đây
		        console.log(response);
		        document.getElementById('userId').value = response.id;
		        document.getElementById('fullName').value = response.fullName;
		        document.getElementById('email').value = response.email;
		        var isAdmin = document.getElementById('isAdmin').checked;
		     // Thay đổi nội dung của button có id là "updateAdmin"
		        if (response.isAdmin == true) {
		            document.getElementById('isAdmin').checked = true;
		            document.getElementById("updateAdminUserButton").textContent = 'Hạ Về Quyền User';
		        } else {
		            document.getElementById('isAdmin').checked = false;
		            document.getElementById("updateAdminUserButton").textContent = 'Nâng Quyền Admin';
		        }

		        // Thay đổi nội dung của button có id là "blockUser"
		        if (response.isActive == true) {
		            document.getElementById('isActive').checked = true;
		            document.getElementById("blockUserButton").textContent = 'Khóa Tài Khoản';
		        } else {
		            document.getElementById('isActive').checked = false;
		            document.getElementById("blockUserButton").textContent = 'Mở Khóa Tài Khoản';
		        }
		    },
		    error: function(xhr, status, error) {
		        // Xử lý lỗi ở đây
		        console.error("Request fa	iled with status: " + xhr.status);
		    }
		});
	    var modal = document.getElementById('myModal');
	    var modalInstance = new bootstrap.Modal(modal);
	    modalInstance.show();
	}
		  </script>

<script>
	function blockUser() {
	    var id = document.getElementById('userId').value;
	    // Gửi yêu cầu AJAX
	    $.ajax({
		    url: 'http://localhost:8080/asm2/admin/user',
		    type: 'POST',
		    data: {
		    	userid: id,
		        action: "block"
		    },
	        success: function(response) {
	            console.log(response);
	            Swal.fire({
	                title: 'Thông báo!',
	                text: response,
	                icon: 'success',
	                confirmButtonText: 'OK'
	            }).then((result) => {
	                // Sau khi người dùng nhấp vào nút OK, làm tải lại trang
	                if (result.isConfirmed) {
	                    location.reload(); // Tải lại trang
	                }
	            });
	        },
	        error: function(xhr, status, error) {
	            // Xử lý lỗi ở đây
	            console.error("Request failed with status: " + xhr.status);
	        }
	    });
	
	    // In ra các giá trị để kiểm tra
	    console.log("Video Name: " + videoName);
	    console.log("YouTube Link: " + youtubeLink);
	    console.log("Active: " + isActive);
	    console.log("Poster File: ", posterFile);
	    console.log("Description: ", description);
	}

	function updateAdmin() {
	    var id = document.getElementById('userId').value;
	    // Gửi yêu cầu AJAX
	    $.ajax({
		    url: 'http://localhost:8080/asm2/admin/user',
		    type: 'POST',
		    data: {
		    	userid: id,
		        action: "admin"
		    },
	        success: function(response) {
	            console.log(response);
	            Swal.fire({
	                title: 'Thông báo!',
	                text: response,
	                icon: 'success',
	                confirmButtonText: 'OK'
	            }).then((result) => {
	                // Sau khi người dùng nhấp vào nút OK, làm tải lại trang
	                if (result.isConfirmed) {
	                    location.reload(); // Tải lại trang
	                }
	            });
	        },
	        error: function(xhr, status, error) {
	            // Xử lý lỗi ở đây
	            console.error("Request failed with status: " + xhr.status);
	        }
	    });
	
	    // In ra các giá trị để kiểm tra
	    console.log("Video Name: " + videoName);
	    console.log("YouTube Link: " + youtubeLink);
	    console.log("Active: " + isActive);
	    console.log("Poster File: ", posterFile);
	    console.log("Description: ", description);
	}
	
	function removeVideo() {
	    var id = document.getElementById('userId').value;
	    var fullName = document.getElementById('fullName').value;
	    var email = document.getElementById('email').value;
	    var isActive = document.getElementById('isActive').checked;
	    var isAdmin = document.getElementById('isAdmin').checked;
	
	    // Tạo đối tượng FormData
	    var formData = new FormData();
	
	    // Thêm dữ liệu vào FormData
	    formData.append('videoid', id);
	    formData.append('action', 'delete');
	
	    // Gửi yêu cầu AJAX
	    $.ajax({
		    url: 'http://localhost:8080/asm2/admin/user',
		    type: 'POST',
		    data: {
		    	videoId: id,
		        action: "delete"
		    },
		    success: function(response) {
	            console.log(response);
	            Swal.fire({
	                title: 'Thông báo!',
	                text: response,
	                icon: 'success',
	                confirmButtonText: 'OK'
	            }).then((result) => {
	                // Sau khi người dùng nhấp vào nút OK, làm tải lại trang
	                if (result.isConfirmed) {
	                    location.reload(); // Tải lại trang
	                }
	            });
	        },
		    error: function(xhr, status, error) {
		        // Xử lý lỗi ở đây
		        console.error("Request failed with status: " + xhr.status);
		    }
		});
	
	    // In ra các giá trị để kiểm tra
	    console.log("Video Name: " + videoName);
	    console.log("YouTube Link: " + youtubeLink);
	    console.log("Active: " + isActive);
	    console.log("Poster File: ", posterFile);
	    console.log("Description: ", description);
	}
	</script>
</html>