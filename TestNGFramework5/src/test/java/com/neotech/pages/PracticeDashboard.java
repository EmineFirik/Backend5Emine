package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class PracticeDashboard  extends CommonMethods{
	
	
	@FindBy (xpath="//span[text()='PIM']")
	public WebElement clickPim;
	
	
	@FindBy (xpath="//span[text()='Add Employee']")
	public WebElement clickAddEmployee;
	
	
	@FindBy (id ="first-name-box")
	public WebElement firstName;
	
	@FindBy (id= "last-name-box")
	public WebElement lastName;
	
	@FindBy ( id ="location")
	public WebElement Location;
	
	@FindBy (xpath= "//div[@class='custom-control custom-switch']")
	public WebElement clickCreate;
	
	@FindBy ( id ="username")
	public WebElement userName;
	
	@FindBy ( id ="password")
	public WebElement passWord;
	
	@FindBy ( id ="confirmPassword")
	public WebElement ComfirmpassWord;
	
	@FindBy ( id ="modal-save-button")
	public WebElement clickSave;
	
	@FindBy(id= "employeeId")
	public WebElement EmployeeID;

	public PracticeDashboard() {
		PageFactory.initElements(driver, this);
	}
	

}
