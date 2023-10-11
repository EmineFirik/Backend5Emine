package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class HomeWork_1 extends BaseClass {

	// Homework 1: Use WebDriverWait
	// Verify element is enabled
	// Open chrome browser
	// Go to "https://the-internet.herokuapp.com/"
	// Click on the "Dynamic Controls" link
	// Click on enable button
	// Enter "Hello" and verify text is entered successfully
	// Close the browser

	public static void main(String[] args) throws InterruptedException {

		setUp();

		WebElement Dcontrol = driver.findElement(By.linkText("Dynamic Controls"));
		Dcontrol.click();

		WebElement Ebutton = driver.findElement(By.xpath("//button[text()='Enable']"));
		Ebutton.click();
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));

		WebElement tBox = driver.findElement(By.xpath("//input[@type='text']"));
		tBox.click();
		Thread.sleep(2000);
		tBox.sendKeys("Hello");
		
		System.out.println(tBox.isDisplayed());
		Thread.sleep(2000);
		tearDown();
	}

}
