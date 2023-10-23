package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class DragandDropDemo extends CommonMethods {
public static void main(String[] args) throws InterruptedException {
	//https://jqueryui.com/droppable/
	setUp();
	
	switchToframe(0);
	
	WebElement drag = driver.findElement(By.id("draggable"));
	
	WebElement drop = driver.findElement(By.id("droppable"));
	
	Actions action = new Actions ( driver);
	
	action.dragAndDrop(drag, drop).perform();
	wait(3);
	//action.clickAndHold(drag).moveToElement(drop).release().perform();
	
	
	wait(3);
	tearDown();
	
}
}
