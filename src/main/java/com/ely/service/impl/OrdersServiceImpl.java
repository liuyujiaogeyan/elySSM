package com.ely.service.impl;

import com.ely.domain.Orders;
import com.ely.domain.OrdersExample;
import com.ely.service.OrdersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value="orderService")
public class OrdersServiceImpl implements OrdersService {
    @Override
    public long countByExample(OrdersExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(OrdersExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer oid) {
        return 0;
    }

    @Override
    public int insert(Orders record) {
        return 0;
    }

    @Override
    public int insertSelective(Orders record) {
        return 0;
    }

    @Override
    public List<Orders> selectByExample(OrdersExample example) {
        return null;
    }

    @Override
    public Orders selectByPrimaryKey(Integer oid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Orders record, OrdersExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Orders record, OrdersExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Orders record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Orders record) {
        return 0;
    }
}
