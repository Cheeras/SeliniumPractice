package dropdowndemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownSelect {
	@Test
	public  void selectDropDown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cheeras\\Desktop\\SeliniumPractice\\SeliniumDrivers\\chromedriver_win32_2.33\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println("Title of the page is::" + driver.getTitle());
		driver.manage().window().maximize();
		
		WebElement select_DropDown = driver.findElement(By.id("day"));
		
		Select select = new Select(select_DropDown);
		
		select.selectByIndex(10);
		
		Thread.sleep(3000);
		select.selectByValue("20");
		
		Thread.sleep(3000);
		select.selectByVisibleText("30"); 
		
	}

}
