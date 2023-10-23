package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class LoginHomeWork  extends CommonMethods{

	@FindBy(id="txtUsername" )
	public WebElement username;
	
	@FindBy (id = "txtPassword")
	public WebElement password;
	
	@FindBy ( xpath ="//button[@type='submit']")
	public WebElement clickLogin;
	
	
	public LoginHomeWork() {
		PageFactory.initElements(driver, this);
	}
	
}
