package com.neotech.lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class CalenderDemo extends BaseClass {
//https://www.delta.com/
	public static void main(String[] args) throws InterruptedException {

		setUp();
		// click calender
		driver.findElement(By.xpath("//span[@class='calDepartLabelCont']/span[2]")).click();

		String month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();

		while (!month.equals("April")) {
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

			month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		}
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));

		for (WebElement day : days) {

			String dayNumber = day.getText();

			if (dayNumber.equals(" 16 ")) {

				day.click();
				break;
			}
		}
		// return month
		String returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		while (returnMonth.equals("June")) {

			returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		}
		// retunr days
		List<WebElement> returnDays = driver
				.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));

		for (WebElement day1 : returnDays) {
			String dayNum = day1.getText();

			if (dayNum.equals(" 5 ")) {

				day1.click();
				break;
			}
		}
		driver.findElement(By.xpath("//button[contains(text(),'done')]")).click();
		Thread.sleep(2000);
		tearDown();
	}

}
