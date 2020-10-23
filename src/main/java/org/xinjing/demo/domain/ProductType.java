package org.xinjing.demo.domain;

public class ProductType {
    private Integer ptid;

    private String ptname;

    private Integer ptlevel;

    private Integer fparentlevel;

    public Integer getPtid() {
        return ptid;
    }

    public void setPtid(Integer ptid) {
        this.ptid = ptid;
    }

    public String getPtname() {
        return ptname;
    }

    public void setPtname(String ptname) {
        this.ptname = ptname == null ? null : ptname.trim();
    }

    public Integer getPtlevel() {
        return ptlevel;
    }

    public void setPtlevel(Integer ptlevel) {
        this.ptlevel = ptlevel;
    }

    public Integer getFparentlevel() {
        return fparentlevel;
    }

    public void setFparentlevel(Integer fparentlevel) {
        this.fparentlevel = fparentlevel;
    }
}