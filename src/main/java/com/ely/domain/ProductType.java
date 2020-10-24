package com.ely.domain;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Data
public class ProductType implements Serializable {
    @Min(1)
    private Integer ptid;

    @Size(min = 6 , max = 20)
    private String ptname;

    private Integer ptlevel;

    private Integer fparentlevel;

    private Date addTime;


}