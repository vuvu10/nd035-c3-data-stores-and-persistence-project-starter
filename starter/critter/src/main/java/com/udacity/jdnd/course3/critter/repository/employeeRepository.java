package com.udacity.jdnd.course3.critter.repository;

import com.udacity.jdnd.course3.critter.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface employeeRepository extends JpaRepository<Employee, Long>{
    List<Employee>();
}