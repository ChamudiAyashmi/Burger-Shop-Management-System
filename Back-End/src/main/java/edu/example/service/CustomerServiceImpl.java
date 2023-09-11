package edu.example.service;

import edu.example.dao.CustomerEntity;
import edu.example.dto.Customer;
import edu.example.repository.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public void saveCustomer(Customer customer) {
        CustomerEntity map = modelMapper.map(customer, CustomerEntity.class);
        customerRepository.save(map);
    }
}
