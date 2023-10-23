package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public final static String url="https://www.facebook.com/";
	
	public static void main(String[] args) throws InterruptedException {
		
		//Open chrome browser
		//2. Go to "https://www.facebook.com/"
		//3. Enter valid username and valid password and click login
		//4. User successfully logged in
        //xpath
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tunaEmine");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("firik");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(1000);
		
		String expectURL="https://www.facebook.com/recover/initiate/?lara_product=www_first_password_failure";
		String actualURL=driver.getCurrentUrl();
		if( expectURL.equalsIgnoreCase(actualURL)) {
			System.out.println("Test pass");
		}else {
			System.out.println("Test fail");
		}
		Thread.sleep(5000);
		
		driver.quit();
	}
	
	
}
