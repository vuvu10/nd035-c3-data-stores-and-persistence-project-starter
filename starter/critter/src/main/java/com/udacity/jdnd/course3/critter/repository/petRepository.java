package com.udacity.jdnd.course3.critter.repository;

import com.udacity.jdnd.course3.critter.pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface petRepository extends JpaRepository<Pet, Long>{
    List<Pet>(Long );
}