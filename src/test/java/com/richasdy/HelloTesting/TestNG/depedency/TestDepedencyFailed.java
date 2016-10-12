package com.richasdy.HelloTesting.TestNG.depedency;

import org.testng.annotations.Test;

public class TestDepedencyFailed {

	// If method1() is failed, method2() will be skipped.

	// This test will be failed.
	@Test
	public void method1() {
		System.out.println("This is method 1");
		throw new RuntimeException();
	}

	@Test(dependsOnMethods = { "method1" })
	public void method2() {
		System.out.println("This is method 2");
	}

}
