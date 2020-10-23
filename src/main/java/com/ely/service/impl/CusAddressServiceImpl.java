package com.ely.service.impl;

import com.ely.domain.CusAddress;
import com.ely.domain.CusAddressExample;
import com.ely.service.CusAddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value="cusAddressService")
public class CusAddressServiceImpl implements CusAddressService {
    @Override
    public long countByExample(CusAddressExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(CusAddressExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer aid) {
        return 0;
    }

    @Override
    public int insert(CusAddress record) {
        return 0;
    }

    @Override
    public int insertSelective(CusAddress record) {
        return 0;
    }

    @Override
    public List<CusAddress> selectByExample(CusAddressExample example) {
        return null;
    }

    @Override
    public CusAddress selectByPrimaryKey(Integer aid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(CusAddress record, CusAddressExample example) {
        return 0;
    }

    @Override
    public int updateByExample(CusAddress record, CusAddressExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(CusAddress record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CusAddress record) {
        return 0;
    }
}
