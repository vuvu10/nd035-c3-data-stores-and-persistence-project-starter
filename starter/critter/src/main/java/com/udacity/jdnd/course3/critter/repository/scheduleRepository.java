package com.udacity.jdnd.course3.critter.repository;

import com.udacity.jdnd.course3.critter.entity.schedule;
import com.udacity.jdnd.course3.critter.entity.Pet;
import com.udacity.jdnd.course3.critter.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, long>{
    List<Schedule> findAllPets(Pet pet);
    List<Schedule> findAllEmployees(Employee employee);
    List<Schedule> findAllPetsIn(List<Pet> pet);

}