package com.neotech.lesson11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class AlertTest  extends CommonMethods{
public static void main(String[] args) throws InterruptedException {
	//url=https://demo.guru99.com/test/delete_customer.php
	setUp();
	driver.findElement(By.name("cusid")).sendKeys("12345");
	
	driver.findElement(By.name("submit")).click();
	wait(2);
	
	System.out.println(getAlertText());
	acceptAlert();
	
	
	driver.findElement(By.name("submit")).click();
	wait(2);
	dismistAlert();
	
	wait(2);
	tearDown();
	
	
	
	
}
}
