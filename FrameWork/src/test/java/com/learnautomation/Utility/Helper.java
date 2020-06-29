package com.learnautomation.Utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	//screenshot,alert,frames,javascriptexecutor,sync issue,window
	
	
	
	public static String captureScreenShot(WebDriver driver) {
		
		
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String screenshotPath=System.getProperty("user.dir")+"/ScreenShots/FreeCRM_" +CurrentDateandTime() +".png";
		 
	try {
		
		FileHandler.copy(src,new File(screenshotPath));
		
		System.out.println("Screenshot Captued");
			
		} catch (IOException e) {
			
			System.out.println("Unable to take Screenshot"+e.getMessage());
		}
	
	return screenshotPath;
	
	}
	public static String CurrentDateandTime() {
		
		
		
		DateFormat customformat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		
		Date currentDate=new Date();
		
		return customformat.format(currentDate);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	





















}