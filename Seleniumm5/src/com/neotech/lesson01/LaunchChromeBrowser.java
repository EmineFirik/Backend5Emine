package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//we have added everything we need on the comminication path
		//we add selenium language binding Selenium Java lib
		//we add crome driver
		//all we have to do now is to use Selenium classes to call
		//the chromedriver and open closethe crome browser
		
		//https://www.neotechacademy.com/
		
		//If java cannot find our chromedriver location
		//whic driver I want to use wher that is located
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.wellsfargo.com/");
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}
}
