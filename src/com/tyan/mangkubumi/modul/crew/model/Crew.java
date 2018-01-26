package com.tyan.mangkubumi.modul.crew.model;

import java.util.Date;

public class Crew {

	private String idCrew;
	private String namaCrew;
	private String tempatLahir;
	private Date tanggalLahir;
	private String kontak;
	private String alamat;
	public String getIdCrew() {
		return idCrew;
	}
	public void setIdCrew(String idCrew) {
		this.idCrew = idCrew;
	}
	public String getNamaCrew() {
		return namaCrew;
	}
	public void setNamaCrew(String namaCrew) {
		this.namaCrew = namaCrew;
	}
	public String getTempatLahir() {
		return tempatLahir;
	}
	public void setTempatLahir(String tempatLahir) {
		this.tempatLahir = tempatLahir;
	}
	public Date getTanggalLahir() {
		return tanggalLahir;
	}
	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}
	public String getKontak() {
		return kontak;
	}
	public void setKontak(String kontak) {
		this.kontak = kontak;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
}
