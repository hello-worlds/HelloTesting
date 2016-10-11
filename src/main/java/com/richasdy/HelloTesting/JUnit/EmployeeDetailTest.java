package com.richasdy.HelloTesting.JUnit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EmployeeDetailTest {
	EmployeeBusinessLogic empBusinessLogic = new EmployeeBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();

	// test to check appraisal
	@Test
	public void testCalculateAppriasal() {
		employee.setName("Rajeev");
		employee.setAge(25);
		employee.setMonthlySalary(8000);

		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		assertEquals(500, appraisal, 0.0);
	}

	// test to check yearly salary
	@Test
	public void testCalculateYearlySalary() {
		employee.setName("Rajeev");
		employee.setAge(25);
		employee.setMonthlySalary(8000);

		double salary = empBusinessLogic.calculateYearlySalary(employee);
		assertEquals(96000, salary, 0.0);
	}
}
