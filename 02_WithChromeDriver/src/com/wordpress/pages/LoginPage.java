package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
/*
 * PageObjectModel is just designpattern not a framework
 * As the name says we will be working as pages (pages will be pure java classes)
 * Based on the application behavior we will be creating separate Pages and will store all
 * the locator and respective methods to use them
 * Advantages
 * Script will be more readable format
 * Using POM you will be able to three features Easy to maintain,readable format and reusable 	scripts
 * */
	WebDriver driver;
	By username = By.id("user_login");
	By password = By.xpath("//*[@id='user_pass']");
	By loginbutton = By.name("wp-submit");
	
	public LoginPage(){}		
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void typeUserName(String uname){
		driver.findElement(username).sendKeys(uname);
	}
	
	public void typePassword(String pass){
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnLoginButton(){
		driver.findElement(loginbutton).click();
	}
	
}
