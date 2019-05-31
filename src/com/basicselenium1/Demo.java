package com.basicselenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo {

	static WebDriver  driver; 
	static String linkText;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("file:///E:/1111111111111111111/JBK%20Offline/gallery.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Demo obj = new Demo();
		
		linkText = obj.getLinkText("Home");
		Assert.assertEquals("Home", linkText, "Home link is not displayed.");
		obj.clickLink("Home");
		Thread.sleep(2000);
		obj.navigateBack();
	}
	
	void navigateBack()
	{
		driver.navigate().back();
	}
	
	void clickLink(String locator)
	{
		driver.findElement(By.linkText("Home")).click();
	}
	
	String getLinkText(String locator)
	{
		return driver.findElement(By.linkText("Home")).getText();
	}
}
