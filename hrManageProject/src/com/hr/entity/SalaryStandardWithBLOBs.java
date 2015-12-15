package com.hr.entity;

public class SalaryStandardWithBLOBs extends SalaryStandard {
    private String checkComment;

    private String remark;

    
    @Override
	public String toString() {
		return "SalaryStandardWithBLOBs [checkComment=" + checkComment
				+ ", remark=" + remark + "]"+super.toString();
	}

	public String getCheckComment() {
        return checkComment;
    }

    public void setCheckComment(String checkComment) {
        this.checkComment = checkComment == null ? null : checkComment.trim();
    }

    public String getRemark() { 
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}