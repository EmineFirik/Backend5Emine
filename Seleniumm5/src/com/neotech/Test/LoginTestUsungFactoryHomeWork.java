package com.neotech.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.Pages.DashboardPage;
import com.neotech.Pages.DashboardPageUsingFactory;
import com.neotech.Pages.LoginPage;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTestUsungFactoryHomeWork extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TC 1: Orange HRM blank password validation
		// 1. Go to https://hrm.neotechacademy.com/
		// 2. Enter valid username and leave password field empty
		// 3. Click on login button
		// 4. Verify error message with text "Password cannot be empty" is displayed
		setUp();

		LoginPage login1 = new LoginPage();

		sendText(login1.username, ConfigsReader.getProperty("username"));

		sendText(login1.password, "");

		click(login1.loginBtn);

		WebElement errorText = driver.findElement(By.id("txtPassword-error"));

		String text = waitForVisibility(errorText).getText();

		if (text.equals("Password cannot be empty")) {

			System.out.println("Message is displayed");
		} else {

			System.out.println("Message not displayed");
		}

		wait(4);
		tearDown();

	}

}
