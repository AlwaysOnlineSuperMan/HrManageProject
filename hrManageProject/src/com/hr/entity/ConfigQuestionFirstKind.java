package com.hr.entity;

import java.util.Date;

public class ConfigQuestionFirstKind {
    private Short qfkId;

    private String firstKindId;

    private String firstKindName;

    private Date updateDatetime;

    public Short getQfkId() {
        return qfkId;
    }

    public void setQfkId(Short qfkId) {
        this.qfkId = qfkId;
    }

    public String getFirstKindId() {
        return firstKindId;
    }

    public void setFirstKindId(String firstKindId) {
        this.firstKindId = firstKindId == null ? null : firstKindId.trim();
    }

    public String getFirstKindName() {
        return firstKindName;
    }

    public void setFirstKindName(String firstKindName) {
        this.firstKindName = firstKindName == null ? null : firstKindName.trim();
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}