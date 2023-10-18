package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//HW1:
		//Open chrome browser
		//Go to "https://demo.guru99.com/test/newtours/"
		//Click on Register Link
		//Fill out ALL required info
		//Click Submit
		//User successfully registered
		//(Create the script using different locators)

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("emine");
		
        driver.findElement(By.name("lastName")).sendKeys("firik");
        
        driver.findElement(By.name("phone")).sendKeys("12344");
        
        driver.findElement(By.id("userName")).sendKeys("emine@gmail");
        
        driver.findElement(By.name("address1")).sendKeys("134Paradise");
        
        driver.findElement(By.name("city")).sendKeys("orlando");
        
        driver.findElement(By.name("stat")).sendKeys("Florida");
        
        driver.findElement(By.name("postalCode")).sendKeys("07896");
        
        driver.findElement(By.name("email")).sendKeys("emi");
        
        driver.findElement(By.name("password")).sendKeys("emi123");
        
        driver.findElement(By.name("confirmPassword")).sendKeys("emi123");
        
        Thread.sleep(2000);
        
        driver.findElement(By.name("submit")).click();
        System.out.println("User successfully registered.");
        
        Thread.sleep(3000);
        driver.quit();
        
        
        
        
        
        
		
	}

}
