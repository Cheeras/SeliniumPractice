package demo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookRegistration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"F:\\SeliniumDrivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		//Handling text boxes
		driver.findElement(By.xpath(".//*[@id='u_0_g']")).sendKeys("Selenium");
		//Handling radio buttons
		driver.findElement(By.xpath(".//*[@id='u_0_7']")).click();
		
		Thread.sleep(2000);
		//Handling buttons
		driver.findElement(By.xpath(".//*[@id='u_0_y']")).click();
		
		//Handling drop down
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel1.selectByIndex(3);
		
		Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		sel2.selectByIndex(4);
		
		Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel3.selectByIndex(5);
		
		Thread.sleep(2000);
		//Handling links 
		driver.findElement(By.xpath(".//a[text()='Create a Page']")).click();
		
		driver.navigate().back();
		
		
		
	}
}
