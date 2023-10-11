package com.neotech.lesson10;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BaseClass;

public class HomeWork1 extends BaseClass {

	// IC: Update Customer Information
	// *
	// * 1) Open chrome browser
	// * 2) Go to
	// "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
	// * 3) Login to the application
	// * 4) Verify customer "Susan McLaren" is present in the table
	// * 5) Click on customer details
	// * 6) Update customers last name and credit card info
	// * 7) Verify updated customers name and credit card number is
	// * displayed in table
	// * 8) Close browser
	public static void main(String[] args) throws InterruptedException {
		setUp();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofSeconds(5));
		wait.ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_MainContent_username"))).sendKeys("Tester");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_MainContent_password"))).sendKeys("test");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_MainContent_login_button"))).click();

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

		for (int i = 1; i < rows.size(); i++) {

			String rowText = rows.get(i).getText();

			if (rowText.contains("Susan McLaren")) {

				System.out.println("Susan Papas");

				// bu bir i bir artikmak icin koyduk

				System.out.println("Finding Element-->" + i);

				String path = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" + (i + 1) + "]/td[13]";

				driver.findElement(By.xpath(path));
				break;
			}

		}
		// ubdate customer info

		WebElement cName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
		String testInside = cName.getAttribute("value");
		System.out.println("Curent Name:" + testInside);
		cName.clear();
		cName.sendKeys("Susan Doe");

		WebElement card = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
		card.clear();
		card.sendKeys("11112222333");

		
		tearDown();

	}
}
