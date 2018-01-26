<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@page import="com.tyan.mangkubumi.modul.crew.model.Crew"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<jsp:include page="/pages/template/include.jsp"></jsp:include>
	<title>Warung</title>
	<script type="text/javascript">
		$(window).ready(function(){
			$(".del").click(function(){
			    if (!confirm("Apakah anda yakin ingin hapus file tersebut")){
			      return false;
			    }
			});
			$("#btnReset").on("click",function(){
				$("#nama").val("");			
			});
			$("#TablelistCrew  > thead tr th").css({"text-align": "center", "vertical-align": "middle"});
			$("#TablelistCrew  > tbody tr td").css({"text-align": "center", "vertical-align": "middle"});
		});
	</script>
</head>
<body>
	<div class="col-lg-10 col-md-10 col-sm-9 col-xs-12 main">
		<p><strong><span class="fa fa-users"></span>&nbsp;&nbsp; Data Karyawan</strong></p>
      	<hr>
      	<s:form namespace="/crew" id="form" method="pos">
			<s:textfield name="crew.namaCrew" placeholder="Nama Karyawan" id="nama"/>
			<s:submit value="Search" action="search" cssClass="btn btn-default btn-xs" id="src" /> 
			<a href="${pageContext.request.contextPath}/crew/AddCrew.action" class="btn btn-success btn-sm btn-add"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>&nbsp;Tambah</a>
			<input type="button" value="Reset" class="btn btn-default btn-sm" id="btnReset" />
		</s:form>
		<s:if test="%{listCrew.isEmpty()}">
			<table class="table table-bordered" style="text-align: center; vertical-align: middle; margin-top: 68px;">
	  			<thead>
	  				<tr>
	  					<td><b>ID Karyawan</b></td>
	  					<td><b>Nama Karyawan</b></td>
	  					<td><b>Tempat Lahir</b></td>
	  					<td><b>Tanggal Lahir</b></td>
	  					<td><b>Kontak</b></td>
	  					<td><b>Alamat</b></td>
	  					<td><b>Action</b></td>
	  				</tr>
	  			</thead>
	  		</table>
		</s:if>
		<s:else>
			<display:table id="TablelistCrew" name="listCrew" pagesize="10"
			 requestURI="/crew/search.action" class="table table-hover table-striped table-bordered" >
				<display:column title="ID Karyawan " property="idCrew" />
				<display:column title="Nama Karyawan " property="namaCrew" />
				<display:column title="Tempat Lahir" property="tempatLahir" />
				<display:column title="Tanggal Lahir" property="tanggalLahir" format="{0,date,dd/MM/yyyy}" />
				<display:column title="Kontak" property="kontak" />
				<display:column title="Alamat " property="alamat" />
				<display:column title="Action">
					<a class="btn btn-warning btn-xs" href="${pageContext.request.contextPath}/crew/EditCrew.action?crew.idCrew=<%=((Crew) pageContext.getAttribute("TablelistCrew")).getIdCrew()%>"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;Edit&nbsp;&nbsp;</a>
					<a class="btn btn-danger btn-xs del" href="${pageContext.request.contextPath}/crew/DeletCrew.action?crew.idCrew=<%=((Crew) pageContext.getAttribute("TablelistCrew")).getIdCrew()%>"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span>&nbsp;Delete</a>
				</display:column>
			</display:table>
		</s:else>
    </div>
</body>
</html>