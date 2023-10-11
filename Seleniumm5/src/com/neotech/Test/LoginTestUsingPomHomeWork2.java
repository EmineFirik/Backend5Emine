package com.neotech.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.Pages.LoginPageUsingFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTestUsingPomHomeWork2 extends CommonMethods {
	// TC 2: Orange HRM wrong password validation
	// 1. Go to https://hrm.neotechacademy.com/
	// 2. Enter valid username and wrong password
	// 3. Click on login button
	// 4. Verify error message with text "Invalid credentials" is displayed

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		LoginPageUsingFactory login = new LoginPageUsingFactory();

		sendText(login.username, ConfigsReader.getProperty("username"));

		sendText(login.password, ConfigsReader.getProperty("password"));

		click(login.loginBtn);
				
		wait(4);
		
		WebElement invalidCredentials = driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/div"));
		
		String message = waitForVisibility(invalidCredentials).getText();
				
	if(message.equals("Invalid Credentials")) {
			
			System.out.println("Message is displayed");
		}else{
		System.out.println("Message is not displayed");
		
		
		wait(3);
		
		driver.close();
		tearDown();

	}
	}
}