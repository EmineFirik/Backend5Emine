package com.neotech.lesson08;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import com.neotech.utils.BaseClass;

// Homework 1: Use WebDriverWait
// Verify element is enabled
// Open chrome browser
// Go to "https://the-internet.herokuapp.com/"
// Click on the "Dynamic Controls" link
// Click on enable button
// Enter "Hello" and verify text is entered successfully
// Close the browser

public class HomeWork_2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(NoSuchElementException.class);
		
		//WebElement dControl = driver.findElement(By.xpath("//a[text()='Dynamic Controls']"));
		WebElement dControl = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Dynamic Controls']")));
		dControl.click();
		
		//WebElement enButton = driver.findElement(By.xpath("//button[text()='Enable']"));
		WebElement enButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Enable']")));
		enButton.click();				

		//WebElement cLick = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement cLick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));

		cLick.click();
		cLick.sendKeys("Hello");

		System.out.println(cLick.isDisplayed());

		tearDown();

	}

}
