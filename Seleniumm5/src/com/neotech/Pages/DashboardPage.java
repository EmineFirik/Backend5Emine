package com.neotech.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class DashboardPage  extends CommonMethods{
	
	
	public WebElement logo= driver.findElement(By.id("ohrm-small-logo"));
	
	public WebElement accountName = driver.findElement(By.id("account-name"));
	
	public WebElement errorMessage = driver.findElement(By.id("txtPassword-error"));
	
	
	}
	


