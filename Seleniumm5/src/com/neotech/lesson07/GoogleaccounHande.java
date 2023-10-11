package com.neotech.lesson07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class GoogleaccounHande extends BaseClass {
	public static void main(String[] args) throws InterruptedException {

		setUp();

		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());

		driver.findElement(By.linkText("Help")).click();
		Set<String> WindowsHandle = driver.getWindowHandles();

		System.out.println("Allthe windows handle ->" + WindowsHandle);

		Iterator<String> it = WindowsHandle.iterator();
		String window1 = it.next();
		String window2 = it.next();
		System.out.println("Window1-->" + window1);
		System.out.println("Window2-->" + window2);
		driver.switchTo().window(window2);
		String secondWindowTittle = driver.getTitle();
		System.out.println("The second window title is: " + secondWindowTittle);
		driver.close();
		tearDown();

	}
}
