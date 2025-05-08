package com.example.classRoomAPI.services;

import com.example.classRoomAPI.helpers.MessagesApi;
import com.example.classRoomAPI.models.Teacher;
import com.example.classRoomAPI.repositories.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    ITeacherRepository repository;

    //Metodo para guardar
    public Teacher saveTeacher(Teacher dateTeacher)throws Exception{
        try {

            return this.repository.save(dateTeacher);

        }catch (Exception Error){
            throw new Exception();
        }
    }
    //Metodo para buscarTodos
    public List<Teacher>ListTeachers()throws Exception{
        try{

            return this.repository.findAll();

        }catch (Exception Error){
            throw new Exception();
        }
    }


    //Metodo para buscarUnoPorId
    public Teacher buscarDocentePorId (Integer id)throws Exception{
        try {
            Optional<Teacher> teacherQueEstoyBuscando=  this.repository.findById(id);
            if (teacherQueEstoyBuscando.isPresent()){
                return teacherQueEstoyBuscando.get();
            }else {
                throw new Exception(MessagesApi.ERROR_TEACHER_NO_ENCONTRADO.getMenssages());
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //Metodo para modificar
    public Teacher modificarTeacher(Integer id, Teacher datosNuevosTeacher)throws Exception{
        try {
            Optional<Teacher>teacherQueEstoyBuscandoParaEditar=this.repository.findById(id);
            if (teacherQueEstoyBuscandoParaEditar.isPresent()){
                //Modifico ese docente
                teacherQueEstoyBuscandoParaEditar.get().setSpecialty(datosNuevosTeacher.getSpecialty());
                //guardo las modificaciones en BD
                return this.repository.save(teacherQueEstoyBuscandoParaEditar.get());
            }else {
                throw new Exception(MessagesApi.ERROR_TEACHER_NO_ENCONTRADO.getMenssages());
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }


    //Metodo para eliminar
}
