package com.neotech.lesson13;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;

public class HomeWork1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException, IOException {

		// Homework 1: File Upload
		// Upload a file:
		// http://webdriveruniversity.com/File-Upload/index.html
		setUp();

		
		String filePath = System.getProperty("user.dir")+ "/screenshots/HRM_2023_09_25_11_01_51.png";
		
		sendText(driver.findElement(By.id("myFile")), filePath);
		
		wait(3);
		
		click(driver.findElement(By.id("submit-button")));
		
		wait(3);
		
		System.out.println(getAlertText());
		acceptAlert();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			Files.copy(sourceFile, new File("screenshots/HRM/scrennshot.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		wait(3);
		tearDown();

	}
}
