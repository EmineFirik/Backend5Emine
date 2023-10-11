package com.neotech.lesson10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class task extends BaseClass {

	// TC 1: Disciplinary Cases Search Validation
	// Open chrome browser
	// Go to https://hrm.neotechacademy.com/
	// 7 Login into the application
	// 3
	// Select Discipline
////button[contains(@class,'vc-arrow')][contains(@class,'vc-next')]
	// Select Disciplinary Cases
	// • Click on Filter (Up-Right next to Help)
	// Select from June 6, 2023 to July 15, 2023
	// click on Search

	// Validate that there are no rows in result table
	// Quit the browser
	public static void main(String[] args) throws InterruptedException {

		setUp();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));

		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.id("menu_discipline_defaultDisciplinaryView")).click();

		driver.findElement(By.id("menu_discipline_viewDisciplinaryCases")).click();

		// frame girdik once
		driver.switchTo().frame("noncoreIframe");

		//click on filter
		driver.findElement(By.id("searchModal")).click();

		// click on the calender
		driver.findElement(By.id("DisciplinaryCaseSearch_createdDateFrom")).click();

		Thread.sleep(2000);
		
		// click month
		driver.findElement(By.xpath("//*[@id='DisciplinaryCaseSearch_createdDateFrom_root']//input[1]")).click();

		// click on july
		driver.findElement(By.xpath("//*[@id='DisciplinaryCaseSearch_createdDateFrom_root']//li/span[text()='July']")).click();

		// Date list

		List<WebElement> dates = driver.findElements(By.xpath("//*[@id=\"DisciplinaryCaseSearch_createdDateFrom_table\"]/tbody/tr/td"));

				

		for (WebElement date : dates) {

			if (date.getText().equals("5")) {

				date.click();
				break;
			}
		}
		Thread.sleep(2000);

		// click on the next calender

		driver.findElement(By.id("DisciplinaryCaseSearch_createdDateTo")).click();

		// click month
		driver.findElement(By.xpath("//*[@id='DisciplinaryCaseSearch_createdDateTo_root']//input[1]")).click();

		// click on agust
		driver.findElement(By.xpath("//*[@id=\"DisciplinaryCaseSearch_createdDateTo_root\"]//li/span[text()='August']")).click();
				

		// click dates
		List<WebElement> datess = driver.findElements(By.xpath("//*[@id=\"DisciplinaryCaseSearch_createdDateTo_table\"]/tbody/tr/td"));
				

		for (WebElement dat : datess) {

			if (dat.getText().equals("15")) {

				dat.click();
				break;
			}
		}

		driver.findElement(By.id("searchBtn")).click();

		tearDown();
	}
}
