package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_2 {

	public final static String url = "http://demo.guru99.com/test/newtours/";

	public static void main(String[] args) throws InterruptedException {
        //Homework 2:
		// Using Css ONLY
		// TC 2: Mercury Tours Registration:
		// Open chrome browser
		// Go to “http://demo.guru99.com/test/newtours/”
		// Click on Register Link
		// Fill out all required info
		// Click Submit
		// User successfully registered
		WebDriver driver = new ChromeDriver();
		driver.get(url);
        //click register
		driver.findElement(By.cssSelector("a[href='register.php']")).click();
		Thread.sleep(2000);
		//Contact info
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Emine");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Firik");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("111-111-1111");
		driver.findElement(By.cssSelector("input[id='userName']")).sendKeys("firik@gmail");
		//Mailing info
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("44 paradise");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Orlando");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("FL");
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("0786");
		//User info
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("MustafaKemal");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("kemal123");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("kemal123");
		//Click submit buttom
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		Thread.sleep(6000);
		
		String expectURL="https://demo.guru99.com/test/newtours/register_sucess.php";
		String actualURL=driver.getCurrentUrl();
		if( expectURL.equals(actualURL)) {
			System.out.println("Test is pass.");
		}else {
			System.out.println("Test is fail.");
		}
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}
}
