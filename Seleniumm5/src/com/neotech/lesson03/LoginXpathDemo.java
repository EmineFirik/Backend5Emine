package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXpathDemo {
	
	public final static String url="http://neotechacademy-sis.com:9000/Test/";
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		
		//Full xpath example
		//.findElement(By.xpath("/html/body/form/table[1]/tbody/tr/td[2]/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td[3]/input")).sendKeys("Admin");
		
		
		//relativ xpath
		
		driver.findElement(By.xpath("//input[@id='tUsername']")).sendKeys("Admin");
		
		
		//Create an xpath for the password
		driver.findElement(By.xpath("//input[@name='tPassword']")).sendKeys("Neotech#123");
		Thread.sleep(3000);
		//login
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("/a[contains(text(),'Students')]")).click();
		Thread.sleep(3000);
		
		//
		driver.quit();
	}

}
