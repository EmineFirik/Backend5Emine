package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class HomeWorkAlert extends BaseClass {
//Homework 2:
	// Alert text verification
	// Open chrome browser
	// Go to https://demoqa.com/
	// Click on "Alerts, Frame & Windows" link
	// Click on "Alerts" links on the left side
	// Click on button to see Alert
	// Verify alert box with text "You clicked a button" is present
	// Click on 3rd button in the page
	// Verify alert box with text "Do you confirm action?" is present and click
	// "confirm"
	// Click on 4 th button in the page and enter your name and click ok.
	// Quit browser
	public static void main(String[] args) throws InterruptedException {
		setUp();

		driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Alerts')]")).click();
		
		driver.findElement(By.id("alertButton")).click();
		
		Alert alertClick=driver.switchTo().alert();
		System.out.println("The alert tect is "+ alertClick);
		alertClick.accept();
		
		driver.findElement(By.id("confirmButton")).click();
		Alert thirdButton=driver.switchTo().alert();
		thirdButton.accept();
		
		driver.findElement(By.id("promtButton")).click();
		Alert fourthButton= driver.switchTo().alert();
		fourthButton.sendKeys("ok");
		fourthButton.accept();
		
		String expectUrl="https://demoqa.com/alerts";
		String actualUrl=driver.getCurrentUrl();
		if( expectUrl.equalsIgnoreCase(actualUrl)) {
			System.out.println("Test is pass");
		}else {
			System.out.println("Test is fail.");
		}
		
		Thread.sleep(8000);
		tearDown();

	}
}
