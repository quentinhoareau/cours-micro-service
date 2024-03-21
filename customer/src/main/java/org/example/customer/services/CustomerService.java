package org.example.customer.services;

import org.example.customer.dtos.CustomerDTO;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> findAll();
    CustomerDTO findById(Long id);
}
