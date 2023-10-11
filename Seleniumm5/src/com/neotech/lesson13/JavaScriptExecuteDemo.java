package com.neotech.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class JavaScriptExecuteDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));

		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password, ConfigsReader.getProperty("password"));

		wait(2);

		// create a object
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].style.backgroundColor='pink';" + "arguments[1].style.backgroundColor='yellow'",
				username, password);

		
		js.executeScript("arguments[0].click()",
				driver.findElement(By.xpath("//button[@type='submit']")));
		
		
		click(driver.findElement(By.id("menu_pim_viewPimModule")));
		
		click(driver.findElement(By.linkText("Employee List")));
		
		wait(4);
		
		
		//scroll with JS using pixels--> scroll down by 100px
		
		js.executeScript("window.scrollBy(0, 1500)");
		
		
		//scolling upp
		js.executeScript("window.scrollBy(0, -1000)");
		
		//scroll into we
		
		WebElement home = driver.findElement(By.id("home-menu-trigger"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", home);
		wait(5);
		tearDown();
	}
}
