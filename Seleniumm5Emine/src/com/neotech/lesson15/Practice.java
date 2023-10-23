package com.neotech.lesson15;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.delta.com");
		
	driver.findElement(By.id("input_departureDate_1")).click();
	
	String month = driver.findElement(By.xpath("//span[text()='December']")).getText();
		
	while( !month.equalsIgnoreCase("April")) {
		
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		month = driver.findElement(By.xpath("//span[text()='December']")).getText();
		
	}
		
	List <WebElement >days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
	
	for( WebElement el: days) {
		
		String dayNum= el.getText();
		
		if( dayNum.equals("16")) {
			el.click();
			break;
		}
	}
	
	String returnMonth = driver.findElement(By.xpath("//span[text()='December']")).getText();
	
	while( returnMonth.equalsIgnoreCase("June")) {
		
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		 returnMonth = driver.findElement(By.xpath("//span[text()='December']")).getText();
	}
	
	
	
	
	}
		
	}

