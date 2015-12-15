package com.hr.entity;

import java.util.Date;

public class SalaryGrantDetails {
    private Short grdId;

    private String salaryGrantId;

    private String humanId;

    private String humanName;

    private Float bounsSum;

    private Float saleSum;

    private Float deductSum;

    private Float salaryStandardSum;

    private Float salaryPaidSum;

    private Date updateDatetime;

    public Short getGrdId() {
        return grdId;
    }

    public void setGrdId(Short grdId) {
        this.grdId = grdId;
    }

    public String getSalaryGrantId() {
        return salaryGrantId;
    }

    public void setSalaryGrantId(String salaryGrantId) {
        this.salaryGrantId = salaryGrantId == null ? null : salaryGrantId.trim();
    }

    public String getHumanId() {
        return humanId;
    }

    public void setHumanId(String humanId) {
        this.humanId = humanId == null ? null : humanId.trim();
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName == null ? null : humanName.trim();
    }

    public Float getBounsSum() {
        return bounsSum;
    }

    public void setBounsSum(Float bounsSum) {
        this.bounsSum = bounsSum;
    }

    public Float getSaleSum() {
        return saleSum;
    }

    public void setSaleSum(Float saleSum) {
        this.saleSum = saleSum;
    }

    public Float getDeductSum() {
        return deductSum;
    }

    public void setDeductSum(Float deductSum) {
        this.deductSum = deductSum;
    }

    public Float getSalaryStandardSum() {
        return salaryStandardSum;
    }

    public void setSalaryStandardSum(Float salaryStandardSum) {
        this.salaryStandardSum = salaryStandardSum;
    }

    public Float getSalaryPaidSum() {
        return salaryPaidSum;
    }

    public void setSalaryPaidSum(Float salaryPaidSum) {
        this.salaryPaidSum = salaryPaidSum;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}