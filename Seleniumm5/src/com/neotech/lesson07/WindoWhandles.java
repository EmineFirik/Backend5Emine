package com.neotech.lesson07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class WindoWhandles extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		//https://accounts.google.com/signup/v2/createaccount?theme=glif&flowName=GlifWebSignIn&flowEntry=SignUp
		System.out.println("Title is ->"+driver.getTitle());
		System.out.println("Handle ->"+driver.getWindowHandles());
		
		//bu bize unic id yi verecek
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(2000);
		
		Set<String>allWindowHandles=driver.getWindowHandles();
		System.out.println("The number of open windows is: "+allWindowHandles.size() );
		
		
		Iterator<String>it=allWindowHandles.iterator();
		String window1=it.next();
		String window2=it.next();
		
		System.out.println("Window1->"+ window1 );
		System.out.println("Window2->"+window2 );
		
		driver.switchTo().window(window2);
		String title2=driver.getTitle();
		System.out.println("The title is "+ title2);
		Thread.sleep(2000);
		driver.close();//bu sadece focus oldugumuzu kapatir
		
		
		//switching to windows to
		Thread.sleep(2000);
		tearDown();
		
	}

}
