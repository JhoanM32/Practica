package com.example.classRoomAPI.controllers;

import com.example.classRoomAPI.models.Teacher;
import com.example.classRoomAPI.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docentes")
public class TeacherController {

    @Autowired
    TeacherService service;

    //guardar
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Teacher datosQueEnviaElCliente){
        try {

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.service.saveTeacher(datosQueEnviaElCliente));

        }catch (Exception error){

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //buscartodos

    //buscarPorid


    //modificar
}
