package com.hr.entity;

import java.util.Date;

public class ConfigMajorDesignation {
    private Short cmdId;

    private String cmdName;

    private Date updateDatetime;

    public Short getCmdId() {
        return cmdId;
    }

    public void setCmdId(Short cmdId) {
        this.cmdId = cmdId;
    }

    public String getCmdName() {
        return cmdName;
    }

    public void setCmdName(String cmdName) {
        this.cmdName = cmdName == null ? null : cmdName.trim();
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}