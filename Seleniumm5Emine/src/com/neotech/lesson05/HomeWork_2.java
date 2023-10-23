package com.neotech.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class HomeWork_2 extends BaseClass {
	
//HW2: Orange HRM Application Negative Login: 
	//Open Chrome browser
	//Go to https://hrm.neotechacademy.com/
	//Enter valid username
	//Leave password field empty
	//Verify error message with text "Password cannot be empty" is displayed.
	
	public static void main(String[] args) throws InterruptedException {

		setUp();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(ConfigsReader.getProperty("username"));
		//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(ConfigsReader.getProperty(""));
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		String messege=driver.findElement(By.xpath("//span[@id='txtPassword-error']")).getText();
		
		System.out.println(messege);
		if( messege.equals("Password cannot be empty")) {
			System.out.println("Test is pass.");
		}else {
			System.out.println("Test is not pass.");
		}
		
		
		Thread.sleep(3000);
		tearDown();
	}
	
	
	

}
