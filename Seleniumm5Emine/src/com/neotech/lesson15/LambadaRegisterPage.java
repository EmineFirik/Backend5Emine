package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;
import com.neotech.utils.CommonMethods;

public class LambadaRegisterPage  extends CommonMethods{

	
	

	
	
	@FindBy (xpath = "//form[@class='form reg-custom']/div[2]/div/input")
	public WebElement passwordBox;
	
	@FindBy(xpath = "//input[@id='userpassword']/following-sibling::div/span")
	public WebElement showBtn;
	
	
	@FindBy(xpath = "//input[@id='userpassword']/../../preceding-sibling::div/input")
	public WebElement businesEmail;
	
	
	
	
	public LambadaRegisterPage () {
		
		PageFactory.initElements(BaseClass.driver, this);
	}
}
