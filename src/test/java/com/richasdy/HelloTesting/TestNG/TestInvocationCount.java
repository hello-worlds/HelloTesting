package com.richasdy.HelloTesting.TestNG;

import org.testng.annotations.Test;

public class TestInvocationCount {

	@Test(invocationCount = 10)
	public void repeatThis() {
		// ...
	}

	@Test(invocationCount = 10, threadPoolSize = 3)
	public void testThreadPools() {

		System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());

	}

}