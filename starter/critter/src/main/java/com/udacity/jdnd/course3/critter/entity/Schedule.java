package com.udacity.jdnd.course3.critter.entity

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity

public class Schedule {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDate date;

    @ManyToMany
    private List<Employee> employees;

    @ManyToMany
    private List<Pet> pets;

    @ElementCollection
    private Set<EmployeeSkill> activities;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public Set<EmployeeSkill> getActivities() {
        return activities;
    }

    public void setActivities(Set<EmployeeSkill> activities) {
        this.activities = activities;
    }

    public Schedule(long id, LocalDate date, List<Pet> pets, List<Employee> employees, Set<EmployeeSkill>activities ){
        this.id = id;
        this.date = date;
        this.pets = pets;
        this.employees = employees;
        this.activities = activities;
    }
}