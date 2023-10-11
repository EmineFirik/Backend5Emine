package com.neotech.lesson08;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class HomeWork_3 extends BaseClass {
	// Homework 3:
	// Add Employee
	// Open chrome browser
	// Go to "https://hrm.neotechacademy.com/"
	// Login into the application
	// Click on PIM > Add Employee
	// Add Employee
	// Log out
	// Quit the browser

	public static void main(String[] args) throws InterruptedException {

		setUp();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(NoSuchElementException.class);

		WebElement userNaem = wait.until(ExpectedConditions.elementToBeClickable(By.id("txtUsername")));
		userNaem.sendKeys(ConfigsReader.getProperty("username"));

		WebElement passWord = wait.until(ExpectedConditions.elementToBeClickable(By.id("txtPassword")));
		passWord.sendKeys(ConfigsReader.getProperty("password"));

		WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		login.click();

		WebElement clickPIM = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='PIM']")));
		clickPIM.click();

		WebElement addEmployee = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Add Employee']")));
		addEmployee.click();

		WebElement employeeName = wait.until(ExpectedConditions.elementToBeClickable(By.id("first-name-box")));
		employeeName.sendKeys("Emine");

		WebElement employeLastName = wait.until(ExpectedConditions.elementToBeClickable(By.id("last-name-box")));
		employeLastName.sendKeys("Tuna");

		WebElement employeID = wait.until(ExpectedConditions.elementToBeClickable(By.id("employeeId")));
		employeID.sendKeys("210");

		WebElement location = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='-- Select --']")));
		location.click();

		WebElement LocationCenter = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='German Regional HQ']")));
		LocationCenter.click();

		WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("modal-save-button")));
		saveButton.click();

		
		WebElement logOut = wait.until(ExpectedConditions.elementToBeClickable(By.id("account-job")));
		logOut.click();

		

		tearDown();
	}
}
