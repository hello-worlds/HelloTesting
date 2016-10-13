package com.richasdy.HelloTesting.JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

import com.richasdy.HelloTesting.JUnit.Model.MessageUtil;

public class TestJunit1Fail {

	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		message = "Donni";
		System.out.println("Inside testPrintMessage()");

		// show the detail error
		assertEquals(message, messageUtil.printMessage());

		// just show the boolean error
		// assertTrue(message.equals(messageUtil.printMessage()));
		// assertFalse(message.equals(messageUtil.printMessage()));

	}
}