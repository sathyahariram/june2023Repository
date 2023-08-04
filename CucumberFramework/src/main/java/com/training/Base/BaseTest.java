package com.training.Base;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.training.Utilities.CommonUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
 
	static WebDriver driver;
	static CommonUtilities Common=new CommonUtilities();
	static String url;
	public static void launchapplication() {
		
		 driver=getDriver();
		 try {
			url= Common.getproperty("url");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.get(url);
	}
	public static WebDriver getDriver() {
			if(driver==null) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			}
			return driver;
	}
	
}
