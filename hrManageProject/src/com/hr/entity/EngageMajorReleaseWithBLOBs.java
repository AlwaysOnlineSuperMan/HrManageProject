package com.hr.entity;

public class EngageMajorReleaseWithBLOBs extends EngageMajorRelease {
    private String majorDescribe;

    private String engageRequired;

    public String getMajorDescribe() {
        return majorDescribe;
    }

    public void setMajorDescribe(String majorDescribe) {
        this.majorDescribe = majorDescribe == null ? null : majorDescribe.trim();
    }

    public String getEngageRequired() {
        return engageRequired;
    }

    public void setEngageRequired(String engageRequired) {
        this.engageRequired = engageRequired == null ? null : engageRequired.trim();
    }

	@Override
	public String toString() {
		return "EngageMajorReleaseWithBLOBs [engageRequired=" + engageRequired
				+ ", majorDescribe=" + majorDescribe + "]"+super.toString();
	}
    
}