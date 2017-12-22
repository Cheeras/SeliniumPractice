package internetexplorer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEbrowserChallenges {

	public static void main(String[] args) {
		/*
		 * Challenges with IE: =============== Zoom Settings, Protected mode
		 * settings, Xpath changes in IE browser SendKeys Performance
		 */
		System.setProperty("webdriver.ie.driver", "F:\\SeliniumDrivers\\IEDriver_32\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		WebElement element = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		element.sendKeys("admin");
	}

}
