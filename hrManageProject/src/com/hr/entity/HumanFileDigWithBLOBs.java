package com.hr.entity;

public class HumanFileDigWithBLOBs extends HumanFileDig {
    private String remark;

    private String humanHistroyRecords;

    private String humanFamilyMembership;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getHumanHistroyRecords() {
        return humanHistroyRecords;
    }

    public void setHumanHistroyRecords(String humanHistroyRecords) {
        this.humanHistroyRecords = humanHistroyRecords == null ? null : humanHistroyRecords.trim();
    }

    public String getHumanFamilyMembership() {
        return humanFamilyMembership;
    }

    public void setHumanFamilyMembership(String humanFamilyMembership) {
        this.humanFamilyMembership = humanFamilyMembership == null ? null : humanFamilyMembership.trim();
    }

	@Override
	public String toString() {
		return "HumanFileDigWithBLOBs [humanFamilyMembership="
				+ humanFamilyMembership + ", humanHistroyRecords="
				+ humanHistroyRecords + ", remark=" + remark + "]"+super.toString();
	}
    
}