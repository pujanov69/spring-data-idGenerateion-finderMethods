package com.dci.springdata.customerdata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dci.springdata.customerdata.entities.Customer;
import com.dci.springdata.customerdata.repository.CustomerRepository;

@SpringBootTest
class CustomerdataApplicationTests {

	@Autowired
	private CustomerRepository repository;

	
	@Test
	void createCustomer() {
		Customer newCustomer= new Customer();
		newCustomer.setEmail("test@test.com");
		newCustomer.setId(1);
		newCustomer.setName("test");
		repository.save(newCustomer);
		assertTrue(repository.existsById(1));
	}
	
	
	@Test
	public void readCustomer() {
		Optional<Customer> customer = repository.findById(1);
		System.out.println(customer);
	}
	
	@Test
	void updateCustomer() {
		if(repository.existsById(1)) {
			Customer customer= repository.findById(1).get();
			customer.setEmail("myemail@test.com");
			repository.save(customer);
			assertEquals("myemail@test.com", repository.findById(1).get().getEmail());
		}
	}
	
	@Test
	void deleteCustomer() {
		if(repository.existsById(1)) {
			Customer customer= repository.findById(1).get();
			repository.delete(customer);
			assertTrue(!repository.existsById(1));
		}
	}
	

}
