package verifyingErrorMessages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//using getAttribute() 
public class VerifyingErrorMessage {
	@Test
	public void verifyErrorMsg() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "F:\\SeliniumDrivers\\chromedriver_win32_2.33\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(2000);
		
		String actual =driver.findElement(By.xpath("//*[@jsname='B34EJ' and @aria-live='assertive']")).getAttribute("innerHTML");
		
		System.out.println("Actual Error message ====="+actual);
		Assert.assertTrue(actual.contains("Enter an email"),"Email id can't be empty");
		driver.close();
		
	}
}
