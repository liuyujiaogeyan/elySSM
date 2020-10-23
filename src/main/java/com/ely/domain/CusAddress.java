package com.ely.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CusAddress implements Serializable {
    private Integer aid;

    private String content;

    private Integer fcid;

    private Date addTime;


}