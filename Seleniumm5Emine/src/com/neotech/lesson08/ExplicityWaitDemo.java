package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class ExplicityWaitDemo extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	
	setUp();
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("button1"))));
	
	//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("button1")));
		
	//WebElement span =driver.findElement(By.id("button1"));
	
	WebElement span = new WebDriverWait(driver, Duration.ofSeconds(20))
					.until(ExpectedConditions
					.visibilityOfElementLocated(By.id("button1"))); 
	
	/*
	 * By.id("button1")      selenium
	 * #button1              css
	 * //*[@id='button1']    xpath
	 */
	
	System.out.println("Span os visible:"+span.isDisplayed());
	
	tearDown();
}
}
