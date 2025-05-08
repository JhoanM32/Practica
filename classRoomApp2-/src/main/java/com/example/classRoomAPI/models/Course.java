package com.example.classRoomAPI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "curso")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_curso")
    private Integer id;

    @Column(name = "nombre", length = 100, unique = false, nullable = false)
    private String name;

    //creando realacion (muchos a 1)
    @ManyToOne
    @JoinColumn(name = "fk_teacher", referencedColumnName = "idTeacher")
    @JsonBackReference
    private Teacher teacher;


    public Course() {
    }

    public Course(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
