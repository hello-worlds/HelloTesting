package com.richasdy.HelloTesting.TestNG;

import org.testng.annotations.Test;

@Test(groups= "selenium-test")
public class TestGroupClass {
	
	public void runSelenium() {
		System.out.println("runSelenium()");
	}

	public void runSelenium1() {
		System.out.println("runSelenium()1");
	}

}
