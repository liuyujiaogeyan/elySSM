package com.ely.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ProductType implements Serializable {
    private Integer ptid;

    private String ptname;

    private Integer ptlevel;

    private Integer fparentlevel;

    private Date addTime;


}