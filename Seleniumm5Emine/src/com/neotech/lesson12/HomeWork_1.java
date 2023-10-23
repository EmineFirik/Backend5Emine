package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;

public class HomeWork_1  extends CommonMethods{
	//Homework 1:
	//Open chrome browser
	//Go to https://demo.guru99.com/test/drag_drop.html
	//Drag the following blocks in different ways
	//Drag BANK to DEBIT SIDE
	//Drag SALES to CREDIT SIDE
	//Drag 5000 to DEBIT SIDE
	//Drag 5000 to CREDIT SIDE
	//Close the browser
	public static void main(String[] args) throws InterruptedException, IOException {
		
		setUp();
		
		
		WebElement drag= driver.findElement(By.id("credit2"));
		WebElement drop = driver.findElement(By.id("bank"));
		
		Actions action = new Actions (driver);
		
		action.dragAndDrop(drag, drop).perform();
		wait(3);
		
		WebElement dragSales = driver.findElement(By.id("credit1"));
		WebElement dropCredit = driver.findElement(By.id("loan"));
		
		Actions actions= new Actions ( driver);
		
		actions.dragAndDrop(dragSales, dropCredit).perform();
		wait(3);
		
		WebElement drag500 = driver.findElement(By.id("fourth"));
		WebElement drop500 = driver.findElement(By.id("amt7"));
		
		Actions action1=new Actions (driver);
		action1.dragAndDrop(drag500, drop500).perform();
		wait(3);
		
		WebElement drag500_1= driver.findElement(By.id("fourth"));
		WebElement drag500Credit = driver.findElement(By.id("amt8"));
		
		Actions action2 =new Actions (driver);
		action2.dragAndDrop(drag500_1, drag500Credit).perform();
		wait(3);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
        File sourceFile	= ts.getScreenshotAs(OutputType.FILE);
        String getTimeStamp = new SimpleDateFormat("_yyyy_MM_dd_HH_mm_ss").format(new Date());	

        Files.copy(sourceFile, new File( "screenshots/HRM"+ getTimeStamp + ".png"));
        wait(3);
		tearDown();
		
	}
	

}
