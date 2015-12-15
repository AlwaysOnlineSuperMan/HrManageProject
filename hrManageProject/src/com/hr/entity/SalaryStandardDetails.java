package com.hr.entity;

import java.util.Date;

public class SalaryStandardDetails {
    private Short sdtId;

    private String standardId;

    private String standardName;

    private Short itemId;

    private String itemName;

    private Float salary;

    private Date updateDatetime;

    
    @Override
	public String toString() {
		return "SalaryStandardDetails [itemId=" + itemId + ", itemName="
				+ itemName + ", salary=" + salary + ", sdtId=" + sdtId
				+ ", standardId=" + standardId + ", standardName="
				+ standardName + ", updateDatetime=" + updateDatetime + "]";
	}

	public Short getSdtId() {
        return sdtId;
    }

    public void setSdtId(Short sdtId) {
        this.sdtId = sdtId;
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

    public Short getItemId() {
        return itemId;
    }

    public void setItemId(Short itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}