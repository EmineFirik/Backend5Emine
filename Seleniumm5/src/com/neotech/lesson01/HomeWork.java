package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
	
	public static void main(String[] args) throws InterruptedException {
		//HW1: Amazon Page Title Verification: 
		//Open chrome browser
		//Go to “https://www.amazon.com/”
		//Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
		//End the Session (close the browser).
		
		
		
		
		WebDriver drivers= new ChromeDriver();
		
		drivers.get("https://www.amazon.com/");
		
		String actualURL=drivers.getCurrentUrl();
		String expectURL="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		if( actualURL.equals(expectURL)) {
			System.out.println("Title-"+ drivers.getTitle());
		}else {
			System.out.println("The URL is wrong");
		}
		
		
		Thread.sleep(5000);
		drivers.close();
		
	}

}
