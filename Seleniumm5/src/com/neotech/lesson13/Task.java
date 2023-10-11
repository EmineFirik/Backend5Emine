package com.neotech.lesson13;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;

public class Task  extends CommonMethods{
	
public static void main(String[] args) throws InterruptedException {
	
	//Navigate to
	//http://samples.gwtproject.org/samples/Showcase/Showcase.html#!Cw
		//FileUpload
		//2) Upload file
		//3) Verify file got successfully uploaded and take screenshot
	setUp();
	
	click(driver.findElement(By.xpath("//*[@id=\"gwt-debug-mainMenu\"]/div/div/div[1]/div[1]/div[1]/div/div[1]/img")));
	wait(2);
	
	click(driver.findElement(By.xpath("//div[@class='CMWVMEC-b-e'][normalize-space()='File Upload']")));
	wait(2);
	
	
	String filePath = System.getProperty("user.dir")+ "/screenshots/HRM_2023_09_25_11_01_51.png";
	
	sendText(driver.findElement(By.id("gwt-debug-cwFileUpload")), filePath);
	
	wait(3);
	
	
	click(driver.findElement(By.xpath("//button[@type='button']")));
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
	
	
	
	
	
	
	tearDown();
}
}
