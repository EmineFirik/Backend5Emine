package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		//1. Open chrome browser
//		2. Navigate to “https://www.zillow.com/”
//		3. Navigate to “https://www.google.com/”
//		4. Navigate back to Zillow Page
//		5. Refresh current page
//		6. Verify url contains “Zillow”
		
		//1st way url nasil gideriz driver.get ile
		
		//driver.get("htpps://zillow.com/");
		//2nd way//
		//keep history
		//does not waitb
		driver.navigate().to("https://www.zillow.com/");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		
		driver.navigate().back();//bring us back
		Thread.sleep(1000);
		
		driver.navigate().forward();//back to google
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
