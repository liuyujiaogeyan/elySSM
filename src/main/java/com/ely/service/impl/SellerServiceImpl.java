package com.ely.service.impl;

import com.ely.domain.Seller;
import com.ely.domain.SellerExample;
import com.ely.service.SellerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value="sellerService")
public class SellerServiceImpl implements SellerService {
    @Override
    public long countByExample(SellerExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(SellerExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer sid) {
        return 0;
    }

    @Override
    public int insert(Seller record) {
        return 0;
    }

    @Override
    public int insertSelective(Seller record) {
        return 0;
    }

    @Override
    public List<Seller> selectByExample(SellerExample example) {
        return null;
    }

    @Override
    public Seller selectByPrimaryKey(Integer sid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Seller record, SellerExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Seller record, SellerExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Seller record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Seller record) {
        return 0;
    }
}
