package com.whoisparis.studentprof.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;


@Entity
public class User {


    @Id
    @GeneratedValue
    private Long id;
    private String name;

    private String profBuro;
    private String groupp;
    private String date;
    private String grade;
    private String profStatus;
    private String profTicket;
    private String gradeStatus;
    private String comment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfBuro() {
        return profBuro;
    }

    public void setProfBuro(String profBuro) {
        this.profBuro = profBuro;
    }

    public String getGroupp() {
        return groupp;
    }

    public void setGroupp(String groupp) {
        this.groupp = groupp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getProfStatus() {
        return profStatus;
    }

    public void setProfStatus(String profStatus) {
        this.profStatus = profStatus;
    }

    public String getProfTicket() {
        return profTicket;
    }

    public void setProfTicket(String profTicket) {
        this.profTicket = profTicket;
    }

    public String getGradeStatus() {
        return gradeStatus;
    }

    public void setGradeStatus(String gradeStatus) {
        this.gradeStatus = gradeStatus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
