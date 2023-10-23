package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class HomeWork2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		//HW1: Orange HRM Application Login: Open Chrome browser 
		// * Go to https://hrm.neotechacademy.com/ 
		// * Enter valid username and password 
		// * Click on login button 
		// * Then verify that "span with id account-name" has the text
		// * "Jacqueline White". 
		 //* Quit the browser
		 //*/
		
	setUp();
	
	String username=ConfigsReader.getProperty("username");
	String password=ConfigsReader.getProperty("password");
	
	System.out.println(username+" "+ password);
	
	WebElement usernameBox=driver.findElement(By.id("txtUsername"));
	usernameBox.sendKeys("Admin");;
	
	WebElement passwordBox=driver.findElement(By.id("txtPassword"));
	passwordBox.sendKeys("Neotech@123");
	
	WebElement loginB=driver.findElement(By.xpath("//button[@type='submit']"));
	loginB.click();
	
	String expected="Jacqueline White";
	String actual=driver.findElement(By.id("account-name")).getText();
	
	if( expected.equals(actual)) {
		System.out.println("Test is pass");
		
	}else {
		System.out.println("test is not pass");
	}
	tearDown();
	}
	
	
}
