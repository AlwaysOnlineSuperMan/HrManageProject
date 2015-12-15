package com.hr.entity;

import java.util.Date;

public class ConfigFileThirdKind {
    private Short ftkId;

    private String firstKindId;

    private String firstKindName;

    private String secondKindId;

    private String secondKindName;

    private String thirdKindId;

    private String thirdKindName;

    private String thirdKindIsRetail;

    private Date updateDatetime;

    private String thirdKindSaleId;

    public Short getFtkId() {
        return ftkId;
    }

	public String getFirstKindId() {
		return firstKindId;
	}

	public void setFirstKindId(String firstKindId) {
		this.firstKindId = firstKindId;
	}

	public String getFirstKindName() {
		return firstKindName;
	}

	public void setFirstKindName(String firstKindName) {
		this.firstKindName = firstKindName;
	}

	public String getSecondKindId() {
		return secondKindId;
	}

	public void setSecondKindId(String secondKindId) {
		this.secondKindId = secondKindId;
	}

	public String getSecondKindName() {
		return secondKindName;
	}

	public void setSecondKindName(String secondKindName) {
		this.secondKindName = secondKindName;
	}

	public String getThirdKindId() {
		return thirdKindId;
	}

	public void setThirdKindId(String thirdKindId) {
		this.thirdKindId = thirdKindId;
	}

	public String getThirdKindName() {
		return thirdKindName;
	}

	public void setThirdKindName(String thirdKindName) {
		this.thirdKindName = thirdKindName;
	}

	public String getThirdKindIsRetail() {
		return thirdKindIsRetail;
	}

	public void setThirdKindIsRetail(String thirdKindIsRetail) {
		this.thirdKindIsRetail = thirdKindIsRetail;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public String getThirdKindSaleId() {
		return thirdKindSaleId;
	}

	public void setThirdKindSaleId(String thirdKindSaleId) {
		this.thirdKindSaleId = thirdKindSaleId;
	}

	public void setFtkId(Short ftkId) {
		this.ftkId = ftkId;
	}

	@Override
	public String toString() {
		return "ConfigFileThirdKind [firstKindId=" + firstKindId
				+ ", firstKindName=" + firstKindName + ", ftkId=" + ftkId
				+ ", secondKindId=" + secondKindId + ", secondKindName="
				+ secondKindName + ", thirdKindId=" + thirdKindId
				+ ", thirdKindIsRetail=" + thirdKindIsRetail
				+ ", thirdKindName=" + thirdKindName + ", thirdKindSaleId="
				+ thirdKindSaleId + ", updateDatetime=" + updateDatetime + "]";
	}

   
}