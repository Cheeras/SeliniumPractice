/**
 * 
 */
package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;

/**
 * @author cheeras
 *
 */
public class VerifyWordPressLogin {

	@Test
	public void verifyValidLogin(){
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
	}
}
