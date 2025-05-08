package com.example.classRoomAPI.repositories;


import com.example.classRoomAPI.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubjectRepository extends JpaRepository<Subject, Integer> {


}