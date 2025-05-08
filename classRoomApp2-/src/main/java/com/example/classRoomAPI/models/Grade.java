package com.example.classRoomAPI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "calificacion")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_calificacion")
    private Integer gradeId;

    @Column(name = "calificacion", length = 100, unique = false, nullable = false)
    private BigDecimal grade;

    //creando realacion (muchos a 1)
    @ManyToOne
    @JoinColumn(name = "fk_student", referencedColumnName = "id_student")
    @JsonBackReference
    private Student student;

    @ManyToOne
    @JoinColumn(name = "fk_subject", referencedColumnName = "id_subject")
    @JsonBackReference
    private Subject subject;




    public Grade() {
    }

    public Grade(Integer gradeId, BigDecimal grade) {
        this.gradeId = gradeId;
        this.grade = grade;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public BigDecimal getGrade() {
        return grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }
}
