package com.neotech.lesson08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class SelectBottob extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	
	setUp();
	
	WebElement sMonth=driver.findElement(By.id("month"));
	sMonth.click();
	
	WebElement sDay=driver.findElement(By.id("day"));
	sDay.click();
	
	WebElement sYear=driver.findElement(By.id("year"));
	sYear.click();
	
	Select selDDM= new Select(sMonth);
	selDDM.selectByValue("11");
	
	Select selDDD= new Select(sDay);
	selDDD.selectByValue("1");
	
	Select selDDY= new Select(sYear);
	selDDY.selectByValue("1982");
	Thread.sleep(2000);
	
	List <WebElement> el=selDDY.getOptions();
	for( WebElement element:el) {
		element.click();
		Thread.sleep(2000);
	}
	
	tearDown();
}
}
