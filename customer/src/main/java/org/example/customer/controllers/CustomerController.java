package org.example.customer.controllers;

import org.example.customer.dtos.CustomerDTO;
import org.example.customer.entities.Customer;
import org.example.customer.repositories.CustomerRepository;
import org.example.customer.services.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerRepository customerRepository;
    CustomerService customerService;

    public CustomerController(CustomerRepository customerRepository, CustomerService customerService) {
        this.customerRepository = customerRepository;
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<CustomerDTO> getCustomers() {
        return customerService.findAll();
    }

    @GetMapping("/customer/{id}")
    public CustomerDTO getCustomer(@PathVariable Long id) {
        return customerService.findById(id);
    }


}
