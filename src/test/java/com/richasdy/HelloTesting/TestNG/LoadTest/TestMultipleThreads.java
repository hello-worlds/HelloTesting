package com.richasdy.HelloTesting.TestNG.LoadTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMultipleThreads {

	@Test(invocationCount = 2)
	public void loadTestThisWebsite() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Page Title is " + driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();

	}

	@Test(invocationCount = 4, threadPoolSize = 2)
	public void loadTest() {

		System.out.println("%n[START] Thread Id : %s is started!" + Thread.currentThread().getId());

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumhq.org/");

		// perform whatever actions, like login, submit form or navigation

		System.out.println("%n[END] Thread Id : %s" + Thread.currentThread().getId());

		driver.quit();

	}

}
