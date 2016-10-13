package com.richasdy.HelloTesting.JUnit;

import junit.framework.TestCase;
import net.sourceforge.jwebunit.WebTester;

public class TestWebCase {
	private WebTester tester;

	public ExampleWebTestCase(String name) {
	      super(name);
	      tester = new WebTester();
	   }

	// set base url
	public void setUp() throws Exception {
		getTestContext().setBaseUrl("http://myserver:8080/myapp");
	}

	// test base info
	@Test
	public void testInfoPage() {
		beginAt("/info.html");
	}
}
