package com.example.classRoomAPI.helpers;

public enum MessagesApi {
    ERROR_TEACHER_NO_ENCONTRADO("el docente que buscas, no esta en la base de datos"),
    ERROR_STUDENT_NO_ENCONTRADO("El estudiante no esta,perro!!.")
    ;

    private String menssages;

    MessagesApi(String menssages) {
        this.menssages = menssages;
    }

    public String getMenssages() {
        return menssages;
    }
}
