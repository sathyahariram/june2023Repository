package com.training.Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Automation Files\\Tekarch_Files\\Tekarch\\CucumberFramework\\features\\Salesforce.feature",
	
	glue= {"com.training.Steps"}, plugin= {"pretty", "html:target/cucumber-reports/cucumber.html",
										"json:target/cucumber-reports/cucumber.json"})

public class Runner {
	

}
