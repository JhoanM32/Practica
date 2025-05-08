package com.example.classRoomAPI.services;


import com.example.classRoomAPI.models.Subject;
import com.example.classRoomAPI.repositories.ISubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    ISubjectRepository repository;


    //Metodo para guardar
    public Subject saveSubject(Subject dateSubject)throws Exception{
        try{

            return this.repository.save(dateSubject);

        }catch (Exception Error) {
            throw new Exception();
        }
    }
    //Metodo para buscarTodos
    public List<Subject>ListSubjecs()throws Exception{
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
