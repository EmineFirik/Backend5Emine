package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/");

		driver.findElement(By.name("firstName")).sendKeys("emine");

		Thread.sleep(1000);
		
		driver.findElement(By.name("lastName")).sendKeys("firik");
		Thread.sleep(1000);
		
		driver.findElement(By.name("phone"));
		Thread.sleep(1000);
		driver.quit();
		
	}

}
