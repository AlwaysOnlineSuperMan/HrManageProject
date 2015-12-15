package com.hr.entity;

import java.util.Date;

public class Training {
    private Short traId;

    private String majorKindId;

    private String majorKindName;

    private String majorId;

    private String majorName;

    private String humanId;

    private String humanName;

    private String trainingItem;

    private Date trainingTime;

    private Integer trainingHour;

    private String trainingDegree;

    private String register;

    private String checker;

    private Date registTime;

    private Date checkTime;

    private Short checkstatus;

    private Date updateDatetime;

    private String remark;

    public Short getTraId() {
        return traId;
    }

    public void setTraId(Short traId) {
        this.traId = traId;
    }

    public String getMajorKindId() {
        return majorKindId;
    }

    public void setMajorKindId(String majorKindId) {
        this.majorKindId = majorKindId == null ? null : majorKindId.trim();
    }

    public String getMajorKindName() {
        return majorKindName;
    }

    public void setMajorKindName(String majorKindName) {
        this.majorKindName = majorKindName == null ? null : majorKindName.trim();
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId == null ? null : majorId.trim();
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
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

    public String getTrainingItem() {
        return trainingItem;
    }

    public void setTrainingItem(String trainingItem) {
        this.trainingItem = trainingItem == null ? null : trainingItem.trim();
    }

    public Date getTrainingTime() {
        return trainingTime;
    }

    public void setTrainingTime(Date trainingTime) {
        this.trainingTime = trainingTime;
    }

    public Integer getTrainingHour() {
        return trainingHour;
    }

    public void setTrainingHour(Integer trainingHour) {
        this.trainingHour = trainingHour;
    }

    public String getTrainingDegree() {
        return trainingDegree;
    }

    public void setTrainingDegree(String trainingDegree) {
        this.trainingDegree = trainingDegree == null ? null : trainingDegree.trim();
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

    public Short getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(Short checkstatus) {
        this.checkstatus = checkstatus;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}