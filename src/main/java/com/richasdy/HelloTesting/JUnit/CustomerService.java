package com.richasdy.HelloTesting.JUnit;

public class CustomerService {
	
	public Customer findByName(String name) throws NameNotFoundException {
		
		if ("".equals(name)) {
			throw new NameNotFoundException(666, "Name is empty!");
		}

		return new Customer();

	}
}
