<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<jsp:include page="/pages/template/include.jsp"></jsp:include>
	<script type="text/javascript">
		$(window).ready(function(){
			$( "#tgl" ).datepicker({
			    yearRange: "1980:2000",
			    changeMonth: true,
			    changeYear: true
			});
		});
	</script>
<title>Warung</title>
</head>
<body>
	<div class="col-lg-10 col-md-10 col-sm-9 col-xs-12 main">
		<a href="${pageContext.request.contextPath}/crew/search.action"><strong><span class="fa fa-users"></span> Data Karyawan</strong></a> / Ubah Data Karyawan
      	<hr>
      	<div class="errors">
		   <s:fielderror name="invalidCrew"/>
		</div>
		<s:form namespace="/crew" method="POST" theme="bootstrap" cssClass="form-horizontal">
		  	<s:textfield name="crew.idCrew" label="ID Karyawan " labelSeparator=":" readonly="true" />
		  	<s:textfield name="crew.namaCrew" label="Nama Karyawan " labelSeparator=":" />
		  	<s:textfield name="crew.tempatLahir" label="Tempat Lahir " labelSeparator=":"/>
			<s:textfield name="crew.tanggalLahir" label="Tanggal Lahir " labelSeparator=":" id="tgl"/>
			<s:textfield name="crew.kontak" label="Kontak " labelSeparator=":" />
		  	<s:textarea name="crew.alamat" label="Alamat " labelSeparator=":" />
			<hr>
		  	<div class="footer">
				<s:submit action="search" value="Cansel" cssClass="btn btn-default"/>
				<s:submit action="SaveEditCrew" value="Update" cssClass="btn btn-primary"/>
			</div>
		</s:form>
    </div>
</body>
</html>