package com.neotech.lesson09;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BaseClass;

public class HomeWork3 extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		setUp();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(NoSuchElementException.class);
		
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Dynamic Control")));
		element.click();
		
		
		
		tearDown();
	}

}
