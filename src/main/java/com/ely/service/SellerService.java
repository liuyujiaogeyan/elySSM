package com.ely.service;

import com.ely.domain.Seller;
import com.ely.domain.SellerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SellerService {
    long countByExample(SellerExample example);

    int deleteByExample(SellerExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Seller record);

    int insertSelective(Seller record);

    List<Seller> selectByExample(SellerExample example);

    Seller selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Seller record, @Param("example") SellerExample example);

    int updateByExample(@Param("record") Seller record, @Param("example") SellerExample example);

    int updateByPrimaryKeySelective(Seller record);

    int updateByPrimaryKey(Seller record);
}