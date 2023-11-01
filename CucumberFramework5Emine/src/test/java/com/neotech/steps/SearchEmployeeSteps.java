package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchEmployeeSteps extends CommonMethods {

	
	@Given("user is logged in with valid credentials")
	public void user_is_logged_in_with_valid_credentials() {
	  login.adminLogin();
	}

	@Given("user navigates to employee list page")
	public void user_navigates_to_employee_list_page() {
	   click(dahsboard.PIM);
	   click(dahsboard.EmployeeList);
	  
	   
	}

	@When("user enters valid employee id")
	public void user_enters_valid_employee_id() {
		sendText(employeList.searchBox, "Brody Alan");
		
		
	    
	}

	@When("clicks on search button")
	public void clicks_on_search_button() {
		
		click(employeList.searchIcon);
	    
	}

	@Then("employee information is displayed")
	public void employee_information_is_displayed() {
		
		System.out.println("Yes I see it");
	    
	}

	@When("user enters valid employee first and last name")
	public void user_enters_valid_employee_first_and_last_name() {
	    
		sendText(employeList.searchBox,"0032");
		
		wait(5);
	}



	
}
