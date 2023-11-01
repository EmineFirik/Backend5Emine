package com.neotech.steps;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.junit.Assert;

import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPage;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginOrangeHRM  extends CommonMethods{
	
	
	

	@When("I enter a valid username")
	public void i_enter_a_valid_username() {
		
	   sendText(login.username,ConfigsReader.getProperty("username"));
	}

	@When("I enter a valid password")
	public void i_enter_a_valid_password() {
		
	   sendText(login.password,ConfigsReader.getProperty("password")) ;
	}

	@When("I click login button")
	public void i_click_login_button() {
		
	    click(login.clickLogin);
	}

	@Then("I validate that I am logged in")
	public void i_validate_that_i_am_logged_in() {
		
		String expected = "Jacqueline White";
		String actual =dahsboard.accountName.getText();
		if (actual.equals(actual)) {
			System.out.println("Test is passed");
		}else {
			
		}System.out.println("Test is failed");
	}

	
	@When("I enter aninvalid password")
	public void i_enter_aninvalid_password() {
	   sendText(login.password, "neotech1234");
	}

	@Then("I validate Invalid Credential")
	public void i_validate_invalid_credential() {
	   
		String  expected = "Invalid Credential";
		String actual = login.invalidCredentials.getText();
		
	if( expected.equals(actual)) {
		System.out.println("Test is passed");
	}else {
		System.out.println("Test is failed");
	}
	}

@When("user enters login info {string} and {string}")
public void user_enters_login_info_and(String username, String password) {
   sendText(login.username,username );
   sendText(login.password, password);
   
   
}
@When("I click in the login button")
public void i_click_in_the_login_button() {
   click(login.clickLogin);
   
}
@Then("Welcome  {string} message is displayed")
public void welcome_message_is_displayed(String firstName) {
   System.out.println("Welcome "+ firstName + " is Displayed");
	
	
}
@When("user enters username and password and clicks on login")
public void user_enters_username_and_password_and_clicks_on_login(DataTable dataTable) {
   
	List<Map<String,String>> listOfMaps=dataTable.asMaps();
	
	for(Map<String,String>map:listOfMaps) 
	{
	System.out.println(map.get("username"));
	System.out.println(map.get("password"));
	
	sendText(login.username, map.get("username"));
	
	sendText(login.password,map.get("password"));
	click(login.clickLogin);
	wait(1);
	
	
	
	String actual = dahsboard.accountName.getText();
	Assert.assertEquals(map.get("firstName"),actual);
	
	click(dahsboard.accountMenu);
	click(dahsboard.logout);
	
	}
	
}

}












