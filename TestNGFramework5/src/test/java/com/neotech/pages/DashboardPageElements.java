package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods{
	
	
	@FindBy (id="account-name")
   public  WebElement accountName;
	
	
	@FindBy(xpath ="//div[@class='toast-message']")
	public WebElement invalidText;
	
	public DashboardPageElements() {
		PageFactory.initElements(driver, this);
	}
	
	
}
