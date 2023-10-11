package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class PotinolWork extends BaseClass{
	
	//TC 1: Facebook dropdown verification

//1) Open chrome browser
//2) Go to https://www.facebook.com/r.php
//3) Verify:
//a) month dd has 12 month options
//b) day dd has 31 day options
//c) year dd has 118 year options
//4) Select your date of birth
//5) Quit browser
public static void main(String[] args) throws InterruptedException {
	
	setUp();
	
	
	
	Select month=new Select(driver.findElement(By.id("month")));
	Select day=new Select(driver.findElement(By.id("day")));
	Select year=new Select(driver.findElement(By.id("year")));
	
	System.out.println("The month elements size is:"+ month.getOptions().size());
	System.out.println("The day option size is :"+ day.getOptions().size());
	System.out.println("The year option size is "+ year.getOptions().size());
	month.selectByValue("11");
	day.selectByValue("1");
	year.selectByValue("1982");
	
	tearDown();
}
}
