package com.udacity.jdnd.course3.critter.repositories;

import com.udacity.jdnd.course3.critter.entities.schedule;
import com.udacity.jdnd.course3.critter.entities.Pet;
import com.udacity.jdnd.course3.critter.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, long>{
    List<Schedule> findAllPets(Pet pet);
    List<Schedule> findAllEmployees(Employee employee);
    List<Schedule> findAllPetsIn(List<Pet> pet);

}