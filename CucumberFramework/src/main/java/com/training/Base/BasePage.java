package com.training.Base;

import java.util.HashMap;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
	WebDriver driver;
	
	public HashMap<String,By> ObjectRepo=new HashMap<String, By>();
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}

	public void addObject(String logicalName, By by) {
		ObjectRepo.put(logicalName, by);
	}
	
	private WebElement getElement(String logicalName) {
		
		By by=ObjectRepo.get(logicalName);
		WebElement element=driver.findElement(by);
		return element;
	}
	
	public void EnterintoTextBox(String logicalName, String value) {
		
		WebElement element= getElement(logicalName);
		element.sendKeys(value);
	}
	
	public void ClickonButton(String logicalName) {
		
		WebElement element= getElement(logicalName);
		waitForElement(element);
		element.click();
	}

	private void waitForElement(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

	public void ClickonCheckBox(String logicalName) {
		WebElement element= getElement(logicalName);
		waitForElement(element);
		element.click();
	}

	public void Validate(String logicalName, String value) {
		WebElement element= getElement(logicalName);
		waitForElement(element);
		String expected=element.getText();
		String Actual=value;
		Assert.assertEquals(Actual,expected);
		
	}

	public void LoginpageafterLogout(String logicalName) {
		driver.navigate().to("https://tekarch-d-dev-ed.develop.my.salesforce.com");
		
	}
	
}
