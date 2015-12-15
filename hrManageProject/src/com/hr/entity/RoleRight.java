package com.hr.entity;

import java.util.Date;

public class RoleRight {
    private Short rfId;

    private Short rfRoleId;

    private String rfRightCode;

    private Date updateDatetime;

    public Short getRfId() {
        return rfId;
    }

    public void setRfId(Short rfId) {
        this.rfId = rfId;
    }

    public Short getRfRoleId() {
        return rfRoleId;
    }

    public void setRfRoleId(Short rfRoleId) {
        this.rfRoleId = rfRoleId;
    }

    public String getRfRightCode() {
        return rfRightCode;
    }

    public void setRfRightCode(String rfRightCode) {
        this.rfRightCode = rfRightCode == null ? null : rfRightCode.trim();
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

	@Override
	public String toString() {
		return "RoleRight [rfId=" + rfId + ", rfRightCode=" + rfRightCode
				+ ", rfRoleId=" + rfRoleId + ", updateDatetime="
				+ updateDatetime + "]";
	}
    
}