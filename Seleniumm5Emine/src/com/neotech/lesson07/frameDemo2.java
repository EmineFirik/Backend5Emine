package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class frameDemo2 extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		
		//frame girmenin birinci yolu bu
		setUp();
		//***girdik
		driver.switchTo().frame(0);///****bu frame girmek icin
		
		WebElement text=driver.findElement(By.id("age"));
		text.sendKeys("42");
		Thread.sleep(2000);
		
		
		//***cikdik
		driver.switchTo().defaultContent();//****Buda framin disina cikmak icin
		
		
		//***girdik
		WebElement againinsideFrame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(againinsideFrame);
		
		WebElement age=driver.findElement(By.xpath("//input[@id='age']"));
		age.clear();
		Thread.sleep(2000);
		age.sendKeys("dincer");
		Thread.sleep(2000);
		
		
		//***cikdik
		driver.switchTo().defaultContent();
		
		
		tearDown();
	}

}
