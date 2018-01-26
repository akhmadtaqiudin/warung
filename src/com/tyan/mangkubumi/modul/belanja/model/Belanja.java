package com.tyan.mangkubumi.modul.belanja.model;

import java.math.BigDecimal;
import java.util.Date;

public class Belanja{
    private Integer idTransaksi;

    private String namaCrew;

    private Date tanggalTransaksi;

    private BigDecimal totalBelanja;

    private BigDecimal setoran;

    private BigDecimal uangMakan;

    private BigDecimal jumlahTerima;
    
    private Date tanggalAwal;
    
    private Date tanggalAkhir;

    private String nb;

    private String hrg;

    private String byk;

    public Integer getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(Integer idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getNamaCrew() {
        return namaCrew;
    }

    public void setNamaCrew(String namaCrew) {
        this.namaCrew = namaCrew == null ? null : namaCrew.trim();
    }

    public Date getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(Date tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public BigDecimal getTotalBelanja() {
        return totalBelanja;
    }

    public void setTotalBelanja(BigDecimal totalBelanja) {
        this.totalBelanja = totalBelanja;
    }

    public BigDecimal getSetoran() {
        return setoran;
    }

    public void setSetoran(BigDecimal setoran) {
        this.setoran = setoran;
    }

    public BigDecimal getUangMakan() {
        return uangMakan;
    }

    public void setUangMakan(BigDecimal uangMakan) {
        this.uangMakan = uangMakan;
    }

    public BigDecimal getJumlahTerima() {
        return jumlahTerima;
    }

    public void setJumlahTerima(BigDecimal jumlahTerima) {
        this.jumlahTerima = jumlahTerima;
    }

	public Date getTanggalAwal() {
		return tanggalAwal;
	}

	public void setTanggalAwal(Date tanggalAwal) {
		this.tanggalAwal = tanggalAwal;
	}

	public Date getTanggalAkhir() {
		return tanggalAkhir;
	}

	public void setTanggalAkhir(Date tanggalAkhir) {
		this.tanggalAkhir = tanggalAkhir;
	}

	public String getNb() {
		return nb;
	}

	public void setNb(String nb) {
		this.nb = nb;
	}

	public String getHrg() {
		return hrg;
	}

	public void setHrg(String hrg) {
		this.hrg = hrg;
	}

	public String getByk() {
		return byk;
	}

	public void setByk(String byk) {
		this.byk = byk;
	}
}