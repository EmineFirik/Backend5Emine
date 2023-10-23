package com.neotech.lesson03.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCss {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://neotechacademy-sis.com:9000/Test/");
		driver.findElement(By.cssSelector("input#tUsername")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("input#tPassword")).sendKeys("Neotech$123");
		
		driver.findElement(By.cssSelector("input.buttonBig")).click();
		
		Thread.sleep(5000);
		
		
	String expectURL="http://neotechacademy-sis.com:9000/Test/AD/Main/MainPage.aspx";
	String actualURL=driver.getCurrentUrl();
	if( expectURL.equalsIgnoreCase(actualURL)) {
		System.out.println("Test pass");
	}else {
		System.out.println("Test fail");
	}
	
	
		driver.quit();
	}

}
