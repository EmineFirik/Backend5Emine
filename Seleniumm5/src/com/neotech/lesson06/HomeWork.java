package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
	public static String url="https://demoqa.com/radio-button";
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		//Radio Button Practice  
		//Open chrome browser
		//Go to "https://demoqa.com/radio-button"
		//Verify if all radio buttons are displayed and clickable
		//Click on all radio buttons
		//Verify radio buttons has been clicked successfully
		//Quit browser
		
	List<WebElement>listRadio=	driver.findElements(By.xpath("//input[@type='radio']"));
	
	for( WebElement element:listRadio) {	
		if(element.isEnabled()) {
			System.out.println(element.getText()+" Radio button is enabled");
		}else {
			System.out.println(element.getText()+ " Radio button is not enabled.");
		}
	}
		Thread.sleep(3000);
		driver.quit();
		
	}

}
