package com.udacity.jdnd.course3.critter.ServicesNew;


import com.udacity.jdnd.course3.critter.entities.Employee;
import com.udacity.jdnd.course3.critter.users.EmployeeSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.DayOfWeek;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> findEmployee(DayOfWeek day, Set<EmployeeSkill> skills) {
        List<Employee> Employees = employeeRepository.findAllByDaysAvailableContaining(day);
        List<Employee> res =
    }

}
