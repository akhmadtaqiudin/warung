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
			$("#t1").datepicker({
				dateFormat : 'yy-mm-dd',
				maxDate : new Date(),
				beforeShow : function(textbox,instance) {
						var txtBoxOffset = $(this).offset();
						var top = txtBoxOffset.top;
						var left = txtBoxOffset.left;
						var textBoxWidth = $(this).outerWidth();
						//alert(textbox.offsetHeight);
						console.log('top: ' + top + 'left: ' + left);
						setTimeout(function() {
								instance.dpDiv.css({
								top : top + 20, //you can adjust this value accordingly
								left : left
								// + textBoxWidth//show at the end of textBox
								});
						}, 0);
				},
				onSelect: function(date) {
				    $("#t2").datepicker('option', 'minDate', date);
				  }

			});
			
			$("#t2").datepicker({
				dateFormat : 'yy-mm-dd',
				maxDate : new Date(),
				beforeShow : function(textbox,instance) {
						var txtBoxOffset = $(this).offset();
						var top = txtBoxOffset.top;
						var left = txtBoxOffset.left;
						var textBoxWidth = $(this).outerWidth();
						//alert(textbox.offsetHeight);
						console.log('top: ' + top + 'left: ' + left);
						setTimeout(function() {
								instance.dpDiv.css({
								top : top + 20, //you can adjust this value accordingly
								left : left
								// + textBoxWidth//show at the end of textBox
								});
						}, 0);
				}

			});
			/*  $("#t1" ).datepicker({
				dateFormat : 'yy-mm-dd'
			});
			$("#t2" ).datepicker({
				dateFormat : 'yy-mm-dd'
			}); */
			$("#btnReset").on("click",function(){
				$("#nama").val("");
				$("#t1").val("");
				$("#t2").val("");
			});
			$("#TableListReport  > thead tr").remove();
			$('#TableListReport > thead')
			.prepend(
					'<tr>'
					+ '<th rowspan="2" style="text-align: center; vertical-align: middle;">Tanggal Transaksi</th>'
					+ '<th rowspan="2" style="text-align: center; vertical-align: middle;">Nama Karyawan</th>'
					+ '<th rowspan="2" style="text-align: center; vertical-align: middle;">Setoran</th>'
					+ '<th colspan="3" style="text-align: center; vertical-align: middle;">Belanjaan</th>'
					+ '<th rowspan="2" style="text-align: center; vertical-align: middle;">Total Belanja</th>  '
					+ '<th rowspan="2" style="text-align: center; vertical-align: middle;">Uang Makan</th>  '
					+ '<th rowspan="2" style="text-align: center; vertical-align: middle;">Jumlah Terima</th>  '
					+ '</tr>'
					+ '<tr>'
					+ '<th style="text-align: center; vertical-align: middle;">Nama Barang</th>'
					+ '<th style="text-align: center; vertical-align: middle;">Harga</th>'
					+ '<th style="text-align: center; vertical-align: middle;">Jumlah Barang</th>'
					+ '</tr>'
			);
			$("#TableListReport  > thead tr th").css({"text-align": "center", "vertical-align": "middle"});
			$("#TableListReport  > tbody tr td").css({"text-align": "center", "vertical-align": "middle"});
		});
	</script>
	<style type="text/css">
		#t1{
			float: left;
			margin-right: 10px;
		}
	</style>
</head>
<body>
	<div class="col-lg-10 col-md-10 col-sm-9 col-xs-12 main">
		<p><strong><span class="fa fa-files-o"></span>&nbsp;&nbsp; Laporan Keseluruhan</strong></p>
      	<hr>
      	<s:form namespace="/belanja" id="form" method="pos">
			<s:textfield name="belanja.namaCrew" placeholder="Nama Karyawan" id="nama"/>
			<div class="control-group "><!-- 
				<label class="control-label tgl">Tanggal Transaksi :</label> -->
				<div class="controls">
					<s:textfield name="tglAwal" id="t1" cssClass="fieldShort" theme="simple" placeholder="Awal Tanggal Transaksi"></s:textfield>
					&nbsp;&nbsp; s/d
					<s:textfield name="tglAkhir" id="t2"
						cssClass="fieldShort" theme="simple" cssStyle="margin-left:20px;" placeholder="Akhir Tanggal Transaksi"></s:textfield>
				</div>
			</div>
			<s:submit value="Search" action="ReportBelanja" cssClass="btn btn-default btn-sm btn-r1" /> 
			<input type="button" value="Reset" class="btn btn-default btn-sm btn-r2" />
			<s:submit value="Export Excel" action="ExportReportBelanja" cssClass="btn btn-primary btn-sm btn-r3" /> 
		</s:form>
		<s:if test="%{listReport.isEmpty()}">
			<table class="table table-bordered" style="text-align: center; vertical-align: middle; margin-top: 68px;">
	  			<thead>
	  				<tr>
	  					<td><b>Tanggal Transaksi</b></td>
	  					<td><b>Nama Karyawan</b></td>
	  					<td><b>Setoran</b></td>
	  					<td><b>Nama Barang</b></td>
	  					<td><b>Harga</b></td>
	  					<td><b>Jumlah Barang</b></td>
	  					<td><b>Total Belanja</b></td>
	  					<td><b>Uang Makan</b></td>
	  					<td><b>Jumlah Terima</b></td>
	  				</tr>
	  			</thead>
	  		</table>
		</s:if>
		<s:else>
			<display:table id="TableListReport" name="listReport" pagesize="10"
				 requestURI="/belanja/ReportBelanja.action" class="table table-hover table-striped table-bordered" >
				<display:column title="Tanggal Transaksi " property="tanggalTransaksi" format="{0,date,dd/MM/yyyy}" />
				<display:column title="Nama Karyawan " property="namaCrew" />
				<display:column title="Setoran " property="setoran" format="{0,number,#,##0.0}" />
				<display:column title="Nama Barang " property="nb" />
				<display:column title="Harga " property="hrg" />
				<display:column title="Jumlah Barang " property="byk" />
				<display:column title="Total Belanja " property="totalBelanja" format="{0,number,#,##0.0}" />
				<display:column title="Uang Makan " property="uangMakan" format="{0,number,#,##0.0}" />
				<display:column title="Jumlah Terima " property="jumlahTerima" format="{0,number,#,##0.0}" />
			</display:table>
		</s:else>
    </div>
</body>
</html>