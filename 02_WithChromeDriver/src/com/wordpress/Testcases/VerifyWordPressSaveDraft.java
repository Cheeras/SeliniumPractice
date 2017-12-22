package com.wordpress.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;
import com.wordpress.pages.SaveDraft;

public class VerifyWordPressSaveDraft {

	@Test
	public void verifySaveDraft() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver",
				"F:\\SeliniumDrivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
					WebDriver driver = new FirefoxDriver();
					driver.manage().window().maximize();
					//driver.get("https://demo.wpjobboard.net/wp-login.php");
					driver.get("http://demo.talkpress.de/trunk/wp-admin/");
					
					
					LoginPage login = new LoginPage(driver);
					login.typeUserName("demo");
					login.typePassword("demo");
					login.clickOnLoginButton();
					
					//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					SaveDraft draft = new SaveDraft();
					//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					Thread.sleep(3000);
					//driver.findElement(By.xpath("//input[@name='post_title' and @id='title']")).sendKeys("Test");
					//driver.findElement(By.xpath("//textarea[@id='content']")).sendKeys("Selenium Testing");
					//click on save draft
					//driver.findElement(By.xpath("//*[@name='save']")).click();
					draft.typeTitleForSaveDraft("for testin purpose");
					draft.typeCommentsForSaveDraft("Selenium for testin purpose");
					draft.clickOnSubmit();
	}
}
