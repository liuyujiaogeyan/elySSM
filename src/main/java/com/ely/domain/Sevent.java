package com.ely.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Sevent implements Serializable {
    private Integer id;

    private Integer sid;

    private Integer eid;

    private Date addTime;


}