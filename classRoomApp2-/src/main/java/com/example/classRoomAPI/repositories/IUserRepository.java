package com.example.classRoomAPI.repositories;


import com.example.classRoomAPI.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository  extends JpaRepository<User, Integer> {

}
