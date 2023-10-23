package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class HomeWork_1  extends CommonMethods{

	//Homework 1:
	   // FrameDemo at com.neotech.lesson07 using the CommonMethods.java
	  //url=https://jqueryui.com/tooltip/
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		switchToframe(0);
		
		WebElement age = driver.findElement(By.id(" age "));
		sendText(age, " 25 ");
		wait(2);
		
		age.clear();
		sendText(age, "30 ");
		wait(2);
		
		driver.switchTo().defaultContent();
		
		
		
		
		wait(2);
		tearDown();
	}
	
}
