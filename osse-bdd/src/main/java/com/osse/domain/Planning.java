package com.osse.domain;

public class Planning {
    private String status;

    public Planning() {
        this.status = "BROUILLON";
    }

    public String getStatus() {
        return status;
    }

    public void publish() {
        this.status = "PUBLIEE";
    }
}