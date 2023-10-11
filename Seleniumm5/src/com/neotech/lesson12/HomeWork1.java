package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class HomeWork1 extends CommonMethods{
public static void main(String[] args) throws InterruptedException {
	
	
	
	//Homework 1:
	   // FrameDemo at com.neotech.lesson07 using the CommonMethods.java
	
	  //url=https://jqueryui.com/tooltip/
	
	setUp();
	
	wait(2);
	
	switchToframe(0);
	
	WebElement ageText = driver.findElement(By.id("age"));
	
	sendText(ageText, "Emine");
	
	wait(2);
	
	driver.switchTo().defaultContent();
	
	switchToframe(0);
	
WebElement ageText2 = driver.findElement(By.id("age"));
	ageText2.clear();
	wait(2);
	
	sendText(ageText, "42");
	wait(2);
	
	driver.switchTo().defaultContent();
	
	tearDown();
}


}

