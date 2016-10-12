package com.richasdy.HelloTesting.TestNG.depedency;

import org.testng.annotations.Test;

public class TestDepedency {

	@Test
	public void method1() {
		System.out.println("This is method 1");
	}

	@Test(dependsOnMethods = { "method1" })
	public void method2() {
		System.out.println("This is method 2");
	}

}
