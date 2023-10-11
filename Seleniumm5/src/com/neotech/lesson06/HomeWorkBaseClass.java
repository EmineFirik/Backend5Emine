package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class HomeWorkBaseClass  extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		
		
		//Orange HM Application Negative Login:
		//* Open Chrome browser
		//* Go to https://hrm.neotechacademy.com/
		//* Enter valid username
		//* Leave password field empty
		//* Verify error message with text "Password cannot be empty"
		//* is displayed.
		setUp();
		
		String username=ConfigsReader.getProperty("username");
		String password="";
		
		driver.findElement(By.id("txtUsername")).sendKeys("username");
		driver.findElement(By.id("txtPassword")).sendKeys("");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(2000);
		
		WebElement message=driver.findElement(By.id("txtPassword-error"));
		message.click();
		
		
		if( message.isDisplayed()) {
			System.out.println("Error message is displayed ");
		}else {
			System.out.println("Error message is not displayed.");
		}
		Thread.sleep(2000);
		tearDown();
	}
	
	
	
	
	
	
}
