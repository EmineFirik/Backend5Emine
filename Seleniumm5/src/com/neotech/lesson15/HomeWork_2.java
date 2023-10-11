package com.neotech.lesson15;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;
import com.neotech.utils.CommonMethods;


public class HomeWork_2  extends CommonMethods{
	
	//HomeWork_2

	@FindBy(xpath="//input[@type='hidden']//following-sibling::div[1]/input")
	public WebElement username;
	

	@FindBy(xpath="//input[@type='hidden']//following-sibling::div[2]/input")
	public WebElement password;
	
	
	@FindBy(xpath="//div[@class='button-holder']//preceding-sibling::button")
	public WebElement login;
	
	
	public HomeWork_2  () {
		
		PageFactory.initElements(BaseClass.driver, this);
	}
		
	}
	
	
	

