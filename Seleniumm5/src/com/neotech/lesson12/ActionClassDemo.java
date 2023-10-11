package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class ActionClassDemo extends CommonMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		//https://www.amazon.com/
		
		setUp();
		
		Actions action =new Actions(driver);
		
		action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).perform();
		
		
		wait(5);
		
		WebElement el = driver.findElement(By.id("nav-flyout-ya-newCust"));
		
		if( el.getText().contains("Start")) {
			
			System.out.println("Menu is was Displayed!!");
			
		}else {
			System.out.println("Menu was not displayed!!");
		}
		
		action.contextClick(el).perform();
		
		wait(3);
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		
		action.moveToElement(searchBox).click().sendKeys("iphone15").doubleClick().perform();
		
		wait(5);
		
		
		
		
		
		
		
		
		
		tearDown();
	}

}
