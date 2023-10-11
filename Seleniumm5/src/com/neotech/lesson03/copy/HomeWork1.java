package com.neotech.lesson03.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {

	public final static String url = "http://demo.guru99.com/test/newtours/";

	public static void main(String[] args) throws InterruptedException {

		// Homework 1:
		// Using xPath ONLY
		// TC 2: Mercury Tours Registration:
		// Open Chrome browser
		// Go to “http://demo.guru99.com/test/newtours/”
		// Click on Register Link
		// Fill out all required info
		// Click Submit
		// User successfully registered

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		
		//Register link
		driver.findElement(By.xpath("//a[@href='register.php']")).click();
		
		//contact info
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Emine");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Firik");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("222-567-3434");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("emine@gmail.com");
		Thread.sleep(2000);

		//Mailing info
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("1444Paradise");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Orlando");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("FL");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("3456");
		Thread.sleep(2000);
		
		//User info
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("MustafaKemal");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kemal123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("kemal123");
		Thread.sleep(2000);
		
		//Click submit
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(10000);
		
		
		String expectURL="https://demo.guru99.com/test/newtours/register_sucess.php";
		String actualURL=driver.getCurrentUrl();
		
		if( expectURL.equalsIgnoreCase(actualURL)) {
			System.out.println("Test is pass.");
		}else {
			System.out.println("Test is fail.");
		}
		
		driver.quit();
		
		
		
		
		
		
		
		

	}
}
