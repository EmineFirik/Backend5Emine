package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class PersonalDetailPageElement extends CommonMethods {

	@FindBy(id="pimPersonalDetailsForm")
	public WebElement personalDetail;
	
	@FindBy(id="pim.navbar.employeeName")
	public WebElement fullNameTitle;
	//pim.navbar.employeeName
	
	@FindBy( id = "personalDetailPageElement")
	public WebElement employeeID;
	
	
	@FindBy (id= "firstName")
	public WebElement  firstName;

	public PersonalDetailPageElement() {
		PageFactory.initElements(driver, this);
	}
	
}
