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
						<h4 class="card-title">Thống Kê Video</h4>
						</p>
						<div class="table-responsive">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>Id</th>
										<th>Poster</th>
										<th>Tên Video</th>
										<th>Tổng Views</th>
										<th>Tổng Lượt Like</th>
										<th>Tổng Lượt Share</th>
									</tr>
								</thead>
									<c:forEach items="${listvideo}" var="v">
										<tr onclick="openModal(${v.videoId})">
											<td>${v.videoId}</td>
											<td><img src="${v.poster}" alt="Poster Image"
												style="width: 100px;"></td>
											<td style="width: 120px">${v.title}</td>
											<td>${v.views}</td>
											<td>${v.totalLike}</td>
											<td>${v.totalShare}</td>
										</tr>
									</c:forEach>
									<!-- Các hàng khác -->
								</tbody>
							</table>

							<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
    aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="videoModalLabel">Danh Sách Người Like</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <table class="table table-hover">
								<thead>
									<tr>
										<th>Fullname</th>
										<th>Email</th>
									</tr>
								</thead>
								<tbody>
										<tr>
				
										</tr>

									<!-- Các hàng khác -->
								</tbody>
							</table>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng</button>
                <button type="button" class="btn btn-primary" id="addUserButton"  onclick="OpenShare()">Hiện Danh Sách Share</button>
            </div>
        </div>
    </div>
</div>
							<!-- End Modal -->
							
							<div class="modal fade" id="myModalShare" tabindex="-1" role="dialog"
    aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="videoModalLabel">Danh Sách Người Share</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <table class="table table-hover">
								<thead>
									<tr>
										<th>Fullname</th>
										<th>Email</th>
									</tr>
								</thead>
								<tbody>
										<tr>
				
										</tr>

									<!-- Các hàng khác -->
								</tbody>
							</table>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng</button>
                <button type="button" class="btn btn-primary" id="addUserButton" data-dismiss="modal" onclick="OpenShare()">Hiện Danh Sách Share</button>
            </div>
        </div>
    </div>
</div>
							<!-- Pagination -->
							<nav aria-label="Page navigation example">
								<ul class="pagination">
									<c:forEach begin="1" end="${totalPage}" var="i">
										<li class="page-item"><a class="page-link"
											href="/asm2/admin/statistics/${i}">${i}</a></li>
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
function addRowsToTable(data) {
    var tbody = document.querySelector("#myModal .modal-body table tbody");
    
    data.forEach(function(item) {
        var row = document.createElement("tr");
        var fullnameCell = document.createElement("td");
        var emailCell = document.createElement("td");
        
        fullnameCell.textContent = item.fullName;
        emailCell.textContent = item.email;

        row.appendChild(fullnameCell);
        row.appendChild(emailCell);
        
        tbody.appendChild(row);
    });
}

function addRowsToTableItem(data) {
    var tbody = document.querySelector("#myModalShare .modal-body table tbody");
    
    data.forEach(function(item) {
        var row = document.createElement("tr");
        var fullnameCell = document.createElement("td");
        var emailCell = document.createElement("td");
        
        fullnameCell.textContent = item.fullName;
        emailCell.textContent = item.email;

        row.appendChild(fullnameCell);
        row.appendChild(emailCell);
        
        tbody.appendChild(row);
    });
}
function openModal(id) {
	var tbody = document.querySelector("#myModal .modal-body table tbody");

    // Xóa hết các hàng trong tbody
    tbody.innerHTML = '';
    
    var tbodyShare = document.querySelector("#myModal .modal-body table tbody");

    // Xóa hết các hàng trong tbody
    tbodyShare.innerHTML = '';
	
	// Tạo URL dựa trên videoId và action
    var url = 'http://localhost:8080/asm2/admin/statistics';

    // Gửi yêu cầu AJAX
    $.ajax({
        url: url,
        type: 'Post',
        data: {
            videoId: id,
            action: "getStatistics"
        },
        success: function(data) {
            // Xử lý dữ liệu trả về nếu cần
            console.log(data); // In dữ liệu ra console để kiểm tra
            // Thêm mã để xử lý dữ liệu và thêm vào bảng ở đây
            addRowsToTable(data.listUserFavorite);
        },
        error: function(xhr, status, error) {
            console.error('Error:', error);
        }
    });
    var modal = document.getElementById('myModal');
    var modalInstance = new bootstrap.Modal(modal);
    modalInstance.show();
}

function OpenShare() {
	var modalold = document.getElementById('myModal');
    var modalInstanceold = new bootstrap.Modal(modal);
    modalInstance.show();
    var modal = document.getElementById('myModalShare');
    var modalInstance = new bootstrap.Modal(modal);
    modalInstanceold.hide();
    modalInstance.show();
}
</script>



</html>