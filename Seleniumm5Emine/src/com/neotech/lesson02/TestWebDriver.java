package com.neotech.lesson02;

public class TestWebDriver {
	public static void main(String[] args) {
		
		I_WebDriver driver =new C_ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.getTitle();
		driver.close();
	}

}
