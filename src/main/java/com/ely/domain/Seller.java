package com.ely.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Seller implements Serializable {
    private Integer sid;

    private String sname;

    private String spassword;

    private String simg;

    private Double mark;

    private Integer hid;

    private String express;

    private Boolean recommend;

    private Date addTime;

    private String address;


}