package com.neotech.Test;

import com.neotech.Pages.DashboardPageUsingFactory;
import com.neotech.Pages.LoginPageUsingFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTestUsingFactory  extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		//// https://hrm.neotechacademy.com/
		
		setUp();
		
		
		LoginPageUsingFactory login =new LoginPageUsingFactory ();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		login.loginBtn.click();
		
		
		//validate loga after login
		
		DashboardPageUsingFactory dashboard = new DashboardPageUsingFactory ();
		
		if( dashboard.logo.isDisplayed()) {
			System.out.println("Test is pass");
		}else {
			System.out.println("Test is not pass");
		}
		
		String expectedName = "Jacqueline White";
		String actualName = dashboard.name.getText();
		
		
		if (expectedName.equals(actualName) ) {
			System.out.println("Test is pass.");
		}else {
			System.out.println("Test is not pass.");
		}
		wait(3);
		tearDown();
	}
	
	
}
