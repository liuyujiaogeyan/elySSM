package com.ely.domain;

import lombok.Data;

@Data
public class ProductType {
    private Integer ptid;

    private String ptname;

    private Integer ptlevel;

    private Integer fparentlevel;


}