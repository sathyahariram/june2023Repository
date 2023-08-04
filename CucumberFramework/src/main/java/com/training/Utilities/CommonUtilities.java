package com.training.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities {

	public String getproperty(String key) throws IOException {
		String path="C:\\Automation Files\\Tekarch_Files\\Tekarch\\CucumberFramework\\properties\\application.properties";
		FileInputStream fileinput=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fileinput);
		String value=prop.getProperty(key);
		return value;
	}

}
