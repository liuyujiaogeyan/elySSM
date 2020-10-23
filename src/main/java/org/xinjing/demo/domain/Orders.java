package org.xinjing.demo.domain;

import java.util.Date;

public class Orders {
    private Integer oid;

    private Integer ocount;

    private Integer oamountStatus;

    private String receivename;

    private String receiveaddress;

    private String receivetel;

    private Date addTime;

    private Date upTime;

    private Integer fcid;

    private Integer fpid;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getOcount() {
        return ocount;
    }

    public void setOcount(Integer ocount) {
        this.ocount = ocount;
    }

    public Integer getOamountStatus() {
        return oamountStatus;
    }

    public void setOamountStatus(Integer oamountStatus) {
        this.oamountStatus = oamountStatus;
    }

    public String getReceivename() {
        return receivename;
    }

    public void setReceivename(String receivename) {
        this.receivename = receivename == null ? null : receivename.trim();
    }

    public String getReceiveaddress() {
        return receiveaddress;
    }

    public void setReceiveaddress(String receiveaddress) {
        this.receiveaddress = receiveaddress == null ? null : receiveaddress.trim();
    }

    public String getReceivetel() {
        return receivetel;
    }

    public void setReceivetel(String receivetel) {
        this.receivetel = receivetel == null ? null : receivetel.trim();
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

    public Integer getFcid() {
        return fcid;
    }

    public void setFcid(Integer fcid) {
        this.fcid = fcid;
    }

    public Integer getFpid() {
        return fpid;
    }

    public void setFpid(Integer fpid) {
        this.fpid = fpid;
    }
}