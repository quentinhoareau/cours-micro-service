package org.example.customer.services.impl;

import org.example.customer.dtos.CustomerDTO;
import org.example.customer.entities.Customer;
import org.example.customer.mappers.CustomerMapper;
import org.example.customer.repositories.CustomerRepository;
import org.example.customer.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public List<CustomerDTO> findAll() {
        return customerRepository
                .findAll()
                .stream()
                .map(customerMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDTO findById(Long id) {
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer != null)
            return customerMapper.toDTO(customer);
        return null;
    }


}
