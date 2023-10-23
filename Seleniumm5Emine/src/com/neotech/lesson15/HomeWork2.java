package com.neotech.lesson15;

import com.neotech.Pages.LoginPageUsingFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class HomeWork2  extends CommonMethods{
	
public static void main(String[] args) throws InterruptedException {
	
	setUp();
	
	LoginPageUsingFactory loginPage = new LoginPageUsingFactory ();
	
	sendText(loginPage.username, ConfigsReader.getProperty("username"));
	
	sendText(loginPage.password,ConfigsReader.getProperty("password"));
	
	//click(loginPage.loginBtn);
	
	jsClick(loginPage.loginBtn);
	
	wait(2);
	
	if( loginPage.message.isDisplayed()) {
		System.out.println("test is pass");
	}else {
		System.out.println("Test is not pass");
	}
	
	tearDown();
	
}
}
