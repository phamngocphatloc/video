<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<!-- ##### Header Area Start ##### -->
    <header class="header-area">
        <!-- Top Header Area -->
        <div class="top-header-area">
            <div class="container">
                <div class="row align-items-center">
                    <div class="col-12 col-md-6">
                        <!-- Breaking News Widget -->
                        <div class="breaking-news-area d-flex align-items-center">
                            <div class="news-title">
                                <p>PL TUBE </p>
                            </div>
                            <div id="breakingNewsTicker" class="ticker">
                                <ul>
                                    <li><a href="single-post.html">10 Things Amazon Echo Can Do</a></li>
                                    <li><a href="single-post.html">Welcome to Colorlib Family.</a></li>
                                    <li><a href="single-post.html">Boys 'doing well' after Thai</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-md-6">
                        <div class="top-meta-data d-flex align-items-center justify-content-end">
                            <!-- Top Social Info -->
                            <div class="top-social-info">
                                <a href="https://www.facebook.com/Phamngocphatloc.info/"><i class="fa fa-facebook"></i></a>
                                <a href="https://www.facebook.com/Phamngocphatloc.info/"><i class="fa fa-twitter"></i></a>
                                <a href="https://www.facebook.com/Phamngocphatloc.info/"><i class="fa fa-pinterest"></i></a>
                                <a href="https://www.facebook.com/Phamngocphatloc.info/"><i class="fa fa-linkedin"></i></a>
                                <a href="https://www.facebook.com/Phamngocphatloc.info/"><i class="fa fa-youtube-play"></i></a>
                            </div>
                            <!-- Top Search Area -->
                            <div class="top-search-area">
                                <form action='<c:url value="/search" />' method="get">
                                    <input type="search" name="search" id="topSearch" placeholder="Search...">
                                    <button type="submit" class="btn"><i class="fa fa-search" aria-hidden="true"></i></button>
                                </form>
                            </div>
                            <!-- Login -->
                            <c:if test="${auth == null}">
                            <a href='<c:url value='/signin' />' class="login-btn"><i class="fa fa-user" aria-hidden="true"></i></a>
                            </c:if>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Navbar Area -->
        <div class="vizew-main-menu" id="sticker">
            <div class="classy-nav-container breakpoint-off">
                <div class="container">

                    <!-- Menu -->
                    <nav class="classy-navbar justify-content-between" id="vizewNav">

                        <!-- Nav brand -->
                        <a href="<c:url value='/home' />" class="nav-brand"><img style="height: 85px; width: 300px" src='<c:url value='/view/img/PL.png' />' alt=""></a>

                        <!-- Navbar Toggler -->
                        <div class="classy-navbar-toggler">
                            <span class="navbarToggler"><span></span><span></span><span></span></span>
                        </div>

                        <div class="classy-menu">

                            <!-- Close Button -->
                            <div class="classycloseIcon">
                                <div class="cross-wrap"><span class="top"></span><span class="bottom"></span></div>
                            </div>

                            <!-- Nav Start -->
                            <div class="classynav">
                                <ul>
                                    <li class="active"><a href="/asm2/home">Home</a></li>
                                    
                                    <c:if test="${auth != null}">
                                    <li><a href="#">Xin Chào: ${auth}</a></li>
                                    <li><a href='<c:url value='/changepassword' />'>Đổi Mật Khẩu</a></li>
                                    <li><a href='<c:url value='/logout' />'>Logout</a></li>
                                    </c:if>
                                    <c:if test="${admin != null}">
                                    
                                    </c:if>
                                </ul>
                            </div>
                            <!-- Nav End -->
                        </div>
                    </nav>
                </div>
            </div>
        </div>
    </header>