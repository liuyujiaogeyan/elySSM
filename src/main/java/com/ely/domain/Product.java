package com.ely.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Product implements Serializable {
    private Integer pid;

    private String pname;

    private String pimg;

    private String pdesc;

    private Double price;

    private Integer tid;

    private Date addTime;

    private Integer fsid;


}