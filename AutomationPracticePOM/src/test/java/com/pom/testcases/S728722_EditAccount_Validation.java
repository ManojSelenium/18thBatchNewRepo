package com.pom.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.util.TestBase;

public class S728722_EditAccount_Validation extends TestBase{

	
	@BeforeMethod
	public void launchBrowser() {
		
		intilizeDriver();
		enterURL("");
		
	}
	
	@Test
	public void editAccountTestCase() {
	
		
	}
	
	@Test
	public void editAcccountEmailAddressWarnigMessage() {
		
	}
}
