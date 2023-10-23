package com.neotech.lesson12;

import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class HomeWork2  extends CommonMethods{
	
public static void main(String[] args) throws InterruptedException {
	
	
	//
	//Homework 2:
	   // WindowHandleDemo at com.neotech.lesson07 using the CommonMethods.java
	//https://accounts.google.com/signup
	
	setUp();
	
	System.out.println(driver.getTitle());
	
	System.out.println(driver.getWindowHandle());
	
   click(driver.findElement(By.linkText("Help")));
   wait(2);
   
	switchToChildWindow();
	System.out.println(driver.getTitle());
System.out.println("The child window title ->"+driver.getWindowHandles());
	
	driver.close();
	
	
	
	tearDown();
}
}
