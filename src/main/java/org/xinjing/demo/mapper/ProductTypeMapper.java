package org.xinjing.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xinjing.demo.domain.ProductType;
import org.xinjing.demo.domain.ProductTypeExample;

public interface ProductTypeMapper {
    long countByExample(ProductTypeExample example);

    int deleteByExample(ProductTypeExample example);

    int deleteByPrimaryKey(Integer ptid);

    int insert(ProductType record);

    int insertSelective(ProductType record);

    List<ProductType> selectByExample(ProductTypeExample example);

    ProductType selectByPrimaryKey(Integer ptid);

    int updateByExampleSelective(@Param("record") ProductType record, @Param("example") ProductTypeExample example);

    int updateByExample(@Param("record") ProductType record, @Param("example") ProductTypeExample example);

    int updateByPrimaryKeySelective(ProductType record);

    int updateByPrimaryKey(ProductType record);
}