package com.example.classRoomAPI.services;

import com.example.classRoomAPI.models.Grade;
import com.example.classRoomAPI.repositories.IGradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {

    @Autowired
    IGradeRepository repository;


    //Metodo para guardar
    public Grade saveGrade(Grade dateGrade)throws Exception{
        try {

            return this.repository.save(dateGrade);

        }catch (Exception error){
            throw new Exception();
        }
    }

    //Metodo para buscarTodos
    public List<Grade>ListGrades()throws Exception{
        try {

            return this.repository.findAll();

        }catch (Exception Error){
            throw new Exception();
        }
    }


    //Metodo para buscarUnoPorId


    //Metodo para modificar


    //Metodo para eliminar


}
