package com.pom.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.pages.LandingPage;

public class TestBase implements Setup{

	WebDriver driver=null;
	
	public WebDriver intilizeDriver() {
		System.setProperty(CHROME_KEY, CHROME_PATH);
		 driver=new ChromeDriver();
		 System.out.println("Driver From TestBase :::: "+driver);
		 return driver;
	}
	
	
	public LandingPage enterURL(String url) {
		driver.get(url);
		LandingPage landingPage=new LandingPage(driver);
		return landingPage;
		
	}
}
