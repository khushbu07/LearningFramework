package com.learnautomation.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {

	public static void main(String[]args) {
		
	System.setProperty("webdriver.chrome.driver", "/home/monalika/Monalika/chromedriver");
	WebDriver driver=new ChromeDriver();
	
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
	//driver.manage().window().fullscreen();
	
	// To get position of window relative to the upper left corner of the screen in term of X and Y co-ordinate
	/*Point position= driver.manage().window().getPosition();
	System.out.println("Position of window is: "+position);
	
	// To get individal co-ordinates of window
	System.out.println("X co-ordinat is"+position.getX());
	System.out.println("Y co-ordinat is"+position.getY());
	
	// To get size of current window
	Dimension size= driver.manage().window().getSize();
	System.out.println("Size of current window:"+size);
	
	// To get height and width of window
	System.out.println("Width of window: "+ size.getWidth());
	System.out.println("Height of window"+size.getHeight());*/
	
	
	// To set new position of window
	driver.manage().window().setPosition(new Point(300,300));
	
	// To set new size of window
	driver.manage().window().setSize(new Dimension(400, 500));
	
	
	// To delete all cookies of current domain
	driver.manage().deleteAllCookies();
	 
	// To delete some specific cookie
	driver.manage().deleteCookieNamed("Some cookie name");
	 
	
   // To set maximum pageload time
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	
	// To set script time for execution
	driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

	//Concept: It is time allowed for a script to run. It will throw exception, 
	//if script time is over and execution is still in progress.
	 // To set script time for execution
	driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
	 
	
	//You are given a driver and how you will know driver belongs to which browser?
	Class className= driver.getClass();
	System.out.println(className.getSimpleName());
	 
	
	// To open a URL through naviagate
	driver.navigate().to("https://www.google.com");
	
	}
	
	
	
	
	
}
