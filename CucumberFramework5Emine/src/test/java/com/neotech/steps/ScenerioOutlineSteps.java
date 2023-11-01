package com.neotech.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenerioOutlineSteps {

	
	@When("Login with {string} and {string}")
	public void login_with_and(String username, String password) {
	    System.out.println("Login with "+ username +" and "+ password );
	}

	@When("Click on the loggin button")
	public void click_on_the_loggin_button() {
	    System.out.println("Click on the login button");
	}

	@Then("validate that {string} is displayed")
	public void validate_that_is_displayed(String username) {
	   System.out.println("Validate "+ username + " is showing");
	}

	@Then("We want to say Bye {string}")
	public void we_want_to_say_bye(String fullname) {
	    System.out.println("By full name "+ fullname);
	}



}
