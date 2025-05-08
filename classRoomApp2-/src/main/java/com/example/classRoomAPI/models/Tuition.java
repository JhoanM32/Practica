package com.example.classRoomAPI.models;

import java.util.Date;

public class Tuition {
    private Integer tuitionId;
    private Date tuitionDate;

    public Tuition() {
    }

    public Tuition(Integer tuitionId, Date tuitionDate) {
        this.tuitionId = tuitionId;
        this.tuitionDate = tuitionDate;
    }

    public Integer getTuitionId() {
        return tuitionId;
    }

    public void setTuitionId(Integer tuitionId) {
        this.tuitionId = tuitionId;
    }

    public Date getTuitionDate() {
        return tuitionDate;
    }

    public void setTuitionDate(Date tuitionDate) {
        this.tuitionDate = tuitionDate;
    }
}
