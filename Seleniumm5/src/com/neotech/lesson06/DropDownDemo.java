package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class DropDownDemo extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		//http://neotechacademy-sis.com:9000/Test/  workin this url
		
		setUp();
		driver.findElement(By.id("tUsername")).sendKeys
		(ConfigsReader.getProperty("username"));
		
		driver.findElement(By.id("tPassword")).sendKeys
		(ConfigsReader.getProperty("password"));
		
		
		Thread.sleep(2000);
		
		WebElement dd=driver.findElement(By.id("dAcademicYear_list"));
		
		//this web element select tag
		
		Select selDD=new Select(dd);
		
		//1st way to select
		selDD.selectByIndex(0);//the first option the select
		Thread.sleep(2000);
		
		//2nd way
		selDD.selectByValue("10");//the second option
		Thread.sleep(2000);
		
		
		//3rd way
		selDD.selectByVisibleText("2014-2015");//the thisr option
		Thread.sleep(2000);
		
		
		///the Select object has also acces the print selDD. list
		
		List<WebElement>options=selDD.getOptions();
		
		System.out.println("The size of the list is "+ options.size());
		
		
		for( int i=0; i<options.size(); i++) {
			
			selDD.selectByIndex(i);
			
			Thread.sleep(2000);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		tearDown();
	}
	
	

}
