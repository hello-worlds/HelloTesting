package com.richasdy.HelloTesting.TestNG.Selenium;

import org.testng.annotations.Test;
import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;

@Config(browser = Browser.CHROME, url = "http://seleniumhq.org")

public class TestSeleniumHQ {

	@Test
	public void testDownloadLinkExists() {

		validatePresent(HomePage.LOC_LNK_DOWNLOADSELENIUM);

	}

	@Test
	public void testTabsExist() {
		
		validatePresent(HomePage.LOC_LNK_PROJECTSTAB)
        .validatePresent(HomePage.LOC_LNK_DOWNLOADTAB)
        .validatePresent(HomePage.LOC_LNK_DOCUMENTATIONTAB)
        .validatePresent(HomePage.LOC_LNK_SUPPORTTAB)
        .validatePresent(HomePage.LOC_LNK_ABOUTTAB)

	}

}
