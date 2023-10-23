package com.neotech.lesson03.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public final static String url="http://neotechacademy-sis.com:9000/Test/";
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		
		//send username and password and submit
		
		driver.findElement(By.id("tUsername")).sendKeys("Admin");
		driver.findElement(By.name("tPassword")).sendKeys("Neotech$123");
		
		Thread.sleep(2000);
		driver.findElement(By.id("bLogin")).click();
		driver.findElement(By.linkText("Students")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
		
		////*[@id="tUsername"]
		///html/body/form/table[1]/tbody/tr/td[2]/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td[3]/input
	}

}
