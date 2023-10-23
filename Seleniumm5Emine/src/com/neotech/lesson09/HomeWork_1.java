package com.neotech.lesson09;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class HomeWork_1 extends BaseClass {
	// 1) Open chrome browser
	// 2) Go to
	// "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
	// 3) Login to the application
	// 4) Verify customer "Susan McLaren" is present in the table
	// 5) Click on customer details
	// 6) Update customers last name and credit card info
	// 7) Verify updated customers name and credit card number is displayed in table
	// 8) Close browser

	public static void main(String[] args) throws InterruptedException {

		setUp();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		WebElement customerVerify = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl06_OrderSelector"));
		customerVerify.sendKeys("Susan McLaren");
		if (customerVerify.isDisplayed()) {
			System.out.println("Customer name is Verify Susan McLaren");
		} else {
			System.out.println("Name is not verify");
		}
		WebElement customerInfo = driver
				.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[6]/td[13]/input"));
		customerInfo.click();

		WebElement lastName = driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName"));
		lastName.click();
		lastName.clear();
		lastName.sendKeys("Susan Pappas");

		driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();

		WebElement cardNumber = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]"));
		cardNumber.click();
		cardNumber.clear();
		cardNumber.sendKeys("111222333444");

		WebElement cardDate = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox1']"));
		cardDate.click();
		cardDate.clear();
		cardDate.sendKeys("05/23");

		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();

		String expected = "Susan";

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		for (int i = 0; i < rows.size(); i++) {

			String rowText = rows.get(i).getText();
			System.out.println("Row Text : " + rowText);
			if (rowText.contains(expected)) {
				rows.get(i).click();
			}
		}
		Thread.sleep(3000);
		tearDown();
	}

}
