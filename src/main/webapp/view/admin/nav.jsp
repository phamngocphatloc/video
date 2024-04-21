<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<nav class="sidebar sidebar-offcanvas" id="sidebar">
        <div class="text-center sidebar-brand-wrapper d-flex align-items-center">
          <a class="sidebar-brand brand-logo" href="/asm2/home"><img src="<c:url value="/view/img/PL.png" />" alt="logo" /></a>
          <a class="sidebar-brand brand-logo-mini pl-4 pt-3" href="/asm2/admin/home">PL TUBE</a>
        </div>
        <ul class="nav">
          <li class="nav-item nav-profile">
            <a href="#" class="nav-link">
              <div class="nav-profile-image">
                <img src="<c:url value="/view/admin/assets/images/faces/face1.jpg" />" alt="profile" />
                <span class="login-status online"></span>
                <!--change to offline or busy as needed-->
              </div>
              <div class="nav-profile-text d-flex flex-column pr-3">
                <span class="font-weight-medium mb-2">${auth}</span>
              </div>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/asm2/admin/home">
              <i class="mdi mdi-home menu-icon"></i>
              <span class="menu-title">Trang Chủ</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/asm2/admin/video">
              <i class="mdi mdi-contacts menu-icon"></i>
              <span class="menu-title">Video</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/asm2/admin/user">
              <i class="mdi mdi-format-list-bulleted menu-icon"></i>
              <span class="menu-title">Users</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/asm2/admin/statistics">
              <i class="mdi mdi-chart-bar menu-icon"></i>
              <span class="menu-title">Report</span>
            </a>
          </li>
          <li class="nav-item sidebar-actions">
            <div class="nav-link">
              <div class="mt-4">
                <ul class="mt-4 pl-0">
                  <li>Sign Out</li>
                </ul>
              </div>
            </div>
          </li>
        </ul>
      </nav>