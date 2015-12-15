package com.hr.entity;

public class EngageSubjectsWithBLOBs extends EngageSubjects {
    private String content;

    private String keyA;

    private String keyB;

    private String keyC;

    private String keyD;

    private String keyE;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getKeyA() {
        return keyA;
    }

    public void setKeyA(String keyA) {
        this.keyA = keyA == null ? null : keyA.trim();
    }

    public String getKeyB() {
        return keyB;
    }

    public void setKeyB(String keyB) {
        this.keyB = keyB == null ? null : keyB.trim();
    }

    public String getKeyC() {
        return keyC;
    }

    public void setKeyC(String keyC) {
        this.keyC = keyC == null ? null : keyC.trim();
    }

    public String getKeyD() {
        return keyD;
    }

    public void setKeyD(String keyD) {
        this.keyD = keyD == null ? null : keyD.trim();
    }

    public String getKeyE() {
        return keyE;
    }

    public void setKeyE(String keyE) {
        this.keyE = keyE == null ? null : keyE.trim();
    }
}