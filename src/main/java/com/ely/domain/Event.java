package com.ely.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Event implements Serializable {
    private Integer eid;

    private String ename;

    private String edesc;

    private Date addTime;


}