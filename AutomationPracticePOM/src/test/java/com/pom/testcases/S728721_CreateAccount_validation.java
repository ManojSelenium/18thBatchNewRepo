package com.pom.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.pages.CreateAccountPage;
import com.pom.pages.LandingPage;
import com.pom.pages.MyAccountPage;
import com.pom.pages.SigninPage;
import com.pom.util.TestBase;

public class S728721_CreateAccount_validation extends TestBase {


	LandingPage landingPage;

	@BeforeMethod
	public void launchBrowser() {
		intilizeDriver();
		//Entering URL 
		landingPage=enterURL(AUTOMATION_PRACTICE_URL);
		/*
		  landingPage=new LandingPage(driver);
		  page=new SigninPage(driver);
		  accountPage=new CreateAccountPage(driver);*/
	}

	@Test
	public void createAccountTestCase() {
		
		SigninPage signinPage=landingPage.clickSignin();
		signinPage.enterEmailAddress();
		CreateAccountPage accountPage=signinPage.clickCreateAccountButton();
		accountPage.enterFirstName();
		accountPage.enterLastName();
		accountPage.enterPassword();
		accountPage.enterPhoneNumber();
		accountPage.selectState();
		accountPage.enterZipCode();
		accountPage.clickRegisterButton();

		MyAccountPage myAccountPage=new MyAccountPage();
		myAccountPage.verifyWelcomeMessageText();

	}

	//@Test
	public void duplicateEmailAddressWarnigMessage() {

	}


}
