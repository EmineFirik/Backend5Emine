package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("htpps://www.facebook.com/");
		
		//type your email usernamebox
		
		driver.findElement(By.id("email")).sendKeys("neo@gmail.com");
		Thread.sleep(1000);
		
		WebElement pw=driver.findElement(By.id("pass"));
		pw.sendKeys("34dkalkad");
		Thread.sleep(2000);
		
		//driver.findElement(By.id("u_0_c_Yw")).click();
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
