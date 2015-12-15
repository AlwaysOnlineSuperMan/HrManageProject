package com.hr.entity;

import java.util.Date;

public class EngageAnswerDetails {
    private Short andId;

    private Short answerNumber;

    private Short subjectId;

    private String answer;

    private Date updateDatetime;

    public Short getAndId() {
        return andId;
    }

    public void setAndId(Short andId) {
        this.andId = andId;
    }

    public Short getAnswerNumber() {
        return answerNumber;
    }

    public void setAnswerNumber(Short answerNumber) {
        this.answerNumber = answerNumber;
    }

    public Short getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Short subjectId) {
        this.subjectId = subjectId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}