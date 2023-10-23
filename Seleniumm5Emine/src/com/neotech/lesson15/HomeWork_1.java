package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class HomeWork_1 extends CommonMethods {
	
	// Homework 1: 
		
	
	public WebElement username = driver.findElement(By.xpath("//div[@class='button-holder']/preceding-sibling::div[2]/input"));
	
	public WebElement password = driver.findElement(By.xpath("//div[@class='button-holder']/../div[2]/input"));
	
	public WebElement login = driver.findElement(By.xpath("//form[@class='form-body']/div[3]/button"));
	
	
}
