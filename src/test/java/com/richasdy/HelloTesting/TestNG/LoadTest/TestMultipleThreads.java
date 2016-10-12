package com.richasdy.HelloTesting.TestNG.LoadTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMultipleThreads {

	@Test(invocationCount = 1)
	public void loadTestThisWebsite() {

		// WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Page Title is " + driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();

	}

	// @Test(invocationCount = 100, threadPoolSize = 5)
	public void loadTest() {

		System.out.printf("%n[START] Thread Id : %s is started!", Thread.currentThread().getId());

		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("http://yourwebsite.com");

		// perform whatever actions, like login, submit form or navigation

		System.out.printf("%n[END] Thread Id : %s", Thread.currentThread().getId());

		driver.quit();

	}

}
