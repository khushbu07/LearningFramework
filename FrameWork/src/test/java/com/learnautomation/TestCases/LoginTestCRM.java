package com.learnautomation.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

import org.testng.annotations.Test;

import com.learnautomation.Pages.BaseClass;
import com.learnautomation.Pages.LoginPage;
import com.learnautomation.Utility.BrowserFactory;
import com.learnautomation.Utility.ExcelDataProvider; 



/*abstraction is in this class-we define login and give pageclass reference and then 
credential but not define what locator we used what strategy we used*/


   public class LoginTestCRM extends BaseClass{

	


	@Test
	public void loginApp() {
		
		logger= report.createTest("Login to CRM");

		ExcelDataProvider excel=new ExcelDataProvider();

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		logger.info("Start Application");

		loginpage.logintoAcademia(excel.getStringData("Login",0,0),excel.getStringData("Login",0,1));

		logger.pass("Login Sucess");
		
		
	}

	
	@AfterClass
	public void teardown() {
		BrowserFactory.quitBrowser(driver);

	}
}
