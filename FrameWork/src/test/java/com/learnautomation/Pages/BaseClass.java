package com.learnautomation.Pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.learnautomation.Utility.BrowserFactory;
import com.learnautomation.Utility.ConfigDataProvider;
import com.learnautomation.Utility.ExcelDataProvider;
import com.learnautomation.Utility.Helper;

public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;
	public ExtentTest log;
	
	//push to git12345
	
 @BeforeSuite
 
	public void setUpSuite() {
	 
	    Reporter.log("Setting Up report and Test is getting ready",true);
	 
		excel = new ExcelDataProvider();
		
		config=new ConfigDataProvider();
		
		ExtentHtmlReporter extent= new ExtentHtmlReporter(new File(System.getProperty("user.dir")+
				"/Reports/FreeCRM"+Helper.CurrentDateandTime()+".html"));
			
		report=new ExtentReports();
		report.attachReporter(extent);
		
		 Reporter.log("Setting done and Test can be Started",true);
		
	}

	@BeforeClass
	
	public void setup() {
		
		 Reporter.log("Start browser",true);
		 
		driver = BrowserFactory.StartApplication(driver, config.getBrowser(),config.getqaUrl());
		
		Reporter.log("Now application running",true);
	}

	@AfterClass
	public void teardown() {
		BrowserFactory.quitBrowser(driver);

	}


@AfterMethod
public void teardownMethod(ITestResult result) throws IOException {
	
	
	Reporter.log("Test is about to end",true);
	
	if(result.getStatus()==ITestResult.FAILURE) {
		
		
		logger.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenShot(driver)).build());
	}
	else if (result.getStatus()==ITestResult.SUCCESS)
	{
		
		logger.pass("Test Passed ", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenShot(driver)).build());
	}

	report.flush();
	
	
	Reporter.log("Test Completed",true);
	
	
}	

}

