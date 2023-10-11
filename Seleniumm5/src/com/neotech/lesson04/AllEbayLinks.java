package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllEbayLinks {
	
	public static String url="https://www.ebay.com/";
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		
		List <WebElement> allList=driver.findElements(By.tagName("a"));
		System.out.println("The total number of all links "+ allList.size());
		
		int count=0;
		for( WebElement link:allList) {
			if( !link.getText().isEmpty()) {
				System.out.println(link.getText());
				count++;
			}
		}
		System.out.println("The number of links that have text "+ count);
		
		driver.quit();
		
	}
	

}
