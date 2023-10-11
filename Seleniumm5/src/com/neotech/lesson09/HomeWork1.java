package com.neotech.lesson09;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BaseClass;

public class HomeWork1  extends BaseClass{
	//Homework 1: Use WebDriverWait Verify element is enabled
	//† Open chrome browser
	//* Go to "https://the-internet.herokuapp.com/"
	//* Click on the "Dynamic Controls" link
	//* Click on enable button
	//* Enter "Hello" and verify text is entered
	//* successfully Close the browser
public static void main(String[] args) throws InterruptedException {
	
	setUp();

	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
	wait.withTimeout(Duration.ofSeconds(20));
	wait.pollingEvery(Duration.ofSeconds(2));
	wait.ignoring(NoSuchElementException.class);
	
	WebElement dynamicCont=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Dynamic Controls')]")));
	dynamicCont.click();
	
	WebElement enableButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Enable')]")));
	enableButton.click();
	WebElement hello=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='input-example']//input")));
	hello.sendKeys("Hello");
	
	System.out.println(hello.isDisplayed());
	tearDown();
}
}
