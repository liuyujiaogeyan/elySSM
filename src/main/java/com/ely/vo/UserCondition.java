package com.ely.vo;

import com.ely.domain.User;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import java.io.Serializable;
import java.util.Date;

@Data
public class UserCondition extends User implements Serializable{
    @Min(0)
    private Integer uidCondtion;
    @Past
    private Date stratDate;
    @Past
    private Date endDate;
        @Override
        public String toString() {
            return super.toString() + "UserCondition{" +
                    "uidCondtion=" + uidCondtion +
                    ", stratDate=" + stratDate +
                    ", endDate=" + endDate +
                    '}';
        }
}
