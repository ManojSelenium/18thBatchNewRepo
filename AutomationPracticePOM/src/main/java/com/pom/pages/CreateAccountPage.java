package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pom.util.WebDriverUtils;

public class CreateAccountPage extends WebDriverUtils{

	WebDriver driver;
	
	
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	public void enterFirstName() {
	
		enterText(By.id("customer_firstname"), "Manoj");
	}

	public void enterLastName() {
		
		enterText(By.id("customer_lastname"), "Manoj");
	}

	public void enterPassword() {
		
		enterText(By.id("passwd"), "Password@123");
	}

	public void enterCity() {

	}

	public void enterPhoneNumber() {

	}
	
	public void enterZipCode() {

	}
	
	public void selectState() {

	}
	
	public void clickRegisterButton() {
		
	}
}
