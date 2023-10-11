package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class HomeWork_2 extends CommonMethods {
	// Homework 2:
	// Go to https://hrm.neotechacademy.com/
	// Log in using our custom methods
	// Go to PIM menu
	// Add an employee
	// Go to Employee List
	// Get the list of the employees (Using tables - tr and td)
	// Loop to search for the employee you added
	// When you find the employee - click on it.
	// Take a screenshot
	public static void main(String[] args) throws InterruptedException, IOException {
		setUp();
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));

		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		wait(2);

		click(driver.findElement(By.xpath("//button[@type='submit']")));
		wait(2);

		click(driver.findElement(By.linkText("PIM")));
		wait(2);
		click(driver.findElement(By.linkText("Add Employee")));
		wait(2);
		sendText(driver.findElement(By.id("first-name-box")), "Mustafa");
		sendText(driver.findElement(By.id("middle-name-box")), "Kemal");
		sendText(driver.findElement(By.id("last-name-box")), "Firik");
		wait(2);
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		String currentLocation = "Canadian Regional HQ";
		selectDropdown(location, currentLocation);
		wait(2);
		click(driver.findElement(By.id("modal-save-button")));
		wait(10);

		WebElement EmployeListButton = driver.findElement(By.linkText("Employee List"));
		waitForClickability(EmployeListButton);
		EmployeListButton.click();

		List<WebElement> allEmployeeList = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr"));

		String addEmployeeName = "Mustafa Kemal Firik";

		for (WebElement element : allEmployeeList) {
			if (element.equals(addEmployeeName)) {
				element.click();
				break;
			}
		}
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String getTimeStamp = new SimpleDateFormat("_yyyy_MM_dd_HH_mm_ss").format(new Date());

		Files.copy(sourceFile, new File("screenshots/HRM" + getTimeStamp + ".png"));

		wait(5);
		tearDown();

	}
}
