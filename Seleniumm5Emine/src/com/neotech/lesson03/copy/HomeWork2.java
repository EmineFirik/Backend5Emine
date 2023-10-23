package com.neotech.lesson03.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork2 {
	
	public static void main(String[] args) throws InterruptedException {
		//*
		//* Open chrome browser
		//* Go to "https://www.facebook.com/"
		///* Click on Sign Up link
		//* Enter first name
		//* Enter last name
		//* Enter email address
		//* Re-enter email address
		//* Click on Sign Up button
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();//LINK I YAZACAKSAN LINKTEXT KULLANILACAK
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Emine");
		driver.findElement(By.name("lastname")).sendKeys("Firik");
		
		driver.findElement(By.name("reg_email__")).sendKeys("jw@gmail.com");
		Thread.sleep(2000);
		
		
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("jw@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("jw123");
		
		driver.findElement(By.name("websubmit")).click();
		
	
		
		Thread.sleep(5000);
		driver.quit();
		
		//mail comfirmation
		
		
		
	}

}
