package com.richasdy.HelloTesting.JUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		// Result result = JUnitCore.runClasses(TestJunit.class);
		// Result result = JUnitCore.runClasses(TestJunit1.class);
		// Result result = JUnitCore.runClasses(TestJunit1Fail.class);
		// Result result = JUnitCore.runClasses(TestJunit2.class);
		// Result result = JUnitCore.runClasses(TestJunit3.class);
		// Result result = JUnitCore.runClasses(TestJunit4.class);
		// Result result = JUnitCore.runClasses(TestJunit5.class);
		// Result result = JUnitCore.runClasses(TestAssertions.class);
		// Result result = JUnitCore.runClasses(JunitAnnotation.class);
		// Result result = JUnitCore.runClasses(JunitTestSuite.class);
		Result result = JUnitCore.runClasses(TestJUnit6.class);

		System.out.println("number of test case : " + result.getRunCount());
		System.out.println("number of failure : " + result.getFailureCount());

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
	}
}