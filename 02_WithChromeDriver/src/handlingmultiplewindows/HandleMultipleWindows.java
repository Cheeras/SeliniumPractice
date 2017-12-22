package handlingmultiplewindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {
	public static void main(String [] ars) throws InterruptedException{
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cheeras\\Desktop\\SeliniumPractice\\SeliniumDrivers\\chromedriver_win32_2.33\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
		
		//driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent window id is "+parentWindow);
		
		driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String child:allWindows){
			if(!child.equalsIgnoreCase(parentWindow)){
				driver.switchTo().window(child);
				driver.findElement(By.id("lst-ib")).sendKeys("Selenium WebDriver");
				Thread.sleep(3000);
				driver.close();
			}
		}
		
		
		
		
	}
}