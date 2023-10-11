package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class FrameDemo  extends BaseClass{
	
public static void main(String[] args) throws InterruptedException {
	
	
	setUp();
	//this element is inside a element frame.no located
	//driver.findElement(By.id("age")).click();
	
	//bu frame girmeyi sagliyor
	
	driver.switchTo().frame(0);//switch to the frame with index
	WebElement ageTXT=driver.findElement(By.id("age"));
	ageTXT.sendKeys("Emine");
	
	
	

	
	
	//bu method bize framin disina cikmayi sagliyor
	driver.switchTo().defaultContent();
	Thread.sleep(2000);
	
	//2nd way switch by id or name ama bu farme id ve name yok yapamayiz
	
	
	
	//3rd way switch the frame by using webelement
	WebElement frame=driver.findElement(By.cssSelector("iframe.demo-frame"));
	driver.switchTo().frame(frame);
	
	//now we are inside the frame
	WebElement age=driver.findElement(By.id("age"));
	age.clear();
	Thread.sleep(2000);
	age.sendKeys("25");
	tearDown();
}
}
