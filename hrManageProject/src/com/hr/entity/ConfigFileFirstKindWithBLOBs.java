package com.hr.entity;

public class ConfigFileFirstKindWithBLOBs extends ConfigFileFirstKind {
    private String firstKindSalaryId;

    private String firstKindSaleId;

    public String getFirstKindSalaryId() {
        return firstKindSalaryId;
    }

    public void setFirstKindSalaryId(String firstKindSalaryId) {
        this.firstKindSalaryId = firstKindSalaryId == null ? null : firstKindSalaryId.trim();
    }

    public String getFirstKindSaleId() {
        return firstKindSaleId;
    }

    public void setFirstKindSaleId(String firstKindSaleId) {
        this.firstKindSaleId = firstKindSaleId == null ? null : firstKindSaleId.trim();
    }

	@Override
	public String toString() {
		return "ConfigFileFirstKindWithBLOBs [firstKindSalaryId="
				+ firstKindSalaryId + ", firstKindSaleId=" + firstKindSaleId
				+ "]"+super.toString();
	}
    
}