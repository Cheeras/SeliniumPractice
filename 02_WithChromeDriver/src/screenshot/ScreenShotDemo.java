package screenshot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.Utility;

public class ScreenShotDemo {
	// screen shot helps us to under stand application executing properly are
	// not
	@Test
	public void captureScreenShot() throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\SeliniumDrivers\\chromedriver_win32_2.33\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		Utility.captureScreenShot(driver, "FaceBookHomepage");
		driver.findElement(By.cssSelector("input#email")).sendKeys("Test selenium");
		Utility.captureScreenShot(driver, "TypeUserName");
		driver.close();

	}
}
