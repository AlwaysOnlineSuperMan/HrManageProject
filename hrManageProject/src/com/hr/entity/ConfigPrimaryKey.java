package com.hr.entity;

import java.util.Date;

public class ConfigPrimaryKey {
    private Short prkId;

    private String primaryKeyTable;

    private String primaryKey;

    private String keyName;

    private Boolean primaryKeyStatus;

    private Date updateDatetime;

    public Short getPrkId() {
        return prkId;
    }

    public void setPrkId(Short prkId) {
        this.prkId = prkId;
    }

    public String getPrimaryKeyTable() {
        return primaryKeyTable;
    }

    public void setPrimaryKeyTable(String primaryKeyTable) {
        this.primaryKeyTable = primaryKeyTable == null ? null : primaryKeyTable.trim();
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey == null ? null : primaryKey.trim();
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName == null ? null : keyName.trim();
    }

    public Boolean getPrimaryKeyStatus() {
        return primaryKeyStatus;
    }

    public void setPrimaryKeyStatus(Boolean primaryKeyStatus) {
        this.primaryKeyStatus = primaryKeyStatus;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}