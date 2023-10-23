package com.neotech.Test;

import com.neotech.Pages.DashboardPage;
import com.neotech.Pages.LoginPage;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTestUsingPOM extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		// https://hrm.neotechacademy.com/

		setUp();

		LoginPage login = new LoginPage();

		sendText(login.username, ConfigsReader.getProperty("username"));

		sendText(login.password, ConfigsReader.getProperty("password"));

		click(login.loginBtn);

		wait(4);

		// dashboard icin yeni objectler olusturuyoruz
		
		DashboardPage dashboard = new DashboardPage();

		if (dashboard.logo.isDisplayed()) {

			System.out.println("Test pass");
		} else {
			System.out.println("Test faill");
		}

		String expectedName = "Jacqueline White";
		
		String actuelName = dashboard.accountName.getText();

		if (expectedName.equals(actuelName)) {
			
			System.out.println("Test is pass");
		} else {

			System.out.println("test is not pass");
		}

		wait(2);
		tearDown();
	}

}
