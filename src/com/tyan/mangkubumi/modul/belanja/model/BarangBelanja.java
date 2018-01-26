package com.tyan.mangkubumi.modul.belanja.model;

import java.math.BigDecimal;
import java.util.Date;

public class BarangBelanja {
    private Integer id;

    private String namaCrew;

    private String namaBarang;

    private BigDecimal harga;

    private Integer banyaknya;

    private BigDecimal jumlah;

    private Date tanggalTransaksi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaCrew() {
        return namaCrew;
    }

    public void setNamaCrew(String namaCrew) {
        this.namaCrew = namaCrew == null ? null : namaCrew.trim();
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang == null ? null : namaBarang.trim();
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    public Integer getBanyaknya() {
        return banyaknya;
    }

    public void setBanyaknya(Integer banyaknya) {
        this.banyaknya = banyaknya;
    }

    public BigDecimal getJumlah() {
        return jumlah;
    }

    public void setJumlah(BigDecimal jumlah) {
        this.jumlah = jumlah;
    }

    public Date getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(Date tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }
}