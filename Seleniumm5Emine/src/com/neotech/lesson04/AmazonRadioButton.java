package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonRadioButton {
	public static String url="https://www.amazon.com/";
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		List<WebElement> el=driver.findElements(By.xpath("//i[@class='icp-radio icp-radio-active']"));
		
		
		for( WebElement list:el) {
			list.click();
			Thread.sleep(2000);
			
		}
		driver.quit();
		
	}

}
