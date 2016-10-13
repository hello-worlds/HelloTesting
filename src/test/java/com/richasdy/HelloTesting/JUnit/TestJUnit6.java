package com.richasdy.HelloTesting.JUnit;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

// @Ignore
public class TestJUnit6 {
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);

	@Ignore
	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		message = "Robert";
		assertEquals(message, messageUtil.printMessage());
	}

	@Test(timeout=1) // in milisecond
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}
	
	@Ignore
	@Test(timeout=1000, expected = ArithmeticException.class) // in milisecond
	public void testAnotherSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}
}
