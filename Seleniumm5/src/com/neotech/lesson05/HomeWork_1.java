package com.neotech.lesson05;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class HomeWork_1 extends BaseClass{
	//HW1: Orange HRM Application Login:
	//Open Chrome browser
	//Go to https://hrm.neotechacademy.com/
	//Enter valid username and password
	//Click on login button
	//Then verify that "span with id account-name" has the text "Jacqueline White".
	//Quit the browser
	
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		String NameDisplay=driver.findElement(By.xpath("//span[text()='Jacqueline White']")).getText();
		System.out.println(NameDisplay);
		
		if( NameDisplay.equals("Jacqueline White")) {
			System.out.println("Test is pass.");
		}else {
			System.out.println("Test is not pass.");
		}
		
		Thread.sleep(3000);
		driver.quit();
		
		tearDown();
		
	}

}
