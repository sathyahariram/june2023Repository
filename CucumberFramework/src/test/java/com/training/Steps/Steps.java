package com.training.Steps;

import com.training.pagefactory.PageFactory;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.training.Base.BasePage;
import com.training.Base.BaseTest;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseTest {
		
	  PageFactory pagefactory=new PageFactory(); 
	  BasePage page;
	  @Before
	  public void setup() {
		  launchapplication();
	  }
	  
	  @Given("User is on the {string}")
	  public void user_is_on_the(String pageName) throws InstantiationException, IllegalAccessException {
	  	 page=pagefactory.initialize(pageName);
	     
	  }
	  
	  @When("User enter into TextBox {string} {string}")
	  public void user_enter_into_text_box(String Logicalname, String value) {
	  page.EnterintoTextBox(Logicalname, value);  }
	  
	  @Then("User Clicks on Button {string}")
	  public void user_clicks_on_button(String Logicalname) { 
		  page.ClickonButton(Logicalname);
	   }
	  @Then("User Clicks on CheckBox {string}")
	  public void user_clicks_on_check_box(String Logicalname) {
	      page.ClickonCheckBox(Logicalname);
	  }
	  
	  @Then("Validate Username {string} {string}")
	  public void validate_username(String string, String string2) {
	      page.Validate(string, string2);
	  }
	  @Then("User Switch Window {string}")
	  public void user_switch_window(String string) {
	      page.LoginpageafterLogout(string);
	  }
	  @AfterMethod
	  public void close() {
		 close();
	  }
	  
}
