package com.ely.service.impl;

import com.ely.domain.Product;
import com.ely.domain.ProductExample;
import com.ely.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value="productService")
public class ProductServiceImpl implements ProductService {
    @Override
    public long countByExample(ProductExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(ProductExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer pid) {
        return 0;
    }

    @Override
    public int insert(Product record) {
        return 0;
    }

    @Override
    public int insertSelective(Product record) {
        return 0;
    }

    @Override
    public List<Product> selectByExample(ProductExample example) {
        return null;
    }

    @Override
    public Product selectByPrimaryKey(Integer pid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Product record, ProductExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Product record, ProductExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Product record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Product record) {
        return 0;
    }
}
