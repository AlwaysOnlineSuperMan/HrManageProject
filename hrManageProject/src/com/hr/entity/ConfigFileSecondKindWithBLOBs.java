package com.hr.entity;

public class ConfigFileSecondKindWithBLOBs extends ConfigFileSecondKind {
    private String secondSalaryId;

    private String secondSaleId;

    public String getSecondSalaryId() {
        return secondSalaryId;
    }

    public void setSecondSalaryId(String secondSalaryId) {
        this.secondSalaryId = secondSalaryId == null ? null : secondSalaryId.trim();
    }

    public String getSecondSaleId() {
        return secondSaleId;
    }

    public void setSecondSaleId(String secondSaleId) {
        this.secondSaleId = secondSaleId == null ? null : secondSaleId.trim();
    }
}