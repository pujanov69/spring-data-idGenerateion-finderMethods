package com.dci.springdata.customerdata.repository;

import org.springframework.data.repository.CrudRepository;
import com.dci.springdata.customerdata.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
