package com.ely.service.impl;

import com.ely.domain.Event;
import com.ely.domain.EventExample;
import com.ely.service.EventService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value="eventService")
public class EventServiceImpl implements EventService {
    @Override
    public long countByExample(EventExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(EventExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer eid) {
        return 0;
    }

    @Override
    public int insert(Event record) {
        return 0;
    }

    @Override
    public int insertSelective(Event record) {
        return 0;
    }

    @Override
    public List<Event> selectByExample(EventExample example) {
        return null;
    }

    @Override
    public Event selectByPrimaryKey(Integer eid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Event record, EventExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Event record, EventExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Event record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Event record) {
        return 0;
    }
}
