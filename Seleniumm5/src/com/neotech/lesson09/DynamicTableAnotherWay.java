package com.neotech.lesson09;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class DynamicTableAnotherWay extends BaseClass {
	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// implicitlyWait

		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));

		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));

		driver.findElement(By.xpath("//button[@type='submit']")).submit();

		driver.findElement(By.id("menu_pim_viewPimModule")).click();

		// click on Employee List
		driver.findElement(By.linkText("Employee List")).click();

		Thread.sleep(3000);

		// find all the rows that contain Linda

		String expected = "Linda";

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr"));

		for (int i = 0; i < rows.size(); i++) {

			String rowText = rows.get(i).getText();

			System.out.println(i + " " + rowText);

			if (rowText.contains(expected)) {

				int rowIndex = i + 1;

				String path = "//table[@id='employeeListTable']/tbody/tr[" + (i + 1) + "]/td[1]";

				driver.findElement(By.xpath(path)).click();
				break;
			}

		}

		tearDown();
	}
}
