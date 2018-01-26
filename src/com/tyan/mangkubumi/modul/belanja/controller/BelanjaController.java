package com.tyan.mangkubumi.modul.belanja.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;

import com.tyan.mangkubumi.core.ClassContext;
import com.tyan.mangkubumi.core.controller.CoreAction;
import com.tyan.mangkubumi.modul.belanja.dao.BarangBelanjaMapper;
import com.tyan.mangkubumi.modul.belanja.dao.BelanjaMapper;
import com.tyan.mangkubumi.modul.belanja.model.BarangBelanja;
import com.tyan.mangkubumi.modul.belanja.model.BarangBelanjaExample;
import com.tyan.mangkubumi.modul.belanja.model.Belanja;
import com.tyan.mangkubumi.modul.belanja.model.BelanjaExample;

public class BelanjaController extends CoreAction{

	private static final long serialVersionUID = 1L;
	private String[] namaBarang;
	private BigDecimal[] harga;
    private Integer[] banyaknya;
    private BigDecimal[] jumlah;
    private String tglAwal;
    private String tglAkhir;
	private Belanja belanja;
	
	private InputStream inputStreamFile;
	private String reportFile;
	private long contentLength;
	private String fileName;
	
	private List<Belanja> listBelanja = new ArrayList<>();
	private List<Belanja> listReport = new ArrayList<>();
	private List<BarangBelanja> listBarangBelanja = new ArrayList<>();
	private BelanjaMapper belanjaMapper = (BelanjaMapper) ClassContext.getContext().getBean("belanjaMapper");
	private BarangBelanjaMapper barangBelanjaMapper = (BarangBelanjaMapper) ClassContext.getContext().getBean("barangBelanjaMapper");
	
