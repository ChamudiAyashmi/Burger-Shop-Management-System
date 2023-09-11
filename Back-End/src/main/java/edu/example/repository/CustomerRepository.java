package edu.example.repository;

import edu.example.dao.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity,Long> {

}
