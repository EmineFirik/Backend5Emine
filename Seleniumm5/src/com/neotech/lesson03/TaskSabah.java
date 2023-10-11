package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskSabah {
	
	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		
		
		
		driver.findElement(By.cssSelector("#email")).sendKeys("john123");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("john123");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
	
		driver.quit();
		
		
		
		
	}

}
