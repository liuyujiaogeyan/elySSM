package com.ely.vo;

import com.ely.domain.ProductType;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import java.io.Serializable;
import java.util.Date;

@Data
public class ProductTypeCondition extends ProductType implements Serializable {
    @Min(0)
    private Integer ptidC;
    @Past()
    private Date startDate;

    private Date endDate;
}
