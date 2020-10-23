package com.ely.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Orders implements Serializable {
    private Integer oid;

    private Integer ocount;

    private Integer oamountStatus;

    private String receivename;

    private String receiveaddress;

    private String receivetel;

    private Date addTime;

    private Integer fcid;

    private Integer fpid;


}