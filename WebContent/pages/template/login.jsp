<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/makeover/bootstrap/css/bootstrap.min.css"/>
	<script type="text/javascript" src="${pageContext.request.contextPath}/makeover/jquery/js/jquery-3.1.0.min.js"></script> 
    <script type="text/javascript" src="${pageContext.request.contextPath}/makeover/bootstrap/js/bootstrap.min.js" ></script>
<title>Warung</title>
<style type="text/css">	
	body, html {
		height: 100%;
		position: relative;
		background-color: #5b5a5e;
       background-image: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='40' height='40' viewBox='0 0 40 40'%3E%3Cg fill-rule='evenodd'%3E%3Cg fill='%239C92AC' fill-opacity='0.4'%3E%3Cpath d='M0 38.59l2.83-2.83 1.41 1.41L1.41 40H0v-1.41zM0 1.4l2.83 2.83 1.41-1.41L1.41 0H0v1.41zM38.59 40l-2.83-2.83 1.41-1.41L40 38.59V40h-1.41zM40 1.41l-2.83 2.83-1.41-1.41L38.59 0H40v1.41zM20 18.6l2.83-2.83 1.41 1.41L21.41 20l2.83 2.83-1.41 1.41L20 21.41l-2.83 2.83-1.41-1.41L18.59 20l-2.83-2.83 1.41-1.41L20 18.59z'/%3E%3C/g%3E%3C/g%3E%3C/svg%3E");
	}
	.login{
		margin-left: 11%;
	}
	.logo img{
	    width: 32%;
	}
	#login-box {
		position: absolute;
		top: 90px;
		left: 50%;
		transform: translateX(-50%);
		border-radius: 10px;
		width: 350px;
		margin: 0 auto;
		border: 1px solid black;
		background: rgba(48, 46, 45, 1);
		min-height: 250px;
		padding: 20px;
		z-index: 9999;
	}
	#login-box .logo .logo-caption {
		font-family: 'Poiret One', cursive;
		color: white;
		text-align: center;
		margin-bottom: 0px;
	}
	#login-box .logo .tweak {
		color: #ff5252;
	}
	#login-box .controls {
		padding-top: 30px;
	}
	#login-box .controls input {
		border-radius: 0px;
		background: rgb(98, 96, 96);
		border: 0px;
		color: white;
		font-family: 'Nunito', sans-serif;
	}
	#login-box .controls input:focus {
		box-shadow: none;
	}
	#login-box .controls input:first-child {
		border-top-left-radius: 2px;
		border-top-right-radius: 2px;
	}
	#login-box .controls input:last-child {
		border-bottom-left-radius: 2px;
		border-bottom-right-radius: 2px;
	}
	#login-box .btn-custom {
		border-radius: 2px;
		margin-top: 8px;
		background: #ff5252;
		border-color: rgba(48, 46, 45, 1);
		color: white;
		font-family: 'Nunito', sans-serif;
	}
	#login-box .btn-custom:hover{
		-webkit-transition: all 500ms ease;
		-moz-transition: all 500ms ease;
		-ms-transition: all 500ms ease;
		-o-transition: all 500ms ease;
		transition: all 500ms ease;
		background: #ff5252;
		border-color: #ff5252;
	}
	/* #fl{
		margin-left: 7%;
	} */
</style>
</head>
<body>
	<div class="container">
	<div id="login-box">
		<div class="logo">
			<img src="${pageContext.request.contextPath}/makeover/img/avatar5.png" class="img img-responsive img-circle center-block"/>
			<h1 class="logo-caption"><span class="tweak">L</span>ogin</h1>
		</div><!-- /.logo -->
		<div class="controls">
			<div class="errors">
	           	<s:fielderror name="invalid"/>
	        </div>
	        <s:form namespace="/authentication" action="auth" validate="true" method="post" id="fl">
                <s:textfield name="user.userName" required="true" placeholder="Username" cssClass="form-control login" />
				<s:password name="user.password" required="true" placeholder="Password" cssClass="form-control login" />
				<s:submit cssClass="btn btn-default btn-block btn-custom login" value="Login"/>
            </s:form><!-- 
			<input type="text" name="username" placeholder="Username" class="form-control" />
			<input type="text" name="username" placeholder="Password" class="form-control" />
			<button type="button" class="btn btn-default btn-block btn-custom">Login</button> -->
		</div><!-- /.controls -->
	</div><!-- /#login-box -->
</div><!-- /.container -->
</body>
</html>