package com.neotech.testbase;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.neotech.utils.CommonMethods;

public class Listener implements ITestListener {

	public void onStart (ITestContext context) 
	{
		System.out.println("Funvtionanlity test started");
	}
	
	public void  onFinish (ITestContext context) {
		System.out.println("Funvtionanlity test started");
	}
	
	public void  onTestStart (ITestResult result) {
		System.out.println("Test wil start: "+ result.getName());
		
		BaseClass.test = BaseClass.report.createTest(result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Passed: " +result.getName());
		
		BaseClass.test.pass("Test Passed: " +result.getName());
		
		BaseClass.test.addScreenCaptureFromPath(CommonMethods.takeScreenshot("passed/"+result.getName()));
	}
	
	
	public void ontestFailure (ITestResult result ) {
		
		System.out.println("Test Failed: "+result.getName());
		
		BaseClass.test.fail("Test Passed: " +result.getName());
		
		BaseClass.test.addScreenCaptureFromPath(CommonMethods.takeScreenshot("failed/"+result.getName()));
		
	}
}
