package com.tyan.mangkubumi.modul.belanja.dao;

import com.tyan.mangkubumi.modul.belanja.model.BarangBelanja;
import com.tyan.mangkubumi.modul.belanja.model.BarangBelanjaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BarangBelanjaMapper {
    long countByExample(BarangBelanjaExample example);

    int deleteByExample(BarangBelanjaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BarangBelanja record);

    int insertSelective(BarangBelanja record);

    List<BarangBelanja> selectByExample(BarangBelanjaExample example);
    
    BarangBelanja sumBelanjaByExample(BarangBelanjaExample example);

    BarangBelanja selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BarangBelanja record, @Param("example") BarangBelanjaExample example);

    int updateByExample(@Param("record") BarangBelanja record, @Param("example") BarangBelanjaExample example);

    int updateByPrimaryKeySelective(BarangBelanja record);

    int updateByPrimaryKey(BarangBelanja record);
}