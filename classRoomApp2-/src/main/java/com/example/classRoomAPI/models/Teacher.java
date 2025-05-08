package com.example.classRoomAPI.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Teacher {

    private Integer idTeacher;
    private  String specialty;

    //Creando relacion (1 a muchos)
    @OneToMany(mappedBy = "teacher")
    @JsonManagedReference
    private List<Course> cursos;


    public Teacher() {
    }

    public Teacher(Integer idTeacher, String specialty) {
        this.idTeacher = idTeacher;
        this.specialty = specialty;
    }

    public Integer getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Integer idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
