package com.richasdy.HelloTesting.JUnit;
import junit.framework.*;

public class JunitTestSuite1 {
	public static void main(String[] a) {
		// add the test's in the suite
		TestSuite suite = new TestSuite(TestJunit1.class, TestJunit2.class, TestJunit3.class);
		TestResult result = new TestResult();
		suite.run(result);
		System.out.println("Number of test cases = " + result.runCount());
	}
}
