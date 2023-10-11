package com.neotech.lesson10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class HomeWork extends BaseClass {
	// Homework: American Airlines Flight Search

//Open chrome browser
//Go to https://www.aa.com/homePage.do
//Enter From and To
//Select departure as December 14 of 2022
//Select arrival as December 22 of 2022
//Click on search
//Close browser

	public static void main(String[] args) throws InterruptedException {

		setUp();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).click();

		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).sendKeys(" Miami ");

		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();

		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		while(!month.equals("December")) {
			
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			
			month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		}
		List<WebElement>days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		for( WebElement day : days) {
			
			String dayNumber = day.getText();
			
			if( dayNumber.equals(" 20 ")) {
				
				day.click();
				
				break;
			}
		}
		//return month;
		String returnMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		while( !returnMonth.equals("December")) {
			
			returnMonth =  driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		}
		List<WebElement > returnDays = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		for( WebElement day:returnDays) {
			
			String dayNum = day.getText();
			
			if( dayNum.equals("22")) {
				day.click();
				break;
			}
		}
		Thread.sleep(2000);
		tearDown();
	}
}
