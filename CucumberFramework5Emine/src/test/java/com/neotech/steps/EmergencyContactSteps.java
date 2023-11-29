package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmergencyContactSteps extends CommonMethods {

	@When("user click More button")
	public void user_click_more_button() {
		waitForClickability(personelDetails.More).click();

	}

	@Then("click Emergency Contacts")
	public void click_emergency_contacts() {
		click(personelDetails.emergencyContact);
	}

	@Then("click pluss button")
	public void click_pluss_button() {
		waitForClickability(personelDetails.plussButtonn);
		click(personelDetails.plussButtonn);

	}

	@Then("add emergency  {string} and {string} and {string} and {string} and {string}  acontact details")
	public void add_emergency_and_and_and_and_acontact_details(String name, String relationship, String homePhone,
			String mobilePhone, String workPhone) {
		sendText(personelDetails.emergencyName, name);
		sendText(personelDetails.relationship, relationship);
		sendText(personelDetails.homePhone, homePhone);
		sendText(personelDetails.mobilePhone, mobilePhone);
		sendText(personelDetails.workPhone, workPhone);
		wait(2);

	}

	@Then("click  emergency save button")
	public void click_emergency_save_button() {
		click(personelDetails.emergencySavebutton);
		wait(2);
	}

}
