package com.example.classRoomAPI.repositories;

import com.example.classRoomAPI.models.Tuition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITuitionRepository extends JpaRepository<Tuition, Integer> {


}
