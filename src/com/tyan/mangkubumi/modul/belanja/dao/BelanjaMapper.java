package com.tyan.mangkubumi.modul.belanja.dao;

import com.tyan.mangkubumi.modul.belanja.model.Belanja;
import com.tyan.mangkubumi.modul.belanja.model.BelanjaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BelanjaMapper {
    long countByExample(BelanjaExample example);

    int deleteByExample(BelanjaExample example);

    int deleteByPrimaryKey(Integer idTransaksi);

    int insert(Belanja record);

    int insertSelective(Belanja record);

    List<Belanja> selectByExample(BelanjaExample example);
    
    List<Belanja> selectReport(Belanja record);

    Belanja selectByPrimaryKey(Integer idTransaksi);

    int updateByExampleSelective(@Param("record") Belanja record, @Param("example") BelanjaExample example);

    int updateByExample(@Param("record") Belanja record, @Param("example") BelanjaExample example);

    int updateByPrimaryKeySelective(Belanja record);

    int updateByPrimaryKey(Belanja record);
}