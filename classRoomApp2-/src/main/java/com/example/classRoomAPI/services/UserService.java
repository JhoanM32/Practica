package com.example.classRoomAPI.services;

import com.example.classRoomAPI.models.User;
import com.example.classRoomAPI.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepository repository;

    //Metodo para guardar
    public User saveUser(User dateUser)throws Exception{
        try {

            return this.repository.save(dateUser);

        }catch (Exception Error){
            throw new Exception();
        }
    }

    //Metodo para buscarTodos
    public List<User>ListUsers()throws Exception{
        try {

            return  this.repository.findAll();

        }catch (Exception Error){
            throw new Exception();
        }
    }


    //Metodo para buscarUnoPorId


    //Metodo para modificar


    //Metodo para eliminar
}
