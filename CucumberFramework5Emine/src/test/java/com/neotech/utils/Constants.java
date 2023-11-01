package com.neotech.utils;

public class Constants {

	public static final  String CONFIGURATION_FILEPATH=System.getProperty("user.dir")+ "/src/test/resources/confings/configutation.properties";
	
	public static final String REPORT_FILEPATH = System.getProperty("user.dir")+"/target/html-report/HRMS.html";
	
	public static final String SCREENSHOT_FILEPATH = System.getProperty("user.dir") + "/screenshots/";
	
	//public static final  String CHROME_DRIVER_PATH=System.getProperty("user.dir")+"drivers/ChromeDriver";
	
	//public static final  String GECKO_DRIVER_PATH=System.getProperty("user.dir")+"drivers/geckodriver";
	
	
	//bunlari ben eklemedim cunku browserlar cakisiyor sadece file ekledim unutma
	
	public static final int EXPLICIT_WAIT_WAITTIME=25;
	
	public static final int IMPLICIT_WAIT_WAITTIME=15;

	public static final long IMPLICIT_WAIT_TIME = 0;
	
}
