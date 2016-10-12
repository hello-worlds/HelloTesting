package com.richasdy.HelloTesting.JUnit;

import org.junit.Test;

import com.richasdy.HelloTesting.JUnit.model.MessageUtil;

import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestJunit1 {

	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		assertEquals(message, messageUtil.printMessage());
	}
}