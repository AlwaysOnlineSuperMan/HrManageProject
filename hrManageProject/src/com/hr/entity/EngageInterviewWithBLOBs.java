package com.hr.entity;

public class EngageInterviewWithBLOBs extends EngageInterview {
    private String interviewComment;

    private String checkComment;

    public String getInterviewComment() {
        return interviewComment;
    }

    public void setInterviewComment(String interviewComment) {
        this.interviewComment = interviewComment == null ? null : interviewComment.trim();
    }

    public String getCheckComment() {
        return checkComment;
    }

    public void setCheckComment(String checkComment) {
        this.checkComment = checkComment == null ? null : checkComment.trim();
    }
}