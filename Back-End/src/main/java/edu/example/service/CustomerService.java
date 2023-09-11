package edu.example.service;

import edu.example.dao.CustomerEntity;
import edu.example.dto.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    public void saveCustomer(Customer customer);
}
