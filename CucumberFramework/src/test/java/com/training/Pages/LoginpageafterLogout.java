package com.training.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.Base.BasePage;
import com.training.Base.BaseTest;

public class LoginpageafterLogout extends BasePage {
	
	static WebDriver driver;
	public LoginpageafterLogout() {
		super(driver=BaseTest.getDriver());
		addObject("UsernameafterLogout", By.id("idcard-identity"));
	}
}
