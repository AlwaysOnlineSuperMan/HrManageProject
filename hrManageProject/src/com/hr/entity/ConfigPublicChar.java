package com.hr.entity;

import java.util.Date;

public class ConfigPublicChar {
    private Short pbcId;

    private String attributeKind;

    private String attributeName;

    private Date updateDatetime;

    public Short getPbcId() {
        return pbcId;
    }

    public void setPbcId(Short pbcId) {
        this.pbcId = pbcId;
    }

    public String getAttributeKind() {
        return attributeKind;
    }

    public void setAttributeKind(String attributeKind) {
        this.attributeKind = attributeKind == null ? null : attributeKind.trim();
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName == null ? null : attributeName.trim();
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}