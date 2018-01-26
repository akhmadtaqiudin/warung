<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<jsp:include page="/pages/template/include.jsp"></jsp:include>
	<title>Warung</title>
	<script>
		$(window).ready(function(){
			/*start dynamic field By Muhammad Huzaifah 14 Oktober 2016*/
			var max_fields      = 20; //maximum input boxes allowed
		    var wrapper         = $("#input_fields_wrap"); //Fields wrapper
		    var add_button      = $("#add_field_button"); //Add button ID
		    
		    var x = $(".counter").length; //initlal text box count
		    $(add_button).on("click",function(){ //on add input button click
		        if(x < max_fields){ //max input box allowed
		            x++; //text box increment

		            $(wrapper).append('<div class="counter">'
		            		+'<div class="control-group">'
		            		+'<div class="controls">'
		            		+'<s:textfield name="namaBarang" theme="simple" placeholder="Nama Barang" />'
		            		+'<s:textfield name="harga" theme="simple" placeholder="Harga" />'
		            		+'<s:textfield name="banyaknya" theme="simple" placeholder="Banyaknya" />'
		            		+'&nbsp;<input type="button" value="&nbsp;Hapus&nbsp;" class="remove_field btn btn-danger btn-sm">'
		            		+'</div>'
		            		+'</div>'
		            		+'</div>'); //add input box
		        }

		    });
		    
		    $(wrapper).on("click",".remove_field", function(e){ //user click on remove text
		        e.preventDefault(); $(this).parent('div').parent('div').parent('div').remove(); x--;
		    });
		});
	</script>
</head>
<body>
	<div class="col-lg-10 col-md-10 col-sm-9 col-xs-12 main">
		<a href="${pageContext.request.contextPath}/belanja/search.action"><strong><span class="fa fa-shopping-cart"></span> Data Belanja</strong></a> / Tambah Data Belanjaan
      	<hr>
      	<div class="errors">
		   <s:fielderror name="invalidbelanja"/>
		</div>
		<s:action namespace="/crew" name="SelectAll" id="nk"/>
		<s:form namespace="/belanja" method="POST" theme="bootstrap" cssClass="form-horizontal">
			<s:select id="nc" list="#nk.listCrew" listKey="namaCrew" listValue="namaCrew" headerKey="0" 
				headerValue="==Pilih==" name="belanja.namaCrew" label="Nama Karyawan " labelSeparator=":" />
		  	<s:textfield name="belanja.setoran" label="Setoran " labelSeparator=":"/>
			<s:textfield name="belanja.uangMakan" label="Uang Makan " labelSeparator=":"/>
			<div id="input_fields_wrap">	
				<div class="counter">
					<div class="control-group">
						<div class="controls">
							<s:textfield name="namaBarang" theme="simple" placeholder="Nama Barang"/>
							<s:textfield name="harga" theme="simple" placeholder="Harga"/>
							<s:textfield name="banyaknya" theme="simple" placeholder="Jumlah Barang"/>
							<input type="button" value="Tambah " id="add_field_button" class="btn btn-success btn-sm form-control" />
						</div>
					</div>
				</div>
			</div>
			<hr>
		  	<div class="footer">
				<s:submit action="searchAllBelanja" value="Cansel" cssClass="btn btn-default"/>
				<s:submit action="SaveBelanja" value="Save" cssClass="btn btn-primary"/>
			</div>
		</s:form>
    </div>
</body>
</html>