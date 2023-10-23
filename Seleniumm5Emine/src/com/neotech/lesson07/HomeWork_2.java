package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class HomeWork_2  extends BaseClass{
	
	//1) Launch the browser and open the site "https://chercher.tech/practice/frames-example-selenium-webdriver"
	//2) Verify on the page header "Not a Friendly Topic" displayed
	//3) Click on the Inner Frame Check box
	//4) Choose baby Cat from Animals dropdown
	//5) Quit the browser
public static void main(String[] args) throws InterruptedException {
	
	setUp();
	
	WebElement header=driver.findElement(By.xpath("//span[contains(text(),'Not a Friendly Topic')]"));
	
	String text=header.getText();
	
	if( header.isDisplayed()) {
		System.out.println("Test is pass");
	}else {
		System.out.println("Test is not pass");
	}
	
	driver.switchTo().frame("frame1");
	Thread.sleep(2000);
	
	driver.switchTo().frame("frame3");
	Thread.sleep(2000);
	driver.findElement(By.id("a")).click();
	
	driver.switchTo ().defaultContent();
	
	driver.switchTo().frame("frame2");
	Thread.sleep(2000);
	
	driver.findElement(By.id("animals")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//option[@value='babycat']")).click();
	Thread.sleep(2000);
	driver.switchTo ().defaultContent();
	
	
	Thread.sleep(2000);
	tearDown();
}
}
