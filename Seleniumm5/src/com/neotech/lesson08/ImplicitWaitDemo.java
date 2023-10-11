package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class ImplicitWaitDemo  extends BaseClass{

	
	public static void main(String[] args) throws InterruptedException {
		//http://webdriveruniversity.com/Ajax-Loader/index.html
		setUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implicit way
		
		
		WebElement span=driver.findElement(By.id("button1"));
		Thread.sleep(1000);
		
		//WebElement notExist=driver.findElement(By.id("ne1"));
		
		
		span.click();
		Thread.sleep(5000);
		
		tearDown();
	}
}
