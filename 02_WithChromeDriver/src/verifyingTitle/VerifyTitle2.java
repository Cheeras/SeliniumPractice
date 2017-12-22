package verifyingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle2 {

	@Test
	public void verifyPageTitle() {
		System.setProperty("webdriver.chrome.driver", "F:\\SeliniumDrivers\\chromedriver_win32_2.33\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://learn-automation.com/");
		//getting page title using page source
		String pageSource = driver.getPageSource();
	//	System.out.println("Page Title is " + actual_Title);
	//	String expected_Title = "Selenium WebDriver tutorial - Selenium WebDriver tutorial Step by Step";
		Assert.assertTrue(pageSource.contains(" Selenium WebDriver tutorial Step by Step"));
		System.out.println("Test passed ...");
		
		driver.close();
	}
}
