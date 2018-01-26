<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/makeover/jquery/css/jquery-ui.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/makeover/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/makeover/font-awesome/css/font-awesome.min.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/makeover/bootstrap/css/style.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/makeover/jquery/js/jquery-3.1.0.min.js"></script>    
    <script src="${pageContext.request.contextPath}/makeover/jquery/js/jquery-ui.min.js"></script> 
    <script type="text/javascript" src="${pageContext.request.contextPath}/makeover/bootstrap/js/bootstrap.min.js" ></script>
<title>Warung</title>
</head>
<body>
    <div id="top-nav" class="navbar navbar-inverse navbar-static-top">
      <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
              <a class="navbar-brand" href="#">Warung Mas Bro</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" role="button" data-toggle="dropdown" href="#"><i class="fa fa-user"></i>&nbsp;<s:property value="#session['userName'].userName" />&nbsp;<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><img src="${pageContext.request.contextPath}/makeover/img/avatar5.png" class="img-circle" alt="User Image" /></li>
                        <li><a href="${pageContext.request.contextPath}/authentication/logout.action"><i class="fa fa-sign-out"></i> Sign out</a></li>
                    </ul>
                </li>
            </ul>
        </div>
      </div>
    </div>
    <!-- menu -->
    <div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
      <ul class="nav nav-pills nav-stacked">
        <!--<li class="nav-header"></li>-->
        <li><a href="${pageContext.request.contextPath}/authentication/dashboard.action"><i class="fa fa-dashboard"></i> Dashboard</a></li>
        <li><a href="${pageContext.request.contextPath}/crew/search.action"><i class="fa fa-users"></i> Karyawan</a></li>
        <%-- <li><a href="${pageContext.request.contextPath}/barang/searchAllBarang.action"><i class="fa fa-th-list"></i> Master Barang</a></li>
         --%><li><a href="${pageContext.request.contextPath}/belanja/searchAllBelanja.action"><i class="fa fa-shopping-cart"></i> Belanja</a></li>
        <li><a href="${pageContext.request.contextPath}/belanja/Report.action"><i class="fa fa-files-o"></i> Laporan</a></li>
      </ul>
    </div>
    <!-- /menu -->
</body>
</html>