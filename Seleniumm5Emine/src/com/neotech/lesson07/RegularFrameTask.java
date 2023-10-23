package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class RegularFrameTask  extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.switchTo().frame("frame1");//normal frame girdik
		Thread.sleep(2000);
		
		WebElement insideFrame=driver.findElement(By.id("sampleHeading"));//normal frame girince icindeki elementi secdik
		String text=insideFrame.getText();
		System.out.println(text);
		
		
		driver.switchTo().defaultContent();//normal frameden cikdik
		Thread.sleep(2000);
		
		
		driver.switchTo().frame("frame2");//ikinci frame girdik
		Thread.sleep(2000);
		
		WebElement insideSecondFrame=driver.findElement(By.id("sampleHeading"));//ikinci framein icindeki elementi secdik
		String text2=insideSecondFrame.getText();
		System.out.println(text2);
		

		driver.switchTo().defaultContent();//ikinci frameden cikip ana sayfaya donduk
		Thread.sleep(2000);
		
		tearDown();
	}

}
