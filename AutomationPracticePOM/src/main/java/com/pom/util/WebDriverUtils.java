package com.pom.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {

	WebDriver driver;

	public static int WAITTIME=200;
	
	public WebDriverUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void click(By prop) {	
		new WebDriverWait(driver, WAITTIME).until(ExpectedConditions.visibilityOfElementLocated(prop));
		driver.findElement(prop).click();
	}

	public void enterText(By prop,String testData) {
		new WebDriverWait(driver, WAITTIME).until(ExpectedConditions.visibilityOfElementLocated(prop));
		driver.findElement(prop).clear();
		driver.findElement(prop).sendKeys(testData);
	}

	public String getText(By prop) {
		return driver.findElement(prop).getText();
	}


	public String getAttribute(By prop,String key) {
		return driver.findElement(prop).getAttribute(key);
	}

	public boolean isElementPresent(By prop) {
		return driver.findElement(prop).isDisplayed();
	}


	public int isElementPresentWithoutException(By prop) {

		return driver.findElements(prop).size();
	}

	public void doMouseHover(By prop) {
		Actions builder=new Actions(driver);
		builder.moveToElement(driver.findElement(prop)).build().perform();
	}

	public void closeBrowser() {
		driver.quit();
	}

	public void selectValueFromDropDown(By prop,String value) {
		new Select(driver.findElement(prop)).selectByValue(value);
	}

	public void selectValueFromDropDown(By prop,int index) {
		new Select(driver.findElement(prop)).selectByIndex(index);
	}
}


