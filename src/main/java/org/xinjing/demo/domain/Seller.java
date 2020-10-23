package org.xinjing.demo.domain;

import java.util.Date;

public class Seller {
    private Integer sid;

    private String sname;

    private String spassword;

    private String simg;

    private Double mark;

    private Integer hid;

    private String express;

    private Boolean recommend;

    private Date addTime;

    private Date upTime;

    private String address;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword == null ? null : spassword.trim();
    }

    public String getSimg() {
        return simg;
    }

    public void setSimg(String simg) {
        this.simg = simg == null ? null : simg.trim();
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getExpress() {
        return express;
    }

    public void setExpress(String express) {
        this.express = express == null ? null : express.trim();
    }

    public Boolean getRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}