package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Task  extends CommonMethods{
	
	public static void main(String[] args) throws InterruptedException {
		
		//https://the-internet.herokuapp.com/key_presses
		
		setUp();
		
		WebElement searxhBox =driver.findElement(By.id("target"));
		
		sendText(searxhBox, "HeandBag");
		
		wait(2);
		searxhBox.sendKeys(Keys.ENTER);
		
		
		
		tearDown();
	}

}