	public String serachAllBelanja(){
		System.out.println("Jalankan Method serachAllBelanja");

		if(belanja == null){
			belanja = new Belanja();
			belanja.setNamaCrew("");
		}
		
		BelanjaExample ex = new BelanjaExample();
		ex.createCriteria().andNamaCrewLike("%"+belanja.getNamaCrew()+"%");
				
		try {
			listBelanja = belanjaMapper.selectByExample(ex);
		} catch (Exception e) {
			return ERROR;
		}
		return SUCCESS;
	}
	public String serachBelanjaByKey(){
		System.out.println("Jalankan Method serachBelanjaByKey");
		
		try {
			belanja = belanjaMapper.selectByPrimaryKey(belanja.getIdTransaksi());
			

			BarangBelanjaExample bbEx = new BarangBelanjaExample();
			bbEx.createCriteria().andNamaCrewEqualTo(belanja.getNamaCrew()).andTanggalTransaksiEqualTo(belanja.getTanggalTransaksi());
			
			listBarangBelanja = barangBelanjaMapper.selectByExample(bbEx);
		} catch (Exception e) {
			return ERROR;
		}
		return SUCCESS;
	}
	public String addBelanja(){
		System.out.println("Jalankan Method addBelanja");
		BarangBelanja bb;
		belanja.setTanggalTransaksi(new Date());
		
		if(namaBarang.length > 0){
			for(int x = 0; namaBarang.length > x; x++){
				bb = new BarangBelanja();
				bb.setNamaCrew(belanja.getNamaCrew());
				bb.setNamaBarang(namaBarang[x]);
				bb.setHarga(harga[x]);
				bb.setBanyaknya(banyaknya[x]);
				bb.setJumlah(harga[x].multiply(new BigDecimal(banyaknya[x])));
				bb.setTanggalTransaksi(new Date());
				
				try {
					barangBelanjaMapper.insert(bb);
				} catch (Exception e) {
					addActionError("Gagal menambahkan data");
					return ERROR;
				}
			}
		}		
		
		BigDecimal bagiHasil = new BigDecimal(2);
		BarangBelanjaExample bbEx = new BarangBelanjaExample();
		bbEx.createCriteria().andNamaCrewEqualTo(belanja.getNamaCrew()).andTanggalTransaksiEqualTo(belanja.getTanggalTransaksi());
		bb = barangBelanjaMapper.sumBelanjaByExample(bbEx);
		System.out.println("nilai sum = "+bb);
		belanja.setTotalBelanja(bb.getJumlah());
		belanja.setJumlahTerima((belanja.getSetoran().subtract(belanja.getTotalBelanja())).divide(bagiHasil).add(belanja.getUangMakan()));
		try {
			belanjaMapper.insert(belanja);
		} catch (Exception e) {
			addActionError("Gagal menambahkan data");
			return ERROR;
		}
		addActionMessage("Data Berhasil ditambahkan");
		return SUCCESS;
	}
	public String report(){
		System.out.println("Jalankan Method report");
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			belanja.setTanggalAwal(sdf.parse(tglAwal));
			belanja.setTanggalAkhir(sdf.parse(tglAkhir));
			
			System.out.println("tgl 1 = "+belanja.getTanggalAwal());
			System.out.println("tgl 2 = "+belanja.getTanggalAkhir());
			
			listReport = belanjaMapper.selectReport(belanja);
		} catch (Exception e) {
			addActionError("Data tidak ditemukan");
			return ERROR;
		}
		return SUCCESS;
	}
	public String reportBelanja(){
		System.out.println("Jalankan Method ReportBelanja");
		
		report();
		File file=null;
        String filename="";        
        //get template
        InputStream inputStream=null;
        POIFSFileSystem fileSystem=null;
 	    reportFile = "pengadaan".concat(".xls");
 	    
 	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
 	    
		//file = new File("C:/tomcat-8/webapps"+"/"+"laporan_pengadaan_"+date+".xls");
 	    file = new File("/opt/apache-tomcat-8/webapps"+"/"+"laporan_pengadaan_"+date+".xls");
		System.out.println("file name"+file.getAbsolutePath());
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 	    
       //get Excel Template
		try {
			//inputStream = new FileInputStream ("C:/tomcat-8/webapps/"+reportFile);
			inputStream = new FileInputStream ("/opt/apache-tomcat-8/webapps/"+reportFile);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}		
       try {
			fileSystem = new POIFSFileSystem (inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
       
       filename = file.getAbsolutePath();
     	HSSFWorkbook workbook=null;
		try {
			workbook = new HSSFWorkbook(fileSystem);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String tgl1 = sdf.format(belanja.getTanggalAwal());
		String tgl2 = sdf.format(belanja.getTanggalAkhir());			
		int rowNum=15;
		int cellNum=0;
		HSSFRow myRow = null;
		HSSFSheet reportBelanjaan = workbook.getSheet("Sheet0");
		Row periode = reportBelanjaan.createRow(12);
		periode.createCell(0).setCellValue("Periode : "+tgl1+" -");
		periode.createCell(1).setCellValue(tgl2);
		Row header = reportBelanjaan.createRow(14);
		header.createCell(cellNum++).setCellValue("Tanggal Transaksi");
		header.createCell(cellNum++).setCellValue("Nama Karyawan");
		header.createCell(cellNum++).setCellValue("Merk");
		header.createCell(cellNum++).setCellValue("Satuan");
		header.createCell(cellNum++).setCellValue("Jumlah");
		header.createCell(cellNum++).setCellValue("Tanggal Pengajuan");
		header.createCell(cellNum++).setCellValue("Tanggal Persetujuan");
		header.createCell(cellNum++).setCellValue("Tanggal Pengadaan");
		header.createCell(cellNum++).setCellValue("Tanggal Penerimaan");
		
		for(Belanja b : listReport){
			int cell=0;
			String tp1 = sdf.format(b.getTanggalTransaksi());
			myRow = reportBelanjaan.createRow(rowNum++);
			myRow.createCell(cell++).setCellValue(tp1);
			myRow.createCell(cell++).setCellValue(b.getNamaCrew());
			myRow.createCell(cell++).setCellValue(b.getSetoran().doubleValue());
			myRow.createCell(cell++).setCellValue(b.getNb());
			myRow.createCell(cell++).setCellValue(b.getHrg());
			myRow.createCell(cell++).setCellValue(b.getByk());
			myRow.createCell(cell++).setCellValue(b.getTotalBelanja().doubleValue());
			myRow.createCell(cell++).setCellValue(b.getUangMakan().doubleValue());
			myRow.createCell(cell++).setCellValue(b.getJumlahTerima().doubleValue());
		}
		try{
	        FileOutputStream fileOut =  new FileOutputStream(filename);
	        workbook.write(fileOut);
	        fileOut.close();
	        workbook.close();

	        File file2 = new File(filename);
	        this.inputStreamFile = new FileInputStream(file2);
			contentLength = file2.length();
			fileName = file2.getName();
       } catch ( Exception ex ) {
           System.out.println(ex);
       }
		return SUCCESS;
	}
	
	public String[] getNamaBarang() {
		return namaBarang;
	}
	public void setNamaBarang(String[] namaBarang) {
		this.namaBarang = namaBarang;
	}
	public BigDecimal[] getHarga() {
		return harga;
	}
	public void setHarga(BigDecimal[] harga) {
		this.harga = harga;
	}
	public Integer[] getBanyaknya() {
		return banyaknya;
	}
	public void setBanyaknya(Integer[] banyaknya) {
		this.banyaknya = banyaknya;
	}
	public BigDecimal[] getJumlah() {
		return jumlah;
	}
	public void setJumlah(BigDecimal[] jumlah) {
		this.jumlah = jumlah;
	}
	public String getTglAwal() {
		return tglAwal;
	}
	public void setTglAwal(String tglAwal) {
		this.tglAwal = tglAwal;
	}
	public String getTglAkhir() {
		return tglAkhir;
	}
	public void setTglAkhir(String tglAkhir) {
		this.tglAkhir = tglAkhir;
	}
	public InputStream getInputStreamFile() {
		return inputStreamFile;
	}
	public void setInputStreamFile(InputStream inputStreamFile) {
		this.inputStreamFile = inputStreamFile;
	}
	public String getReportFile() {
		return reportFile;
	}
	public void setReportFile(String reportFile) {
		this.reportFile = reportFile;
	}
	public long getContentLength() {
		return contentLength;
	}
	public void setContentLength(long contentLength) {
		this.contentLength = contentLength;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Belanja getBelanja() {
		return belanja;
	}
	public void setBelanja(Belanja belanja) {
		this.belanja = belanja;
	}
	public List<Belanja> getListBelanja() {
		return listBelanja;
	}
	public void setListBelanja(List<Belanja> listBelanja) {
		this.listBelanja = listBelanja;
	}
	public List<BarangBelanja> getListBarangBelanja() {
		return listBarangBelanja;
	}
	public void setListBarangBelanja(List<BarangBelanja> listBarangBelanja) {
		this.listBarangBelanja = listBarangBelanja;
	}
	public List<Belanja> getListReport() {
		return listReport;
	}
	public void setListReport(List<Belanja> listReport) {
		this.listReport = listReport;
	}
}
