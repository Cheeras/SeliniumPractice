package verifyingErrorMessages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

// using getText() method
public class VerifyingErrorMessage2 {

	@Test
	public void verifyErrorMsg() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "F:\\SeliniumDrivers\\chromedriver_win32_2.33\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(2000);
		
		String actual =driver.findElement(By.xpath("//*[@jsname='B34EJ' and @aria-live='assertive']")).getText();
		//String expected = "Enter an email or phone";
		//Type 1
		//Assert.assertEquals(actual,expected);
		//Type 2
		Assert.assertTrue(actual.contains("Enter an email or phone"),"email or phone number should not be empty");
		
		driver.close();
		
	}
}
