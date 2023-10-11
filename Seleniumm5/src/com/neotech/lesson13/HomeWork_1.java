package com.neotech.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class HomeWork_1 extends CommonMethods {
	//Open chrome browser
	    //* Go to https://demo.guru99.com/test/drag drop.html
		//* Drag the following blocks in different ways
		//* Drag BANK to DEBIT SIDE
		//* Drag SALES to CREDIT SIDE
		//* Drag 5000 to DEBIT SIDE
		//* Drag 5000 to CREDIT SIDE
		//* Close the browser
	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		Actions act = new Actions (driver);
		
		WebElement from1 = driver.findElement(By.id("credit2"));
		WebElement to1 = driver.findElement(By.id("credit1"));
		
		WebElement to2 =driver.findElement(By.id("loan"));
		WebElement from2 = driver.findElement(By.id("fourth"));
		
		WebElement from3 =driver.findElement(By.id("amt7"));
		WebElement to3 =driver.findElement(By.id("amt8"));
		
		act.dragAndDrop(from1, to1).perform();
		wait(2);
		
		act.dragAndDrop(from3, to3).perform();
		wait(2);
		
		act.dragAndDrop(from3, to3);
		wait(2);
		
		act.clickAndHold(from3).build().perform();
		
		if( driver.findElement(By.linkText("perfect")).isDisplayed()) {
			System.out.println("perfect is displayed");
			
		}else {
			System.out.println("perfect is not displayed");
		}
		
		
		
		tearDown();
	}
	

}
