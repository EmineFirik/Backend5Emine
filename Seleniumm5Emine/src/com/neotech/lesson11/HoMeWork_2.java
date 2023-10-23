package com.neotech.lesson11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.CommonMethods;

public class HoMeWork_2  extends CommonMethods{
public static void main(String[] args) throws InterruptedException {
	
	//Homework 2:
	   // WindowHandleDemo at com.neotech.lesson07 using the CommonMethods.java
	//https://accounts.google.com/signup
	
	setUp();
	

	System.out.println(driver.getTitle());
	System.out.println(driver.getWindowHandle());
	wait(2);
	

	WebDriverWait wait = getWaitObject();
	
	waitForVisibility(driver.findElement(By.linkText("Help"))).click();
	
	switchToChildWindow();
	
	Set<String>windowHandles=driver.getWindowHandles();
	
	Iterator<String> windows=windowHandles.iterator();
	
	System.out.println(driver.getTitle());
	
	String window1=windows.next();
	String window2=windows.next();
	
	System.out.print(window1 + " " + window2);
	
	wait(2);
	tearDown();
}
}
