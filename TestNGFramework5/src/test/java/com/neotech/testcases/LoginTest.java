package com.neotech.testcases;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTest extends CommonMethods {

	@Test(priority = 1, groups = "regression")
	public void emptyPasswordLogin() {

		LoginPageElements login = new LoginPageElements();
		DashboardPageElements dashboard = new DashboardPageElements();

		test.info("Entering valid login credentials.");
		
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.login);
		wait(2);
		
		test.info("Clicking login button");
		

		String expected = "Jacqueline White";
		String actual = dashboard.accountName.getText();
		Assert.assertEquals(expected, actual, "Account name is not Displayed. ");
	}
	
	@Test(priority = 3, groups ="regression")
	public void emptyPasswordLoginn() {
		LoginPageElements login = new LoginPageElements();
		DashboardPageElements dashboard = new DashboardPageElements();

		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "");
		click(login.login);
		wait(2);

		String expected = "Password cannot be empty";
		String actual = login.errorText.getText();
		Assert.assertEquals(expected, actual, "Password box can not be emty!");
	}
	@Test(priority = 5)
	public void invalidPasswordLogin() {
		LoginPageElements login = new LoginPageElements();
		DashboardPageElements dashboard = new DashboardPageElements();

		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "Neotech123456");
		click(login.login);

		String expected = "Invalid Credentials";
		String actual = dashboard.invalidText.getText();
		Assert.assertEquals(expected, actual, "Invalid Credentials.");

	}

}
