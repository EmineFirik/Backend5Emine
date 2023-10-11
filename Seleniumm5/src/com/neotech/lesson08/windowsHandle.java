package com.neotech.lesson08;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class windowsHandle extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	setUp();
	
	//1) Launch the link https://demoqa.com/browser-windows
	//2) Get the title of the main page
	//3) Click on the tabButton, windowButton and messageWindowButton
	//4) Switch the control of the webdriver to the opened windows
	//5) Print the window handle opened and close right after that
	//6) Quit the browser
	
	
	System.out.println("The title is->" +driver.getTitle());
	
	driver.findElement(By.id("tabButton")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("windowButton")).click();
	Thread.sleep(2000);
	
	
	
	driver.findElement(By.id("messageWindowButton")).click();
	Thread.sleep(2000);
	
	
	Set<String> windowsHandles=driver.getWindowHandles();
	
	Iterator<String>windovs=windowsHandles.iterator();
	
	String windows1=windovs.next();
	String windovs2=windovs.next();
	
	System.out.println(windows1+" "+ windovs2 );
	driver.switchTo().window(windovs2);
	driver.close();
	driver.switchTo().window(windows1);
	tearDown();
}
}
