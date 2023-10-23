package com.neotech.lesson08;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class HomeWork1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// http://demo.guru99.com/popup.php
		// 1) Launch the browser and open the site "http://demo.guru99.com/popup.php"
		// 2) Click on link "Click Here". When the user clicks on the "Click Here" link,
		// new second window opens.//use switch windov after elemen yaz
		// 3) On the second Window, Enter your email ID and submit.
		// 4) Then Access Credentials will be Displayed on submitted page. You will see
		// the child window is open in new tab.
		// 5) Close the Child window on which credentials are displayed.Switch to the
		// parent window.
		// 6) Quit all browsers

		setUp();

		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		Thread.sleep(2000);

		Set<String> it = driver.getWindowHandles();

		Iterator<String> windovs = it.iterator();
		String window1 = windovs.next();
		String window2 = windovs.next();
		
		driver.switchTo().window(window2);
		
		WebElement email = driver.findElement(By.name("emailid"));
		email.sendKeys("emine@hotmail.com");
		driver.findElement(By.name("btnLogin")).click();

		driver.close();

		Thread.sleep(2000);
		tearDown();

	}

}
