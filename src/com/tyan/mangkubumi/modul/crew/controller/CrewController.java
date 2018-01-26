package com.tyan.mangkubumi.modul.crew.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.tyan.mangkubumi.core.ClassContext;
import com.tyan.mangkubumi.core.controller.CoreAction;
import com.tyan.mangkubumi.modul.crew.dao.CrewDao;
import com.tyan.mangkubumi.modul.crew.model.Crew;

public class CrewController extends CoreAction{

	private static final long serialVersionUID = 1L;
	private Crew crew;
	private List<Crew> listCrew = new ArrayList<>();
	private CrewDao crewDao = (CrewDao) ClassContext.getContext().getBean("crewDao");
	
	public String searchAllCrew(){
		System.out.println("jalankan method searchAllCrew");
		
		if(crew == null){
			crew = new Crew();
			crew.setNamaCrew("");
		}
		
		try {
			listCrew = crewDao.selectAll(crew);
		} catch (Exception e) {
			addActionMessage("Data tidak terdapat pada Database");
		}
		
		return SUCCESS;
	}
	public String searchAll(){
		System.out.println("Jalankan Method serachAll");
		
		listCrew = crewDao.selectList();
		return SUCCESS;
	}
	public String searchWhereKey(){
		System.out.println("jalankan method searchWhereKey");
		
		crew = crewDao.selectWhereKey(crew);
		return SUCCESS;
	}
	public String addCrew(){
		System.out.println("jalankan method addCrew");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		
		String id = "";
		int x = 0;
		x  = crewDao.countCrew(crew);
		id = crewDao.selectMax(crew);
		
		if(id==null){
			id = "0";
		}else{
			id = id.substring(8);
		}
		
		int z = Integer.parseInt(id);
		z++;
		if(z <99 && z>=10){
			date+="00"+z;
		}else if(z>99 && z<1000){
			date+="0"+z;
		}else if(z>=999){
				date+=z;
			}else{
				date+="000"+z;
			}
		if(x>0){
			addFieldError("invalidCrew", "Nama = "+crew.getNamaCrew()+" Tempat Lahir = "+crew.getTempatLahir()+" sudah terdaftar pada database");
		}
		
		crew.setIdCrew(date);
		try {
			crewDao.insertCrew(crew);
			addActionMessage("Data berhasil ditambah");
		} catch (NumberFormatException e) {
			addFieldError("invalidCrew", "Gagal menambah data");
		}
		return SUCCESS;
	}
	public String editCrew(){
		System.out.println("jalankan method editCrew");
		
		try {
			crewDao.updateCrew(crew);
		} catch (Exception e) {
			addFieldError("invalidCrew", "Gagal merubah data");
		}
		return SUCCESS;
	}
	public String deletCrew(){
		System.out.println("jalankan method deletCrew");
		
		try {
			crewDao.deletCrew(crew);
		} catch (Exception e) {
			addFieldError("invalidCrew", "Gagal menghapus data");
		}
		return SUCCESS;
	}
	public Crew getCrew() {
		return crew;
	}
	public void setCrew(Crew crew) {
		this.crew = crew;
	}
	public List<Crew> getListCrew() {
		return listCrew;
	}
	public void setListCrew(List<Crew> listCrew) {
		this.listCrew = listCrew;
	}
}
