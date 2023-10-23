package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
	
	public static void main(String[] args) throws InterruptedException {
		//Title aynimi testi geciyormu kontrol et
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		String expectedTitle="Amazon.com: Online shopping for Electronic";
		String actualTitle=driver.getTitle();
		
		
		System.out.println("Actual title "+ actualTitle);
		
		if( expectedTitle.equals(actualTitle)) {
			System.out.println("test passed");
		}else {
			System.out.println("Test failed");
		}
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
