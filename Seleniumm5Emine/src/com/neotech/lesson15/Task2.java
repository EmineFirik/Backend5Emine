package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Task2  extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		//https://the-internet.herokuapp.com/key_presses
		
		//press TAB - ESC - ENTER
		
		setUp();
		
		
		
		WebElement searchBox = driver.findElement(By.id("target"));
		searchBox.sendKeys(Keys.TAB);
		wait(2);
		
	//	WebElement searchBox1 = driver.findElement(By.id("target"));
		searchBox.sendKeys(Keys.ESCAPE);
		wait(2);
		

		searchBox.sendKeys("Test");
		searchBox.sendKeys(Keys.ENTER);
		wait(2);
		
		
		
		tearDown();
		
	}
}
