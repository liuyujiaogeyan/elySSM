package com.ely.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Event {
    private Integer eid;

    private String ename;

    private String edesc;

    private Date addTime;


}