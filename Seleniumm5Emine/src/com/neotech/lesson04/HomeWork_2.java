package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_2 {
	public static String url = "https://demoqa.com/radio-button";

	public static void main(String[] args) throws InterruptedException {
//HomeWork
		// Radio Button Practice
		// Open chrome browser
		// Go to "https://demoqa.com/radio-button"
		// Verify if all radio buttons are displayed and clickable
		// Click on all radio buttons
		// Verify radio buttons has been clicked successfully
		// Quit browser

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		WebElement RadioBYes = driver.findElement(By.xpath("//label[@for='yesRadio']"));
		Thread.sleep(2000);

		if (RadioBYes.isDisplayed()) {
			System.out.println("Radio Button Yes is Displayed");
		} else {
			System.out.println("Radio Yes button is not Displayed");
		}
		RadioBYes.click();
		Thread.sleep(2000);

		WebElement RBimpressive = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
		Thread.sleep(2000);
		if (RBimpressive.isDisplayed()) {
			System.out.println("Radio Button impressive is Displayed");
		} else {
			System.out.println("Radio Button impressive is  notDisplayed");
		}
		RBimpressive.click();
		Thread.sleep(2000);

		WebElement RbNo = driver.findElement(By.xpath("//label[@for='noRadio']"));

		if (RbNo.isEnabled()) {
			System.out.println("Radio Button 'No' is not Enabled");
		} else {
			System.out.println("Radio Button 'No' not Displayed.");
		}

		RbNo.click();
		Thread.sleep(7000);
		driver.quit();

	}

}
