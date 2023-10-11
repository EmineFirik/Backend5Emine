package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

	public static void main(String[] args) throws InterruptedException {
		// Open chrome browser
		// Go to "http: //secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/
		// login.aspx"
		// Enter valid username and password
		// Click on login button
		// Then verify "Web Orders" is displayed and also username is displayed right
		// top
		// corner
		//Username - Tester
		//Password - test
		
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		
		
		//Send username password
		WebElement userName=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
		userName.sendKeys("Tester");
		Thread.sleep(2000);
		
		WebElement pasWord=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
		pasWord.sendKeys("test");
		Thread.sleep(2000);
		
		WebElement login=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
		login.click();
		Thread.sleep(2000);
		
		
		
		//After login locate the header
		WebElement header=driver.findElement(By.xpath("//h1[text()='Web Orders']"));
		header.click();
		Thread.sleep(2000);
		
		if( header.isDisplayed()) {
			System.out.println("The header  "+header.getText()+" is displayed");
		}else {
			System.out.println("Header is not displayed.");
		}
		
		
		WebElement userDisplay=driver.findElement(By.cssSelector("div.login_info"));
		userDisplay.click();
		if( userDisplay.isDisplayed()) {
			System.out.println("User name is "+ userDisplay.getText()+ " displayed.");
		}else {
			System.out.println("User name is not displayed.");
		}
		
		
		driver.quit();
		}
		
		
		
		
		
		
		
	}

	
	

