<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/9/23
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
<link id="ie-style" href="css/ie.css" rel="stylesheet">
<![endif]-->

<!--[if IE 9]>
<link id="ie9style" href="css/ie9.css" rel="stylesheet">
<![endif]-->

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>

<body>
<!-- start: Header -->
<div class="navbar">
    <div class="navbar-inner">
        <div class="container-fluid">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <a id="main-menu-toggle" class="hidden-phone open"><i class="icon-reorder"></i></a>
            <div class="row-fluid">
                <a class="brand span2" href=""><span><i class="icon-tint"></i>&nbsp水质检测系统&nbsp&nbsp&nbsp</span></a>
            </div>
            <!-- start: Header Menu -->

            <div class="nav-no-collapse header-nav">
                <ul class="nav pull-right">
                    <li class="dropdown hidden-phone">
                        <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="icon-warning-sign"></i>
                        </a>
                        <ul class="dropdown-menu notifications">
                            <li>
                                <a href="#">
                                    <span class="icon green"><i class="icon-comment-alt"></i></span>
                                    <span class="message">新消息</span>
                                    <span class="time">7 min</span>
                                </a>
                            </li>
                        </ul>
                    </li>

                    <li>
                        <a class="btn" href="#">
                            <i class="icon-wrench"></i>
                        </a>
                    </li>
                    <!-- start: User Dropdown -->
                    <li class="dropdown">
                        <a class="btn account dropdown-toggle" data-toggle="dropdown" href="#">
                            <div class="avatar"><img src="${pageContext.request.contextPath }/detail/img/avater2.png" alt="Avatar" /></div>
                            <div class="user">
                                <span class="hello">欢迎</span>
                                <span class="name">${sessionScope.user.username }</span>
                            </div>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="dropdown-menu-title">
                            </li>
                            <li><a href="#"><i class="icon-user"></i>个人信息</a></li>
                            <li><a href="#"><i class="icon-envelope"></i>我的消息</a></li>
                            <li><a href="#"><i class="icon-off"></i>退出</a></li>
                        </ul>
                    </li>
                    <!-- end: User Dropdown -->
                </ul>
            </div>

            <!-- end: Header Menu -->
        </div>
    </div>
</div>