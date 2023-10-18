package com.neotech.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.neotech.utils.ConfigsReader;
import com.neotech.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static ExtentSparkReporter sparkReport;
	public static ExtentReports report;
	public static ExtentTest test;
	
	
	@BeforeTest(alwaysRun =true)
	public void generateReport() 
	{
		sparkReport = new ExtentSparkReporter(Constants.REPORT_FILEPATH);
		sparkReport.config().setDocumentTitle("NeoTech Document");
		sparkReport.config().setReportName("HRMS Report");
		sparkReport.config().setTheme(Theme.DARK);
		
		report = new ExtentReports();
		report.attachReporter(sparkReport);
		
	}
	@AfterTest(alwaysRun =true)
	public void writeReport() 
	{
		
		report.flush();
	}
	
	
    @BeforeMethod(alwaysRun= true)
	public static void setUp() throws InterruptedException {
		
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);

		String browser = ConfigsReader.getProperty("browser");
		// System.out.println(browser);

		switch (browser.toLowerCase()) {
		case "chrome":
			//System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			//System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		//case "safari":
			//WebDriverManager.safaridriver().setup();
			//driver = new  SafariDriver();

		default:
			break;
		}

		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_WAITTIME));
		driver.manage().window().maximize();
		String website = ConfigsReader.getProperty("url");
		driver.get(website);
	}
   @AfterMethod(alwaysRun = true)
	public static  void tearDown() {//birsey ilave edeceksen once config sin icine yazacaksin sonrada buraya ekleyip kullanicaz
		
		if (driver != null) {
				driver.quit();
			}
		}
	}
	