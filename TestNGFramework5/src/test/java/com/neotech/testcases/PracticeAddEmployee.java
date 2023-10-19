package com.neotech.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.neotech.pages.LoginPractice;
import com.neotech.pages.PracticeDashboard;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;
import com.neotech.utils.ExcelUtility;

public class PracticeAddEmployee  extends CommonMethods{
	
	@Test(dataProvider = "excelData")
	
	public void TestOrangeHRM(String firstName,String lastName,String userName,String password ) 
	
	{
		LoginPractice login = new LoginPractice ();
		PracticeDashboard dash = new PracticeDashboard();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.clickButton);
		
		click(dash.clickPim);
		click(dash.clickAddEmployee);
		
		sendText(dash.firstName, firstName);
		sendText(dash.lastName, lastName);
		click(dash.clickCreate);
		
		sendText(dash.userName,userName);
		sendText(dash.passWord,password);
		sendText(dash.ComfirmpassWord, password);
		click(dash.clickSave);
		
	String expected = dash.EmployeeID.getAttribute("value");
	String actual = dash.EmployeeID.getAttribute("value");	
	AssertJUnit.assertEquals(expected, actual," Name is not mach.");
	
	takeScreenshot(actual);
		
	}

	@DataProvider(name = "excelData")
	public Object[][] getExcelData() {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/testdata/Excel (1).xlsx";
		return ExcelUtility.excelIntoArray(filePath, "Employee");
	}

}
