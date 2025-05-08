package com.example.classRoomAPI.services;

import com.example.classRoomAPI.models.Tuition;
import com.example.classRoomAPI.repositories.ITuitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TuitionService {

    @Autowired
    ITuitionRepository repository;

    //Metodo para guardar
    public Tuition saveTuition(Tuition dateTuition)throws Exception{
        try{

            return this.repository.save(dateTuition);

        }catch (Exception Error){
            throw new Exception();
        }
    }

    //Metodo para buscarTodos
    public List<Tuition>ListTuitions()throws Exception{
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
