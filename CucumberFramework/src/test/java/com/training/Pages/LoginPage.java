package com.training.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.Base.BasePage;
import com.training.Base.BaseTest;

public class LoginPage extends BasePage{
	
	static WebDriver driver;
	
	public LoginPage(){
		super(driver=BaseTest.getDriver());
		addObject("Username", By.id("username"));
		addObject("Password", By.id("password"));
		addObject("Rememberme", By.id("rememberUn"));
		addObject("Login", By.id("Login"));
		addObject("ForgotPassword", By.id("forgot_password_link"));
		addObject("Continue", By.id("continue"));
		addObject("ErrorMessage", By.id("error"));
		
		
	}
}
