<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <title>PL TUBE</title>
    <link rel="stylesheet" href='<c:url value="/view/admin/assets/vendors/mdi/css/materialdesignicons.min.css" />' />
    <link rel="stylesheet" href='<c:url value="/view/admin/assets/vendors/flag-icon-css/css/flag-icon.min.css" />' />
    <link rel="stylesheet" href="<c:url value="/view/admin/assets/vendors/css/vendor.bundle.base.css" />" />
    <link rel="stylesheet" href="<c:url value="/view/admin/assets/vendors/font-awesome/css/font-awesome.min.css"/>" />
    <link rel="stylesheet" href="<c:url value="/view/admin/assets/vendors/bootstrap-datepicker/bootstrap-datepicker.min.css"/>" />
    <link rel="stylesheet" href="<c:url value="/view/admin/assets/css/style.css"/>" />
    <link rel="shortcut icon" href="<c:url value="/view/admin/assets/images/favicon.png" />" />
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  </head>
  <body>
    <div class="container-scroller">
      <c:import url="/admin/nav"></c:import>
      <div class="container-fluid page-body-wrapper">
        <div id="theme-settings" class="settings-panel">
          <i class="settings-close mdi mdi-close"></i>
          <p class="settings-heading">SIDEBAR SKINS</p>
          <div class="sidebar-bg-options selected" id="sidebar-default-theme">
            <div class="img-ss rounded-circle bg-light border mr-3"></div> Default
          </div>
          <div class="sidebar-bg-options" id="sidebar-dark-theme">
            <div class="img-ss rounded-circle bg-dark border mr-3"></div> Dark
          </div>
          <p class="settings-heading mt-2">HEADER SKINS</p>
          <div class="color-tiles mx-0 px-4">
            <div class="tiles light"></div>
            <div class="tiles dark"></div>
          </div>
        </div>
        <nav class="navbar col-lg-12 col-12 p-lg-0 fixed-top d-flex flex-row">
          <div class="navbar-menu-wrapper d-flex align-items-stretch justify-content-between">
            <a class="navbar-brand brand-logo-mini align-self-center d-lg-none" href="index.html"><img src="assets/images/logo-mini.svg" alt="logo" /></a>
            <button class="navbar-toggler navbar-toggler align-self-center mr-2" type="button" data-toggle="minimize">
              <i class="mdi mdi-menu"></i>
            </button>
            <ul class="navbar-nav">
              <li class="nav-item dropdown">
                <a class="nav-link count-indicator dropdown-toggle" id="notificationDropdown" href="#" data-toggle="dropdown">
                  <i class="mdi mdi-bell-outline"></i>
                  <span class="count count-varient1">7</span>
                </a>
                <div class="dropdown-menu navbar-dropdown navbar-dropdown-large preview-list" aria-labelledby="notificationDropdown">
                  <h6 class="p-3 mb-0">Notifications</h6>
                  <a class="dropdown-item preview-item">
                    <div class="preview-thumbnail">
                      <img src="assets/images/faces/face4.jpg" alt="" class="profile-pic" />
                    </div>
                    <div class="preview-item-content">
                      <p class="mb-0"> Dany Miles <span class="text-small text-muted">commented on your photo</span>
                      </p>
                    </div>
                  </a>
                  <a class="dropdown-item preview-item">
                    <div class="preview-thumbnail">
                      <img src="assets/images/faces/face3.jpg" alt="" class="profile-pic" />
                    </div>
                    <div class="preview-item-content">
                      <p class="mb-0"> James <span class="text-small text-muted">posted a photo on your wall</span>
                      </p>
                    </div>
                  </a>
                  <a class="dropdown-item preview-item">
                    <div class="preview-thumbnail">
                      <img src="assets/images/faces/face2.jpg" alt="" class="profile-pic" />
                    </div>
                    <div class="preview-item-content">
                      <p class="mb-0"> Alex <span class="text-small text-muted">just mentioned you in his post</span>
                      </p>
                    </div>
                  </a>
                  <div class="dropdown-divider"></div>
                  <p class="p-3 mb-0">View all activities</p>
                </div>
              </li>
              <li class="nav-item dropdown d-none d-sm-flex">
                <a class="nav-link count-indicator dropdown-toggle" id="messageDropdown" href="#" data-toggle="dropdown">
                  <i class="mdi mdi-email-outline"></i>
                  <span class="count count-varient2">5</span>
                </a>
                <div class="dropdown-menu navbar-dropdown navbar-dropdown-large preview-list" aria-labelledby="messageDropdown">
                  <h6 class="p-3 mb-0">Messages</h6>
                  <a class="dropdown-item preview-item">
                    <div class="preview-item-content flex-grow">
                      <span class="badge badge-pill badge-success">Request</span>
                      <p class="text-small text-muted ellipsis mb-0"> Suport needed for user123 </p>
                    </div>
                    <p class="text-small text-muted align-self-start"> 4:10 PM </p>
                  </a>
                  <a class="dropdown-item preview-item">
                    <div class="preview-item-content flex-grow">
                      <span class="badge badge-pill badge-warning">Invoices</span>
                      <p class="text-small text-muted ellipsis mb-0"> Invoice for order is mailed </p>
                    </div>
                    <p class="text-small text-muted align-self-start"> 4:10 PM </p>
                  </a>
                  <a class="dropdown-item preview-item">
                    <div class="preview-item-content flex-grow">
                      <span class="badge badge-pill badge-danger">Projects</span>
                      <p class="text-small text-muted ellipsis mb-0"> New project will start tomorrow </p>
                    </div>
                    <p class="text-small text-muted align-self-start"> 4:10 PM </p>
                  </a>
                  <h6 class="p-3 mb-0">See all activity</h6>
                </div>
              </li>
              <li class="nav-item nav-search border-0 ml-1 ml-md-3 ml-lg-5 d-none d-md-flex">
                <form class="nav-link form-inline mt-2 mt-md-0">
                  <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search" />
                    <div class="input-group-append">
                      <span class="input-group-text">
                        <i class="mdi mdi-magnify"></i>
                      </span>
                    </div>
                  </div>
                </form>
              </li>
            </ul>
            <ul class="navbar-nav navbar-nav-right ml-lg-auto">
  
            </ul>
            <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="offcanvas">
              <span class="mdi mdi-menu"></span>
            </button>
          </div>
        </nav>
        <div class="main-panel">
          <div class="content-wrapper pb-0">
            <div class="page-header flex-wrap">
              <h3 class="mb-0"> Hi, welcome back! <span class="pl-0 h6 pl-sm-2 text-muted d-inline-block">Your web analytics dashboard template.</span>
              </h3>
     
            </div>

            <div class="row">
              <div class="col-xl-8 grid-margin stretch-card">
                <div class="card card-calender">
                  <div class="card-body">
                    <div class="row pt-4">
                      <div class="col-sm-6">
                        <h1 class="text-white">10:16PM</h1>
                        <h5 class="text-white">Monday 25 October, 2016</h5>
                        <h5 class="text-white pt-2 m-0">Precipitation:50%</h5>
                        <h5 class="text-white m-0">Humidity:23%</h5>
                        <h5 class="text-white m-0">Wind:13 km/h</h5>
                      </div>
                      <div class="col-sm-6 text-sm-right pt-3 pt-sm-0">
                        <h3 class="text-white">Clear Sky</h3>
                        <p class="text-white m-0">London, UK</p>
                        <h3 class="text-white m-0">21°C</h3>
                      </div>
                    </div>
                    <div class="row mt-5">
                      <div class="col-sm-12">
                        <ul class="d-flex pl-0 overflow-auto">
                          <li class="weakly-weather-item text-white font-weight-medium text-center active">
                            <p class="mb-0">TODAY</p>
                            <i class="mdi mdi-weather-cloudy"></i>
                            <p class="mb-0">21<span class="symbol">°c</span></p>
                          </li>
                          <li class="weakly-weather-item text-white font-weight-medium text-center">
                            <p class="mb-0">MON</p>
                            <i class="mdi mdi-weather-hail"></i>
                            <p class="mb-0">21<span class="symbol">°c</span></p>
                          </li>
                          <li class="weakly-weather-item text-white font-weight-medium text-center">
                            <p class="mb-0">TUE</p>
                            <i class="mdi mdi-weather-cloudy"></i>
                            <p class="mb-0">21<span class="symbol">°c</span></p>
                          </li>
                          <li class="weakly-weather-item text-white font-weight-medium text-center">
                            <p class="mb-0">WED</p>
                            <i class="mdi mdi-weather-fog"></i>
                            <p class="mb-0">21<span class="symbol">°c</span></p>
                          </li>
                          <li class="weakly-weather-item text-white font-weight-medium text-center">
                            <p class="mb-0">THU</p>
                            <i class="mdi mdi-weather-hail"></i>
                            <p class="mb-0">21<span class="symbol">°c</span></p>
                          </li>
                          <li class="weakly-weather-item text-white font-weight-medium text-center">
                            <p class="mb-0">FRI</p>
                            <i class="mdi mdi-weather-cloudy"></i>
                            <p class="mb-0">21<span class="symbol">°c</span></p>
                          </li>
                          <li class="weakly-weather-item text-white font-weight-medium text-center">
                            <p class="mb-0">SAT</p>
                            <i class="mdi mdi-weather-hail"></i>
                            <p class="mb-0">21<span class="symbol">°c</span></p>
                          </li>
                          <li class="weakly-weather-item text-white font-weight-medium text-center">
                            <p class="mb-0">SUN</p>
                            <i class="mdi mdi-weather-cloudy"></i>
                            <p class="mb-0">21<span class="symbol">°c</span></p>
                          </li>
                        </ul>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
 
            </div>
          
          </div>
          <footer class="footer">
            <div class="d-sm-flex justify-content-center justify-content-sm-between">
              <span class="text-muted d-block text-center text-sm-left d-sm-inline-block">Copyright © PL TUBE 2024</span>
              <span class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center"> Free <a href="https://www.bootstrapdash.com/" target="_blank">Bootstrap dashboard template</a> from Bootstrapdash.com</span>
            </div>
          </footer>
        </div>
        <!-- main-panel ends -->
      </div>
      <!-- page-body-wrapper ends -->
    </div>
    <!-- container-scroller -->
    <!-- plugins:js -->
    <script src="<c:url value='/view/admin/assets/vendors/js/vendor.bundle.base.js' />"></script>
    <!-- endinject -->
    <!-- Plugin js for this page -->
    <script src="<c:url value='/view/admin/assets/vendors/chart.js/Chart.min.js' />"></script>
    <script src="<c:url value='/view/admin/assets/vendors/bootstrap-datepicker/bootstrap-datepicker.min.js' />"></script>
    <script src="<c:url value='/view/admin/assets/vendors/flot/jquery.flot.js' />"></script>
    <script src="<c:url value='/view/admin/assets/vendors/flot/jquery.flot.resize.js' />"></script>
    <script src="<c:url value='/view/admin/assets/vendors/flot/jquery.flot.categories.js' />"></script>
    <script src="<c:url value='/view/admin/assets/vendors/flot/jquery.flot.fillbetween.js' />"></script>
    <script src="<c:url value='/view/admin/assets/vendors/flot/jquery.flot.stack.js' />"></script>
    <script src="<c:url value='/view/admin/assets/vendors/flot/jquery.flot.pie.js' />"></script>
    <!-- End plugin js for this page -->
    <!-- inject:js -->
    <script src="<c:url value='/view/admin/assets/js/off-canvas.js' />"></script>
    <script src="<c:url value='/view/admin/assets/js/hoverable-collapse.js' />"></script>
    <script src="<c:url value='/view/admin/assets/js/misc.js' />"></script>
    <!-- endinject -->
    <!-- Custom js for this page -->
    <script src="<c:url value='/view/admin/assets/js/dashboard.js' />"></script>
    <!-- End custom js for this page -->
  </body>
</html>