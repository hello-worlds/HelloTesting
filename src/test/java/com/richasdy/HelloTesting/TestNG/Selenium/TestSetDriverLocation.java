package com.richasdy.HelloTesting.TestNG.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSetDriverLocation {

	@Test
	public void testSelenium() {
		
		// Set webDriver path
		// mirip dengan load opencv --> loadLibrary()
		String webDriverPath = "src/test/resources/chromedriver";
		System.setProperty("webdriver.chrome.driver", webDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	}


}
