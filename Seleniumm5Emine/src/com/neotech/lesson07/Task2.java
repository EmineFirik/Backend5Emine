package com.neotech.lesson07;

import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Task2 extends BaseClass{

	
	public static void main(String[] args) throws InterruptedException {
		//https://demoga.com/browser-windbws
		
		setUp();
		
		System.out.println("Title "+ driver.getTitle());
		
		String mainHandle=driver.getWindowHandle();
		
		System.out.println("The id is main page "+ mainHandle);
		Thread.sleep(2000);
		
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("messageWindowButton")).click();
		Thread.sleep(2000);
		Set<String>allWindowHandles=driver.getWindowHandles();
		System.out.println("Number of "+allWindowHandles.size());
		
		for( String handle:allWindowHandles) {
			if(! handle.equals(mainHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		
		Thread.sleep(2000);
		tearDown();
	}
}
