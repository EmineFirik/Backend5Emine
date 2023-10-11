package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Task2 extends BaseClass {
	//Facebook dropdown verification
	//Open chrome browser
	//Go to https://www.facebook.com/r.php
	//Verify:
	//month dd has 12 month options day dd has 31 day options year dd has 118 year options
	//Select your date of birth
	//Quit browser
	
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		Select sMonth=new Select(driver.findElement(By.id("month")));
		Select sDay=new Select(driver.findElement(By.id("day")));
		Select sYear=new Select(driver.findElement(By.id("year")));
		
		System.out.println("The number of options for years: "+ sYear.getOptions().size());
	   
		System.out.println("The number of options for days is: "+ sDay.getOptions().size());
		 System.out.println("The number of options for month is: "+sMonth.getOptions().size());
		
		sYear.selectByVisibleText("1982");
		sMonth.selectByValue("10");
		sDay.selectByIndex(1);
		Thread.sleep(2000);
		tearDown();
		
	}

}
