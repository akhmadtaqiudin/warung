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
		<a href="${pageContext.request.contextPath}/barang/searchAllBarang.action"><strong><span class="fa fa-th-list"></span> Data Barang</strong></a> / Tambah Data Barang
      	<hr>
      	<div class="errors">
		   <s:fielderror name="invalidBarang"/>
		</div>
		<s:form namespace="/barang" method="POST" theme="bootstrap" cssClass="form-horizontal">
		  	<s:textfield name="barang.namaBarang" label="Nama Karyawan " labelSeparator=":" />
		  	<s:textfield name="barang.satuan" label="Satuan " labelSeparator=":"/>
		  	<s:textarea name="barang.harga" label="Harga " labelSeparator=":" />
			<hr>
		  	<div class="footer">
				<s:submit action="searchAllBarang" value="Cansel" cssClass="btn btn-default"/>
				<s:submit action="SaveBarang" value="Save" cssClass="btn btn-primary"/>
			</div>
		</s:form>
    </div>
</body>
</html>