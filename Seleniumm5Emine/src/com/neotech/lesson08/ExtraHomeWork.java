package com.neotech.lesson08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class ExtraHomeWork extends BaseClass{
	// 1) Launch the browser and open the site
			// "https://chercher.tech/practice/frames-example-selenium-webdriver"
			// 2) Verify on the page header "Not a Friendly Topic" displayed
			// 3) Click on the Inner Frame Check box
			// 4) Choose baby Cat from Animals dropdown
			// 5) Quit the browser
	
	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		WebElement topic=driver.findElement(By.xpath("//span[contains(text(),'Not a Friendly Topic')]"));
		
		if( topic.isDisplayed()) {
			System.out.println("Topic is ->"+ topic.getText());
		}else {
			System.out.println("Topic is not displayed");
		}
		
		driver.switchTo().frame("frame1");
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a"));
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		Select selDD=new Select(driver.findElement(By.id("animals")));
		selDD.selectByVisibleText("Baby Cat");
		
		
		
		
		
		tearDown();
	}

}
