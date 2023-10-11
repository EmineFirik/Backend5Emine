package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class TaskDropDown extends BaseClass{
	
	
	public static void main(String[] args) throws InterruptedException {
		
		

		setUp();
		
	
		Select  sMonth=new Select(driver.findElement(By.id("month")));
		Select  sDay=new Select(driver.findElement(By.id("day")));
		Select  sYear=new Select(driver.findElement(By.id("year")));
		
		
		System.out.println("The number of option for year  is  "+ sYear.getOptions().size());
		System.out.println("The number of option for month  is  "+ sMonth.getOptions().size());
		System.out.println("The number of option for days  is "+ sDay.getOptions().size());
		
		sYear.selectByVisibleText("1982");
		sMonth.selectByValue("11");
		sDay.selectByIndex(1);
		Thread.sleep(2000);
		tearDown();
	}

		
	}
	


