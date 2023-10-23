package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskShane {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/");
		
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("emine");
		driver.findElement(By.name("lastName")).sendKeys("firik");
		driver.findElement(By.name("phone")).sendKeys("123 455 2000");
		driver.findElement(By.id("userName")).sendKeys("user.name");
		
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(3000);
		driver.quit();
        
	}

}
