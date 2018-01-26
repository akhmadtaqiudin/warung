<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/pages/template/include.jsp"></jsp:include>
<title>Warung</title>
</head>
<body>
	<div class="col-lg-10 col-md-10 col-sm-9 col-xs-12 main">
		<p><strong><span class="fa fa-dashboard"></span> My Dashboard</strong></p>
      	<hr>
      	<div class="jumbotron">
		  <h2>Hello, <s:property value="#session['userName'].userName" />!</h2>
		</div>
    </div>
</body>
</html>