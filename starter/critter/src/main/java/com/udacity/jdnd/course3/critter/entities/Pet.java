package com.udacity.jdnd.course3.critter.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.FetchType;

@Entity
@Table(name = "Pet")

public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Pet_ID", unique = true)
    private Long petId;

    @Enumerated(EnumType.STRING)
    @Column(name = "Pet_TYPE")
    private PetType type;

    @Nationalized
    @Column(name = "Pet_NAME")
    private String name;

    @ManyToOne(Cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "Customer_ID")
    private Customer customer;

    @Column(name = "Pet_NOTES")
    private String notes;

    public Pet() {

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Pet(Long id, PetType type, String name, Customer customer, LocalDate birthDate, String notes) {
        this.petId = id;
        this.type = type;
        this.name = name;
        this.customer = customer;
        this.birthDate = birthDate;
        this.notes = notes;
    }

    public Long getPetId() {
        return petId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }

    public PetType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}

