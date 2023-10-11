package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Task  extends CommonMethods{
	private static final File sourceFile = null;

	//Task:
	//Go To HRM WebPage
	//Enter the correct username
	//Leave Password empty
	//Take a screenshot
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		setUp();
		
		sendText(driver.findElement(By.id("txtUsername")),
				ConfigsReader.getProperty("username"));
		wait(2);
		
		TakesScreenshot ts = (TakesScreenshot) driver;

	File fileSource=	ts.getScreenshotAs(OutputType.FILE);
	
	String getTimeStamp = new SimpleDateFormat("_yyyy_MM_dd_HH_mm_ss").format(new Date());
	
	
	
	Files.copy(fileSource, new File( "screenshots/HRM"+getTimeStamp+ ".png" ));
		wait(2);
		tearDown();
		
	}
	

}
