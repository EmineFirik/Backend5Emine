package com.neotech.lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
//* TC: Delete Orders
//*
//* 1) Open chrome browser
//* 2) Go to "http://secure.smartbearsoftware.com/samples/testcompletell/WebOrder/login.aspx
//* 3) Login to the application
//* 4) Click on the checkbox of all orders with product FamilyAlbum
//* 5) Delete Selected orders
//+ 6) Verify the orders have been deleted
//* 7) Quit the browser
public class HomeWork2 extends BaseClass{
	
public static void main(String[] args) throws InterruptedException {
	
	
	
	setUp();
	
	driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	
	driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	
	driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	
	//get colum 3 of the table used if conditions
	
	List<WebElement> elementsCB = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[text()='FamilyAlbum']/parent::tr/td[1]"));
	
	
	
	for (WebElement element : elementsCB) {
		element.click();
	}
	
	
	List<WebElement>  cbox=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[text()='MyMoney']/parent::tr/td[1]"));
	
	for( WebElement el:elementsCB) {
		
		el.click();
	}
	
	
	driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();
	
	Thread.sleep(5000);
	tearDown();
}
}
