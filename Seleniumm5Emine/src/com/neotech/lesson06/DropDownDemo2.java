package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class DropDownDemo2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// https://demoqa.com/select-menu// simdi bu url deyiz

		setUp();

		WebElement oldMenu = driver.findElement(By.id("oldSelectMenu"));
		oldMenu.click();

		Select selDD = new Select(oldMenu);
		selDD.selectByIndex(1);///*******birtane icin ise boyle
		Thread.sleep(2000);

		List<WebElement> options = selDD.getOptions();//****birden fazla ise boyle

		for (int i = 1; i < options.size(); i++) {

			selDD.selectByIndex(i);
			Thread.sleep(200);
		}

		tearDown();

	}

}
