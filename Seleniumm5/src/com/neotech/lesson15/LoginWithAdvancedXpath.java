package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginWithAdvancedXpath extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		//url=https://hrm.neotechacademy.com/
		
		setUp();
		
		
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		
		sendText(username, ConfigsReader.getProperty("username"));
		
		

		WebElement password = driver.findElement(By.xpath("(//input[@id='txtPassword'])[1]"));
		
		sendText(password, ConfigsReader.getProperty("password"));
		
		
		click(driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]")));
		
		
		
		wait(3);
		
		tearDown();
		
		
	}
}
