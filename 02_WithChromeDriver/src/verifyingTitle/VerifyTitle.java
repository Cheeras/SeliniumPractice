package verifyingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {

	@Test
	public void verifyPageTitle() {
		System.setProperty("webdriver.chrome.driver", "F:\\SeliniumDrivers\\chromedriver_win32_2.33\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://learn-automation.com/");
		String actual_Title = driver.getTitle();
		System.out.println("Page Title is " + actual_Title);
		String expected_Title = "Selenium WebDriver tutorial - Selenium WebDriver tutorial Step by Step";
		Assert.assertEquals(actual_Title, expected_Title);
		System.out.println("Test passed ...");
	}
}
