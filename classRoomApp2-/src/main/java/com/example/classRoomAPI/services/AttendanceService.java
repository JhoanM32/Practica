package com.example.classRoomAPI.services;

import com.example.classRoomAPI.models.Attendance;
import com.example.classRoomAPI.repositories.IAttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceService {

    @Autowired
    IAttendanceRepository repository;


    //Metodo para guardar
    public Attendance saveAttendance(Attendance dateAttendance) throws Exception{
        try {

            return this.repository.save(dateAttendance);

        }catch (Exception error){
            throw new Exception();

        }
    }


    //Metodo para buscarTodos
    public List<Attendance>ListAttendances()throws Exception{
        try{

            return this.repository.findAll();

        }catch (Exception Error){
            throw new Exception();
        }
    }


    //Metodo para buscarUnoPorId


    //Metodo para modificar


    //Metodo para eliminar



}
