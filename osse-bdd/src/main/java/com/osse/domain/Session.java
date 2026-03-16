package com.osse.domain;

import java.time.LocalDate;

public class Session {

    private String name;
    private String type;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;

    public Session(String name, String type, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = "DRAFT";
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getName() {
        return name;
    }
}