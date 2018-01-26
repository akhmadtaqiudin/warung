package com.tyan.mangkubumi.modul.crew.dao;

import java.util.List;

import com.tyan.mangkubumi.modul.crew.model.Crew;

public interface CrewDao {

	int insertCrew(Crew record);
	int updateCrew(Crew record);
	int deletCrew(Crew record);
	int countCrew(Crew record);
	String selectMax(Crew record);
	Crew selectWhereKey(Crew record);
	List<Crew> selectAll(Crew record);
	List<Crew> selectList();
}
