package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework {
	public static void main(String[] args) throws InterruptedException {
		
		
		/// *
		//* Open chrome browser
		//* Go to "https://demo.guru99.com/test/newtours/"
		//* Click on Register Link
		//* Fill out ALL required info
		//* Click Submit
		//* User successfully
		//* registered
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.findElement(By.partialLinkText("REGIS")).click();
		
		//driver.findElement(By.linkText("REGISTER"));
		driver.findElement(By.name("firstName")).sendKeys("Emine");
		driver.findElement(By.name("lastName")).sendKeys("Firik");
		driver.findElement(By.name("phone")).sendKeys("333-345-3434");
		driver.findElement(By.name("userName")).sendKeys("firikemine@gmail.com");
		
		
		//address info
		driver.findElement(By.name("address1")).sendKeys("123 prospect st");
		driver.findElement(By.name("city")).sendKeys("NYC");
		driver.findElement(By.name("state")).sendKeys("NY");
		driver.findElement(By.name("postalCode")).sendKeys("0007");
		
		
		//user details
		driver.findElement(By.name("email")).sendKeys("john123");
		driver.findElement(By.name("password")).sendKeys("john123");
		driver.findElement(By.name("confirmPassword")).sendKeys("john123");
		
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(5000);
		
		
		//BU ARTIK SAYFA CALISIRSA YAPILACAK SON ISLEM**********DIKKAT DIKKAT
		//check register page sucses
		
		//https://demo.guru99.com/test/newtours/register_sucess.php
		
		String expectedURL="https://demo.guru99.com/test/newtours/register_sucess.php";
		
		String actualURL=driver.getCurrentUrl();
		if( expectedURL.equalsIgnoreCase(actualURL)) {
		System.out.println("Test passed");
		}else {
			System.out.println("Test failed");
	}
		
		driver.quit();
		
		
	}

}
