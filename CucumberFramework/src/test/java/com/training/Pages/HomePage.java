package com.training.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.Base.BasePage;
import com.training.Base.BaseTest;

public class HomePage extends BasePage {
		 
		static WebDriver driver;
	public HomePage() {
		super(driver=BaseTest.getDriver());
		addObject("Usermenu", By.id("userNavButton"));
		addObject("Logout", By.xpath("//a[@title='Logout']"));
		
		
		}
}
