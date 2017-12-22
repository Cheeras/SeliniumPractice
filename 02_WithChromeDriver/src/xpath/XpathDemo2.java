package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cheeras\\Desktop\\SeliniumPractice\\SeliniumDrivers\\chromedriver_win32_2.33\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.gmail.com");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("skypreparations@gmail.com");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[text()='Next']")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("Madhavi@9949");

		driver.findElement(By.xpath("//*[text()='Next']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//*[text()='My Accout']")).click();
		
		
		

	}

}
