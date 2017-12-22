package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaveDraft {
WebDriver driver;
By title = By.xpath("//input[@name='post_title' and @id='title']");
By comment = By.xpath("//textarea[@id='content']");
By save = By.xpath("//*[@name='save']");
public SaveDraft(){}

public SaveDraft(WebDriver driver){
	this.driver = driver;
}

public void typeTitleForSaveDraft(String title2){
	driver.findElement(By.xpath("//input[@name='post_title' and @id='title']")).sendKeys(title2);
}

public void typeCommentsForSaveDraft(String comment2){
	driver.findElement(title).sendKeys(comment2);
}

public void clickOnSubmit(){
	driver.findElement(By.xpath("//*[@name='save']")).click();
}
	
}

