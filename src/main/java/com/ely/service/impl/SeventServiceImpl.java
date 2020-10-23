package com.ely.service.impl;

import com.ely.domain.Sevent;
import com.ely.domain.SeventExample;
import com.ely.service.SeventService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value="seventService")
public class SeventServiceImpl implements SeventService {
    @Override
    public long countByExample(SeventExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(SeventExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Sevent record) {
        return 0;
    }

    @Override
    public int insertSelective(Sevent record) {
        return 0;
    }

    @Override
    public List<Sevent> selectByExample(SeventExample example) {
        return null;
    }

    @Override
    public Sevent selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Sevent record, SeventExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Sevent record, SeventExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Sevent record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Sevent record) {
        return 0;
    }
}
