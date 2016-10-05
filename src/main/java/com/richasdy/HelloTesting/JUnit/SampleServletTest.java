package com.richasdy.HelloTesting.JUnit;

import org.apache.cactus.*;
import junit.framework.*;

public class SampleServletTest {
	@Test
	public void testServlet() {
		// Initialize class to test
		SampleServlet servlet = new SampleServlet();

		// Set a variable in session as the doSomething()
		// method that we are testing
		session.setAttribute("name", "value");

		// Call the method to test, passing an
		// HttpServletRequest object (for example)
		String result = servlet.doSomething(request);

		// Perform verification that test was successful
		assertEquals("something", result);
		assertEquals("otherValue", session.getAttribute("otherName"));
	}
}
