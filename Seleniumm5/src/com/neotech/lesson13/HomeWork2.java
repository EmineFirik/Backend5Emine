package com.neotech.lesson13;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;

public class HomeWork2 extends CommonMethods {
	// Homework 2: Scroll Down Continuously
	// Open chrome browser
	// Go to "https://the-internet.herokuapp.com/"
	// Click on the "Infinite Scroll" link
	// Scroll down by 500 pixels 10 times
	// Wait 1 second between each scroll
	// Scroll into the view of tag h3 (Infinite Scroll)
	// Close the browser

	public static void main(String[] args) throws InterruptedException {

		setUp();

		click(driver.findElement(By.linkText("Infinite Scroll")));
		wait(2);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (int i = 1; i <= 10; i++) {

			js.executeScript("window.scrollBy ( 0, 500)");

			wait(1);
		}
		WebElement h3 = driver.findElement(By.xpath("//*[@id=\"content\"]//h3"));

		js.executeScript("arguments[0].scrollIntoView(true)", h3);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		try {
			Files.copy(sourceFile, new File("screenshots/HRM/scrennshot.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}

		wait(4);
		tearDown();
	}

}
