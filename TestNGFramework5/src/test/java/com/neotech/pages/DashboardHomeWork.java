package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class DashboardHomeWork extends CommonMethods {
	

	@FindBy (xpath="//span[text()='PIM']")
   public  WebElement PIM;
	
	
	@FindBy(xpath ="//span[text()='Add Employee']")
	public WebElement AddEmployee;
	
	@FindBy (id = "first-name-box")
	public WebElement FirstName;
	
	@FindBy(id ="last-name-box")
	public WebElement LastName;
	
	@FindBy(id="location")
	public WebElement location;
	
	@FindBy(xpath="//div[@class='custom-control custom-switch']")
	public WebElement createLoginDetails;
	
	@FindBy(id="username")
	public WebElement username;
	
	@FindBy(id= "password")
	public WebElement passWord;
	
	@FindBy (id = "confirmPassword")
	public WebElement confirmPassword;
	
	@FindBy ( id = "modal-save-button")
	public WebElement clickSave;
	
	@FindBy ( id = "employeeId")
	public WebElement employeId;
	
	public DashboardHomeWork () {
		PageFactory.initElements(driver, this);
	}
	

}
