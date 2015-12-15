package com.hr.entity;

public class MajorChangeWithBLOBs extends MajorChange {
    private String changeReason;

    private String checkReason;

    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason == null ? null : changeReason.trim();
    }

    public String getCheckReason() {
        return checkReason;
    }

    public void setCheckReason(String checkReason) {
        this.checkReason = checkReason == null ? null : checkReason.trim();
    }
}