package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.objrepo.LandingPageProperties;
import com.pom.util.WebDriverUtils;

public class LandingPage extends WebDriverUtils implements LandingPageProperties{


	WebDriver driver; //It holds null value

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver; //Parameter driver value setting in class level driver
	}

	public SigninPage clickSignin() {

		click(SIGNIN_LOCATOR);
		return new SigninPage(driver);
	}

	public void clickContactUs() {
		click(By.xpath("//a[@class='login']"));
		
		
	}
}
