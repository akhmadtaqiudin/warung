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
		<a href="${pageContext.request.contextPath}/belanja/search.action"><strong><span class="fa fa-shopping-cart"></span> Data Belanja</strong></a> / Rincian Belanjaan
      	<hr>
		<s:form namespace="/belanja" method="POST" theme="bootstrap" cssClass="form-horizontal">
			<s:textfield name="belanja.namaCrew" label="Nama Karyawan " labelSeparator=":" readonly="true"/>
		  	<s:textfield name="belanja.setoran" label="Setoran " labelSeparator=":" readonly="true"/>
			<s:textfield name="belanja.uangMakan" label="Uang Makan " labelSeparator=":" readonly="true"/>
			<div id="input_fields_wrap">
				<s:iterator value="listBarangBelanja">
					<div class="counter">
						<div class="control-group">
							<div class="controls">
								<s:textfield name="namaBarang" theme="simple" placeholder="Nama Barang" readonly="true"/>
								<s:textfield name="harga" theme="simple" placeholder="Harga" readonly="true"/>
								<s:textfield name="banyaknya" theme="simple" placeholder="Banyaknya" readonly="true"/>
							</div>
						</div>
					</div>
				</s:iterator>	
			</div>
			<hr>
		  	<div class="footer">
				<s:submit action="searchAllBelanja" value="Close" cssClass="btn btn-default"/>
			</div>
		</s:form>
    </div>
</body>
</html>