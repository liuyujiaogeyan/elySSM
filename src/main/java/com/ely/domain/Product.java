package com.ely.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private Integer pid;

    private String pname;

    private String pimg;

    private String pdesc;

    private Double price;

    private Integer tid;

    private Date addTime;

    private Integer fsid;


}