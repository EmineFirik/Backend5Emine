package com.neotech.lesson15;

import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class HomeWork_1Test extends CommonMethods {
	
	// Homework 1: OrangeHRM Login
	// Navigate to https://hrm.neotechacademy.com/
	// Login to the application by writing xpath based on "parent and child
	// relation"

	public static void main(String[] args) throws InterruptedException {

		setUp();

		HomeWork_1 login = new HomeWork_1 ();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		//click(login.login);
		waitForVisibility(login.login);
		
		
		tearDown();

	}

}
