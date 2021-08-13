package com.udacity.jdnd.course3.critter.ServicesNew;

import com.udacity.jdnd.course3.critter.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer findByPet(Pet pet) {
        return customerRepository.findByPetsContaining(pet);
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer findById(Long id) {
        return customerRepository.findById(id).get();
    }
}
