package com.hr.entity;

import java.util.Date;

public class SalaryStandard {
    private Short ssdId;

    private String standardId;

    private String standardName;

    private String designer;

    private String register;

    private String checker;

    private String changer;

    private Date registTime;

    private Date checkTime;

    private Date changeTime;

    private Float salarySum;

    private Short checkStatus;

    private Short changeStatus;

    private Date updateDatetime;
    
    @Override
	public String toString() {
		return "SalaryStandard [changeStatus=" + changeStatus + ", changeTime="
				+ changeTime + ", changer=" + changer + ", checkStatus="
				+ checkStatus + ", checkTime=" + checkTime + ", checker="
				+ checker + ", designer=" + designer + ", registTime="
				+ registTime + ", register=" + register + ", salarySum="
				+ salarySum + ", ssdId=" + ssdId + ", standardId=" + standardId
				+ ", standardName=" + standardName + ", updateDatetime="
				+ updateDatetime + "]";
	}

	public Short getSsdId() {
        return ssdId;
    }

    public void setSsdId(Short ssdId) {
        this.ssdId = ssdId;
    }

    public String getStandardId() {
        return standardId;
    }

    public void setStandardId(String standardId) {
        this.standardId = standardId == null ? null : standardId.trim();
    }

    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName == null ? null : standardName.trim();
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer == null ? null : designer.trim();
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register == null ? null : register.trim();
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    public String getChanger() {
        return changer;
    }

    public void setChanger(String changer) {
        this.changer = changer == null ? null : changer.trim();
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    public Float getSalarySum() {
        return salarySum;
    }

    public void setSalarySum(Float salarySum) {
        this.salarySum = salarySum;
    }

    public Short getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Short checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Short getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(Short changeStatus) {
        this.changeStatus = changeStatus;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}