package com.richasdy.HelloTesting.TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.richasdy.HelloTesting.TestNG.Order;
import com.richasdy.HelloTesting.TestNG.OrderBo;
import com.richasdy.HelloTesting.TestNG.OrderSaveException;

public class TestCheckedException {

	OrderBo orderBo;
	Order data;

	@BeforeTest
	void setup() {
		orderBo = new OrderBo();

		data = new Order();
		data.setId(1);
		data.setCreatedBy("richasdy");
	}

	@Test(expectedExceptions = OrderSaveException.class)
	public void throwIfOrderIsNull() throws OrderSaveException {
		orderBo.save(null);
	}

	/*
	 * Example : Multiple expected exceptions
	 * Test is success if either of the exception is throws
	 */
	@Test(expectedExceptions = { OrderUpdateException.class, OrderNotFoundException.class })
	public void throwIfOrderIsNotExists() throws OrderUpdateException, OrderNotFoundException {
		orderBo.update(data);
	}
	
}