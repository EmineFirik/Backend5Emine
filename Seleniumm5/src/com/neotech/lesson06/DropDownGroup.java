package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class DropDownGroup  extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		//// https://demoqa.com/select-menu// simdi bu url deyiz
		
		driver.findElement(By.id("withOptGroup")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[contains(text(), 'Group 1, option 2')]")).click();
		Thread.sleep(2000);
		
		

		driver.findElement(By.id("selectOne")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[contains(text(), 'Mrs.')]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("selectOne")).click();
		Thread.sleep(2000);
		
       driver.findElement(By.xpath("//*[contains(text(), 'Mr.')]")).click();
       Thread.sleep(2000);
       
       driver.findElement(By.id("selectOne")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[contains(text(), 'Ms.')]")).click();
       Thread.sleep(2000);
       
		//Select  selDD=new Select(select);
		//selDD.selectByIndex(1);
		//Thread.sleep(2000);
		
	//jquery ui select elementi
	//select webelement
		
		
		tearDown();
	}

	
		
	}


