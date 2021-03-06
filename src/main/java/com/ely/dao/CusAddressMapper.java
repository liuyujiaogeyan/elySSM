package com.ely.dao;

import com.ely.domain.CusAddress;
import com.ely.domain.CusAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusAddressMapper {
    long countByExample(CusAddressExample example);

    int deleteByExample(CusAddressExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(CusAddress record);

    int insertSelective(CusAddress record);

    List<CusAddress> selectByExample(CusAddressExample example);

    CusAddress selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") CusAddress record, @Param("example") CusAddressExample example);

    int updateByExample(@Param("record") CusAddress record, @Param("example") CusAddressExample example);

    int updateByPrimaryKeySelective(CusAddress record);

    int updateByPrimaryKey(CusAddress record);
}