package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class AlertStudy extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		driver.findElement(By.name("confirmalertbox")).click();
		Thread.sleep(2000);
		Alert control=driver.switchTo().alert();
		System.out.println("The alert text is :"+ control.getText());
		control.dismiss();
		
		driver.findElement(By.name("promptalertbox1234")).click();
		Thread.sleep(2000);
		Alert secondControl=driver.switchTo().alert();
		System.out.println("The second alert text is :"+ secondControl.getText());
		secondControl.accept();
		
		Thread.sleep(2000);
		tearDown();
	}

}
