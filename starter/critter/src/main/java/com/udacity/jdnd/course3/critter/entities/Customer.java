package com.udacity.jdnd.course3.critter.entities;

import java.util.List;
import javax.persistence.*;


@Entity
//@Table(name = "CUSTOMER")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //@Nationalized
    private String name;

    //@Column(name="phone_number", length=10)
    private String phoneNumber;

    private String notes;

    @OneToMany(mappedBy = "Customer", cascade = CascadeType.ALL)


    private List<Pet> pets;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }
}