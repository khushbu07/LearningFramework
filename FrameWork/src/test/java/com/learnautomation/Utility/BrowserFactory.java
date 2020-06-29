package com.learnautomation.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	
	
	public static WebDriver StartApplication(WebDriver driver, String browserName, String appURL) {

		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/monalika/Monalika/chromedriver");
			driver = new ChromeDriver();

		} else {
			System.out.println("We do not Support this browser");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

	public static void quitBrowser(WebDriver driver) {
		
		driver.quit();

	}






	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
