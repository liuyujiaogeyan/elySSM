package org.xinjing.demo.domain;

import java.util.Date;

public class Event {
    private Integer eid;

    private String ename;

    private String edesc;

    private Date addTime;

    private Date upTime;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getEdesc() {
        return edesc;
    }

    public void setEdesc(String edesc) {
        this.edesc = edesc == null ? null : edesc.trim();
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
}