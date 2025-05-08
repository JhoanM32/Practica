package com.example.classRoomAPI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

public class Student {
    private Integer idStudent;
    private String grade;
    private Date birthdate;
    private String address;

    //Creando relacion (1 a muchos)
    @OneToMany(mappedBy = "student")
    @JsonManagedReference
    private List<Grade>calificaciones;
    private List<Attendance>asistencias;

    public Student() {

    }

    public Student(Integer idStudent, String grade, Date birthdate, String address) {
        this.idStudent = idStudent;
        this.grade = grade;
        this.birthdate = birthdate;
        this.address = address;
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
