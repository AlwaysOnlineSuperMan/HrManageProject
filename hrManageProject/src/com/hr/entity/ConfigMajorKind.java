package com.hr.entity;

import java.util.Date;

public class ConfigMajorKind {
    private Short mfkId;

    private String majorKindName;

    private String majorKindId;

    private Date updateDatetime;

	public Short getMfkId() {
		return mfkId;
	}

	public void setMfkId(Short mfkId) {
		this.mfkId = mfkId;
	}

	public String getMajorKindName() {
		return majorKindName;
	}

	public void setMajorKindName(String majorKindName) {
		this.majorKindName = majorKindName;
	}

	public String getMajorKindId() {
		return majorKindId;
	}

	public void setMajorKindId(String majorKindId) {
		this.majorKindId = majorKindId;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	@Override
	public String toString() {
		return "ConfigMajorKind [majorKindId=" + majorKindId
				+ ", majorKindName=" + majorKindName + ", mfkId=" + mfkId
				+ ", updateDatetime=" + updateDatetime + "]";
	}

 
}