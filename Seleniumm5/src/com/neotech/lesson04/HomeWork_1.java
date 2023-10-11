package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_1 {

	public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

	public static void main(String[] args) throws InterruptedException {
		
//HomeWork_1
		// Open chrome browser
		// Go to
		// "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
		// Enter valid username
		// Clear username and enter again valid username
		// Leave password field empty
		// Click on login button
		// Verify error message with text "Invalid Login or Password." is displayed.

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
		userName.sendKeys("Tester");
		Thread.sleep(2000);

		WebElement userNameClear = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
		userNameClear.clear();
		Thread.sleep(2000);

		WebElement userName2 = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
		userName.sendKeys("Tester");
		Thread.sleep(2000);

		WebElement passwordButton = driver.findElement(By.id("ctl00_MainContent_password"));
		passwordButton.sendKeys("");
		Thread.sleep(2000);

		WebElement logginButton = driver.findElement(By.cssSelector(".button"));
		logginButton.click();
		Thread.sleep(2000);

		WebElement InvalidLogin = driver.findElement(By.id("ctl00_MainContent_status"));
		InvalidLogin.isDisplayed();

		if (InvalidLogin.equals(InvalidLogin)) {
			System.out.println(InvalidLogin.getText() + " Is displayed.");
		} else {
			System.out.println("Not display Invalid loggin.");
		}
		driver.quit();
	}
}
