package com.neotech.lesson13;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class HomeWork3 extends CommonMethods {
	// Homework 3:
	// Go to url: https://hrm.neotechacademy.com/
	// Log in using our custom methods
	// Go to PIM menu
	// Add an employee
	// Upload another image in the employee photo

	public static void main(String[] args) throws InterruptedException {

		setUp();

		login(ConfigsReader.getProperty("username"), "//input[@id='txtUsername']",
				ConfigsReader.getProperty("password"), "//input[@id='txtPassword']", "//button[@type='submit']");

		wait(2);

		click(driver.findElement(By.id("menu_pim_viewPimModule")));
		wait(2);

		click(driver.findElement(By.id("menu_pim_addEmployee")));
		wait(2);

		sendText(driver.findElement(By.id("first-name-box")), "Emine");

		sendText(driver.findElement(By.id("last-name-box")), "Firik");

		WebElement location = driver.findElement(By.id("location"));

		selectDropdown(location, "Canadian Development Center");

		click(driver.findElement(By.id("modal-save-button")));
		wait(5);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		try {
			Files.copy(sourceFile, new File("screenshots/HRM/scrennshot.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}

		tearDown();

	}

}
