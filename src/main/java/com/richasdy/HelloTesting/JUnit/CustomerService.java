package com.richasdy.HelloTesting.JUnit;

public class CustomerService {
	
	public Customer findByName(String name) throws NameNotFoundException {

		Customer customer = new Customer();
		
		if ("".equals(name)) {
			throw new NameNotFoundException(666, "Name is empty!");
		}

		return customer;

	}
}
