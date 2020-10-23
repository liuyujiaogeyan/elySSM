package com.ely.dao;

import com.ely.domain.Sevent;
import com.ely.domain.SeventExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeventMapper {
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