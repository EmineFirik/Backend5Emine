package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class ScreenShotDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		// https://hrm.neotechacademy.com/

		setUp();

		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));

		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));

		click(driver.findElement(By.xpath("//button[@type='submit']")));

		wait(2);

		
		TakesScreenshot ts = (TakesScreenshot) driver;

		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		String getTimeStamp = new SimpleDateFormat("_yyyy_MM_dd_HH_mm_ss").format(new Date());
		
		try {
			Files.copy(sourceFile, new File("screenshots/HRM/screenshot" + getTimeStamp + ".png"));

		} catch (IOException e) {

			e.printStackTrace();

			System.out.println("Unable to save the screenshot");
		}

		tearDown();

	}

}
