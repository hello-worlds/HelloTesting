package com.richasdy.HelloTesting.JUnit;

import java.util.List;

public class Customer {
	
	private String name;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer findByName(String name) throws NameNotFoundException{
		Customer customer = new Customer("customer donni");
		return customer;
	}


}
