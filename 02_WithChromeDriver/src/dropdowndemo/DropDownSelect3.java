package dropdowndemo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DropDownSelect3 {
	@Test
	public  void selectDropDown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cheeras\\Desktop\\SeliniumPractice\\SeliniumDrivers\\chromedriver_win32_2.33\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println("Title of the page is::" + driver.getTitle());
		driver.manage().window().maximize();
		
		WebElement select_DropDown = driver.findElement(By.id("month"));
		
		Select select = new Select(select_DropDown);
		
		List<WebElement> actual_list = select.getOptions();
		
		int totmonths = actual_list.size();
		
		System.out.println("Total no of options in months dropdown are:"+actual_list.size());
		
		for(WebElement ele : actual_list){
			System.out.println("Months are=="+ele.getText());
		}
		
		Assert.assertEquals(totmonths, 13);
		
		//Compare expected list of values with actual list of values 
		List<String> expected_list = new ArrayList<String>();
		expected_list.add("Month");
		expected_list.add("Jan");
		expected_list.add("Feb");
		expected_list.add("Mar");
		expected_list.add("Apr");
		expected_list.add("May");
		expected_list.add("Jun");
		expected_list.add("Jul");
		expected_list.add("Aug");
		expected_list.add("Sept");
		expected_list.add("Oct");
		expected_list.add("Nov");
		expected_list.add("Dec");
		
		//Compare to expected list verse actual list
		if(actual_list.size()!=expected_list.size()){
			System.out.println("actual and expected lists are not equal");
		}
		
			for(int i=0;i<actual_list.size();i++){
				if(expected_list.get(i).equals(actual_list.get(i))){
					System.out.println("Drop down lists are NOT in correct order");
				}
			}
	}
}
