<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%> 
<%@page import="com.tyan.mangkubumi.modul.belanja.model.Belanja"%>
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
			$("#TableListBelanja  > thead tr th").css({"text-align": "center", "vertical-align": "middle"});
			$("#TableListBelanja  > tbody tr td").css({"text-align": "center", "vertical-align": "middle"});
		});
	</script>
</head>
<body>
	<div class="col-lg-10 col-md-10 col-sm-9 col-xs-12 main">
		<p><strong><span class="fa fa-shopping-cart"></span>&nbsp;&nbsp; Data Belanjaan</strong></p>
      	<hr>
      	<s:form namespace="/belanja" id="form" method="pos">
			<s:textfield name="belanja.namaCrew" placeholder="Nama Karyawan" id="nama"/>
			<s:submit value="Search" action="searchAllBelanja" cssClass="btn btn-default btn-xs" id="src" /> 
			<a href="${pageContext.request.contextPath}/belanja/AddBelanja.action" class="btn btn-success btn-sm btn-add"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>&nbsp;Tambah</a>
			<input type="button" value="Reset" class="btn btn-default btn-sm" id="btnReset" />
		</s:form>
		<s:if test="%{listBelanja.isEmpty()}">
			<table class="table table-bordered" style="text-align: center; vertical-align: middle; margin-top: 68px;">
	  			<thead>
	  				<tr>
	  					<td><b>Tanggal Transaksi</b></td>
	  					<td><b>Nama Karyawan</b></td>
	  					<td><b>Setoran</b></td>
	  					<td><b>Total Belanja</b></td>
	  					<td><b>Uang Makan</b></td>
	  					<td><b>Jumlah Terima</b></td>
	  					<td><b>Action</b></td>
	  				</tr>
	  			</thead>
	  		</table>
		</s:if>
		<s:else>
			<display:table id="TableListBelanja" name="listBelanja" pagesize="10"
				 requestURI="/belanja/searchAllBelanja.action" class="table table-hover table-striped table-bordered" >
				<display:column title="Tanggal Transaksi " property="tanggalTransaksi" format="{0,date,dd/MM/yyyy}" />
				<display:column title="Nama Karyawan " property="namaCrew" />
				<display:column title="Setoran " property="setoran" format="{0,number,#,##0.0}" />
				<display:column title="Total Belanja " property="totalBelanja" format="{0,number,#,##0.0}" />
				<display:column title="Uang Makan " property="uangMakan" format="{0,number,#,##0.0}" />
				<display:column title="Jumlah Terima " property="jumlahTerima" format="{0,number,#,##0.0}" />
				<display:column title="Action">
					<a class="btn btn-default btn-xs" href="${pageContext.request.contextPath}/belanja/ViewBelanja.action?belanja.idTransaksi=<%=((Belanja) pageContext.getAttribute("TableListBelanja")).getIdTransaksi()%>"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>&nbsp;View</a>
				</display:column>
			</display:table>
		</s:else>
    </div>
</body>
</html>