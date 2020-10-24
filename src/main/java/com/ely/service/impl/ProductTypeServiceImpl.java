package com.ely.service.impl;

import com.ely.dao.ProductTypeMapper;
import com.ely.domain.ProductType;
import com.ely.domain.ProductTypeExample;
import com.ely.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value="productTypeService")
public class ProductTypeServiceImpl implements ProductTypeService {
    @Autowired
    private ProductTypeMapper  productTypeMapper;
    @Override
    public long countByExample(ProductTypeExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(ProductTypeExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer ptid) {
        return 0;
    }

    @Override
    public int insert(ProductType record) {
        return 0;
    }

    @Override
    public int insertSelective(ProductType record) {
        return 0;
    }



    @Override
    public ProductType selectByPrimaryKey(Integer ptid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(ProductType record, ProductTypeExample example) {
        return 0;
    }

    @Override
    public int updateByExample(ProductType record, ProductTypeExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(ProductType record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ProductType record) {
        return 0;
    }

    /**
     *
     *
     * @author xinjing
     * @param example
     * @return ProductType 列表
     */
    @Override
    public List<ProductType> selectByExample(ProductTypeExample example) {
        System.out.println("selectByExample" + example);
        return productTypeMapper.selectByExample(example);
    }


}
