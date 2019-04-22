package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pom.objrepo.SigninPageProperties;
import com.pom.util.WebDriverUtils;

public class SigninPage extends WebDriverUtils implements  SigninPageProperties{

	
	WebDriver driver;
	
	public SigninPage(WebDriver driver){
		super(driver);
		this.driver=driver;
	}
	
	public CreateAccountPage clickCreateAccountButton() {
		click(CREATEACCOUNT_LOCATOR);
		return new CreateAccountPage(driver);
	}
	
	public void enterEmailAddress() {
		enterText(EMAILADDRESS_LOCATOR, "selenium87678@mailinator.com");
	}
}
