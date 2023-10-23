package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork2 {

	public static void main(String[] args) throws InterruptedException {
		
		// HW2: Opening Page on Firefox Browser
		// Open Firefox browser
		// Navigate to “https://www.redfin.com/”
		// Verify that you have navigated to (https://www.redfin.com/)
		// End the Session (close the browser).

		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.redfin.com/");

		String currentURL = driver.getCurrentUrl();
		String expectURL = "https://www.redfin.com/";

		if (currentURL.equals(expectURL)) {
			System.out.println("Navigate to ->  " + currentURL);
		} else {
			System.out.println("URL is wrong");
		}

		Thread.sleep(6000);
		driver.close();
	}

}
