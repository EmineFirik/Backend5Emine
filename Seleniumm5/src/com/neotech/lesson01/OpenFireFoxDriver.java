package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFoxDriver {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.getProperty("webdriver.gecko.driver", "drivers/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.neotechacademy.com/");
		
		
		String actualURL= driver.getCurrentUrl();
		String expectURL= "https://www.neotechacademy.com/";
		
		if ( actualURL.equalsIgnoreCase(expectURL)) {
			System.out.println("Title "+driver.getTitle());
		}
		else 
		{
			System.out.println("The url is wrong");
		}
		
		Thread.sleep(5000);
		driver.quit();
	}

}
