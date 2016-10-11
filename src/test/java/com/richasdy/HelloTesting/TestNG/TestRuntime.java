package com.richasdy.HelloTesting.TestNG;

import org.testng.annotations.Test;

public class TestRuntime {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void divisionWithException() {
		int i = 1 / 0;
	}
	
}
