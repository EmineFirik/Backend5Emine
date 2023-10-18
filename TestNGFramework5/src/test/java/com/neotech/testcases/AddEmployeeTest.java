package com.neotech.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.neotech.pages.DashboardHomeWork;
import com.neotech.pages.LoginHomeWork;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class AddEmployeeTest extends CommonMethods {

	@Test(dataProvider = "getData",groups = "OrangeHRM")
	public void TestOrangeHRM (String firstName,String lastName,String userName, String password,String Location)

	{
		LoginHomeWork Login = new LoginHomeWork();
		DashboardHomeWork Dashboard = new DashboardHomeWork();

		sendText(Login.username, ConfigsReader.getProperty("username"));
		sendText(Login.password, ConfigsReader.getProperty("password"));
		click(Login.clickLogin);
		
		test.info("Clicking login button");

		click(Dashboard.PIM);
		click(Dashboard.AddEmployee);
		
		test.info("Clicking PIM and Add Employee");
		
		sendText(Dashboard.FirstName, firstName);
		sendText(Dashboard.LastName, lastName);
		
		test.info("Add Employee");
		
		selectDropdown(Dashboard.location, Location);
		click(Dashboard.createLoginDetails);
		
		sendText(Dashboard.username ,userName);
		sendText(Dashboard.passWord,password);
		sendText(Dashboard.confirmPassword, password);
		
		test.info("Add password and username");
		
		click(Dashboard.clickSave);
		
		test.info("Click save button");
		String empID = Dashboard.employeId.getAttribute("value");
		String actualID =Dashboard.employeId.getAttribute("value");
		AssertJUnit.assertEquals(empID,  actualID, "Employee ID dose not match!");
		
		takeScreenshot(actualID);
		wait(2);
	}
	@DataProvider(name = "getData")
	public Object[][] createData() {
		Object[][] data = { 
				{ "Luciana", "Dacuruz", "Tho123456789$$", "Thomas@123456$$", "Canadian Development Center"},
				{ "Ingrid ", "Binnig", "Hect1234567891$$", "Rodr@123456$$","Chinese Development Center" },
				{ "Rafeal", "Vargez", "Tra1234567891$$", "Perez@123455$$","France Regional HQ" } };

		return data;
	}

}
