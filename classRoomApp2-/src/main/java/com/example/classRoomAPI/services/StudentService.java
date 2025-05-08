package com.example.classRoomAPI.services;
import com.example.classRoomAPI.models.Student;
import com.example.classRoomAPI.repositories.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepository repository;

    //Metodo para guardar
    public Student saveStudent(Student dateStudent)throws Exception{
        try{

            return this.repository.save(dateStudent);

        }catch (Exception error){
            throw new Exception();
        }
    }

    //Metodo para buscarTodos
    public List<Student>ListStudents()throws Exception{
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
