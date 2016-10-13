package com.richasdy.HelloTesting.TestNG.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFirstCase {

	@Test
	public void testSelenium() {
		
		// Set webDriver path
		String webDriverPath = "src/test/resources/chromedriver";
		System.setProperty("webdriver.chrome.driver", webDriverPath);
		
		// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();

		// Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");

		// Print a Log In message to the screen
		System.out.println("Successfully opened the website www.Store.Demoqa.com");
		
		// Close the driver
		driver.quit();

	}

}
