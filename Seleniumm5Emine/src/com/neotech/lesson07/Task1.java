package com.neotech.lesson07;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Task1 extends BaseClass{
	
	//TC 1: Frame verification
	//Open chrome browser
	//Go to https://demoqa.com/frames
	//Verify the headers in both frames
	//Quit the browser
public static void main(String[] args) throws InterruptedException {
	
	setUp();
	
	driver.switchTo().frame("frame1");
	Thread.sleep(2000);
	
	String frame1Text=driver.findElement(By.id("sampleHeading")).getText();
	System.out.println("The text is from first frame:"+frame1Text );
	Thread.sleep(2000);
	
	driver.switchTo().defaultContent();//ikinciye girmek icin cikipi yeniden giriyoruz
	
	
	driver.switchTo().frame("frame2");
	String secondFram=driver.findElement(By.id("sampleHeading")).getText();
	System.out.println("The second frame text is:"+ secondFram);
	
	driver.switchTo().defaultContent();
	
	Thread.sleep(2000);
	tearDown();
	
}
}
