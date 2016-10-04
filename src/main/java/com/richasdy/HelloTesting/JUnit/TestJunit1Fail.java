package com.richasdy.HelloTesting.JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestJunit1Fail {

	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		message = "Donni";
		System.out.println("Inside testPrintMessage()");
		assertEquals(message, messageUtil.printMessage());
		// harusnya pakai assert false
		// assertFalse(message, condition);
		// assertFalse(message, messageUtil.printMessage());

	}
}