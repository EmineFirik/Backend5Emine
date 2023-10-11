package com.neotech.lesson13;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class FileUploadDemo extends CommonMethods {
public static void main(String[] args) throws InterruptedException {
	
	//https://the-internet.herokuapp.com/
	
	setUp();
	
	click(driver.findElement(By.linkText("File Upload")));
	
	String filePath = System.getProperty("user.dir")+ "/screenshots/HRM_2023_09_25_11_01_51.png";
	
	sendText(driver.findElement(By.id("file-upload")), filePath);
	
	wait(3);
	
	
	click(driver.findElement(By.id("file-submit")));
	tearDown();
}
}
