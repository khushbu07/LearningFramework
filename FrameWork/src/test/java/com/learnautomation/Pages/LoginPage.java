package com.learnautomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver ldriver) {

		this.driver = ldriver;
	}
	
	@FindBy(xpath="//h4[text()='Login as']//following::a[4]") WebElement icon;
	
	
	@FindBy(id="username") WebElement uname;
	
	
	
	@FindBy(name="pswd") WebElement passwrd;
	
	
	@FindBy(name="signin") WebElement signIn;
	
	
	public void logintoAcademia(String UserName,String Password) {
	
    icon.click();	
	uname.sendKeys(UserName);
	passwrd.sendKeys(Password);
	signIn.click();
	
	
	
	
	
	}
	
}