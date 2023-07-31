package com.training.base;

import org.openqa.selenium.WebDriver;
import com.training.utilities.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver=null;
	
	CommonUtilities common=new CommonUtilities();
	
	public WebDriver getDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver; 
	}
	
	public void Closebrowser(WebDriver driver) {
		driver.close();
	}
	public String getvalue(String key) {
		String value=common.getproperty(key);
		return value;
	}
}
