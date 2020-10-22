package com.ely.service;

import com.ely.domain.Sevent;
import com.ely.domain.SeventExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SeventService {
    long countByExample(SeventExample example);

    int deleteByExample(SeventExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sevent record);

    int insertSelective(Sevent record);

    List<Sevent> selectByExample(SeventExample example);

    Sevent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sevent record, @Param("example") SeventExample example);

    int updateByExample(@Param("record") Sevent record, @Param("example") SeventExample example);

    int updateByPrimaryKeySelective(Sevent record);

    int updateByPrimaryKey(Sevent record);
}