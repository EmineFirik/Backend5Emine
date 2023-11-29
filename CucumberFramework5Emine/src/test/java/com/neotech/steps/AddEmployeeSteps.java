package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddEmployeeSteps extends CommonMethods {

	@Given("click Pim and Employee")
	public void click_pim_and_employee() {
		click(dahsboard.PIM);
		click(dahsboard.AddEmployee);
		wait(1);

	}

	@Then("enter username ans password")
	public void enter_username_ans_password() {
		sendText(addEmployee.firstName, "Test");
		sendText(addEmployee.lastName, "Tester");
		wait(1);
	}

	@Then("select location")
	public void select_location() {

		selectDropdown(addEmployee.Location, "Australian Regional HQ");
		wait(1);
	}

	@Then("click save")
	public void click_save() {
		click(addEmployee.clickSave);
		wait(1);
	}

	@Then("delete ID")
	public void delete_id() {

		sendText(addEmployee.employeeID, "1000");

		addEmployee.employeeID.clear();
		wait(1);

	}

	@Then("add create username and password")
	public void add_create_username_and_password() {
		sendText(addEmployee.username, "test1234$!");
		sendText(addEmployee.password, "tester1234$!");
		sendText(addEmployee.comfirmPassword, "tester1234$!");
		wait(1);
	}

	@Then("create login credentials")
	public void create_login_credentials() {
		click(addEmployee.createLoginDetaisl);
	}
	
	@Given("user is navigate personel detail")
	public void user_is_navigate_personel_detail() {
		click(personelDetails.employeName);
		
		
	}

	

	@Then("verify the personel name")
	public void verify_the_personel_name() {
	  String expected ="Test Tester";
	  String actual = personelDetails.employeName.getText();
	  
	  if( actual.equals(expected)) {
		  System.out.println("Test is pass");
	  }else {
		  System.out.println("Test is fail");
	  }
	}



}
