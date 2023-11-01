package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {
	
	@FindBy (id= "first-name-box")
	public WebElement firstName;
	

	@FindBy (id= "last-name-box")
	public WebElement lastName;
	
	@FindBy(id="middle-name-box")
	public WebElement middleName;
	
	
	@FindBy (id="employeeId")
	public WebElement employeeID;
	
	
	@FindBy (id= "location")
	public WebElement Location;
	
	@FindBy(xpath ="//div[@class='custom-control custom-switch']")
	public WebElement createLoginDetaisl;

	
	@FindBy(id="username")
	public WebElement username;
	
	@FindBy (id="password")
	public WebElement password;
	
	@FindBy (id="confirmPassword")
	public WebElement comfirmPassword;
	
	@FindBy(id="modal-save-button")
	public WebElement clickSave;
	

	public AddEmployeePage () {
		PageFactory.initElements(driver, this);
	}
	
}
