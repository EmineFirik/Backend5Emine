package com.neotech.lesson09;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BaseClass;

public class HomeWork_2 extends BaseClass {

//TC: Delete Orders

//1) Open chrome browser
//2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//3) Login to the application
//4) Click on the checkbox of all orders with product FamilyAlbum
//5) Delete Selected orders
//6) Verify the orders have been deleted
//7) Quit the browser
	public static void main(String[] args) throws InterruptedException {

		setUp();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);

		wait.withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofSeconds(5));
		wait.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_MainContent_username"))).sendKeys("Tester");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_MainContent_password"))).sendKeys("test");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_MainContent_login_button"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_MainContent_btnCheckAll"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_MainContent_btnDelete"))).click();
		Thread.sleep(2000);
		
		WebElement text=wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_MainContent_orderMessage")));
		if( text.isDisplayed()) {
			System.out.println("The text is displayed");
		}else {
			System.out.println("test is not displayed");
		}
		
		Thread.sleep(2000);
		tearDown();
	}
}
