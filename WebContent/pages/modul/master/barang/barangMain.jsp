<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%><%-- 
<%@page import="com.tyan.mangkubumi.modul.barang.model.Barang"%> --%>
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
			$("#TableListBarang  > thead tr th").css({"text-align": "center", "vertical-align": "middle"});
			$("#TableListBarang  > tbody tr td").css({"text-align": "center", "vertical-align": "middle"});
		});
	</script>
</head>
<body>
	<div class="col-lg-10 col-md-10 col-sm-9 col-xs-12 main">
		<p><strong><span class="fa fa-th-list"></span> Data Barang</strong></p>
      	<hr>
      	<s:form namespace="/barang" id="form" method="pos">
			<s:textfield name="barang.namaBarang" placeholder="Nama Barang" id="nama"/>
			<s:submit value="Search" action="searchAllBarang" cssClass="btn btn-default btn-xs" id="src" /> 
			<a href="${pageContext.request.contextPath}/barang/AddBarang.action" class="btn btn-success btn-sm btn-add"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>&nbsp;Tambah</a>
			<input type="button" value="Reset" class="btn btn-default btn-sm" id="btnReset" />
		</s:form>
		<display:table id="TableListBarang" name="listBarang" pagesize="10"
			 requestURI="/barang/searchAllBarang.action" class="table table-hover table-striped table-bordered" >
			<display:column title="Nama Barang " property="namaBarang" />
			<display:column title="Satuan " property="satuan" />
			<display:column title="Harga " property="harga" />
			<%-- <display:column title="Action">
				<a class="btn btn-warning btn-xs" href="${pageContext.request.contextPath}/barang/EditBarang.action?barang.idBarang=<%=((Barang) pageContext.getAttribute("TableListBarang")).getIdBarang()%>"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;Edit&nbsp;&nbsp;</a>
				<a class="btn btn-danger btn-xs del" href="${pageContext.request.contextPath}/barang/DeletBarang.action?barang.idBarang=<%=((Barang) pageContext.getAttribute("TableListBarang")).getIdBarang()%>"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span>&nbsp;Delete</a>
			</display:column> --%>
		</display:table>
    </div>
</body>
</html>