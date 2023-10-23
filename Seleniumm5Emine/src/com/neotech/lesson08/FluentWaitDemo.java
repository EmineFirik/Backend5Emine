package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class FluentWaitDemo  extends BaseClass{

	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
		
		wait.withTimeout(Duration.ofSeconds(25));
		wait.pollingEvery(Duration.ofSeconds(5));
		wait.ignoring(NoSuchElementException.class);
		
		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button2")));
		WebElement span=driver.findElement(By.id("button1"));
		System.out.println(span.isDisplayed());
		Thread.sleep(2000);
		tearDown();
		
	}
}
