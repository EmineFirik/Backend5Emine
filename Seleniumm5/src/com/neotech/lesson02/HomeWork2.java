package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverService;

public class HomeWork2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Firefox kullan asagidaki adresi ac
		
		//Opening Page on Firefox Browser
		// Open Firefox browser
		// Navigate to "https://www.redfin.com/"
		// Verify that you have navigated to (https://www.redfin.com/)
		// End the Session (close the browser).
		
		
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
		
		WebDriver driver=new FirefoxDriver();
		
		//driver.get("https://www.redfin.com/");
		String url="https://www.redfin.com/";
		
		//navigate to the url
		driver.get(url);
		
		Thread.sleep(1000);
		//get the current url of the page
		
		String curretURL=driver.getCurrentUrl();
		
		
		if( url.equals(curretURL)) {
			System.out.println("Test pased");
		}else {
			System.out.println("test failed");
			System.out.println("Current url "+ curretURL);
			System.out.println("Expected url "+ url);
		}
		
		Thread.sleep(500);
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
