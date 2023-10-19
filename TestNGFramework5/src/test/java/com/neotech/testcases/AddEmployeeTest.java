package com.neotech.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.neotech.pages.DashboardHomeWork;
import com.neotech.pages.LoginHomeWork;
import com.neotech.testbase.BaseClass;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;
import com.neotech.utils.ExcelUtility;

public class AddEmployeeTest extends CommonMethods {

	@Test(dataProvider="excelData", groups="OrangeHRM")
	public void TestOrangeHRM(String firstName, String lastName, String userName, String password)

	{
		LoginHomeWork Login = new LoginHomeWork();
		DashboardHomeWork Dashboard = new DashboardHomeWork();

		sendText(Login.username, ConfigsReader.getProperty("username"));
		sendText(Login.password, ConfigsReader.getProperty("password"));
		click(Login.clickLogin);

       

		click(Dashboard.PIM);
		click(Dashboard.AddEmployee);

		sendText(Dashboard.FirstName, firstName);
		sendText(Dashboard.LastName, lastName);
		selectDropdown(Dashboard.location, "Australian Regional HQ");
		
		click(Dashboard.createLoginDetails);

		sendText(Dashboard.username, userName);
		sendText(Dashboard.passWord, password);
		sendText(Dashboard.confirmPassword, password);

		click(Dashboard.clickSave);

		String empID = Dashboard.employeId.getAttribute("value");
		String actualID = Dashboard.employeId.getAttribute("value");
		Assert.assertEquals(empID, actualID, "Employee ID dose not match!");
				
		takeScreenshot(actualID);
		wait(2);
	}

	@DataProvider(name = "excelData")
	public Object[][] getExcelData() {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/testdata/Excel (1).xlsx";
		return ExcelUtility.excelIntoArray(filePath, "Employee");
	}

}

