package com.basicselenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicTest1 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Selenium%20Software/Offline%20Website/index.html");

		WebElement email = driver.findElement(By.xpath(".//*[@id='email']"));
		email.sendKeys("kiran@gmail.com");

		WebElement password = driver.findElement(By.xpath(".//*[@id='password']"));
		password.sendKeys("123456");

		WebElement login = driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		login.click();

		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);

		WebElement weuser = driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a"));
		weuser.click();

		List<WebElement> count = driver.findElements(By.tagName("tr"));
		System.out.println("row counts::" + count.size());
		int rowSize = count.size();

		/************* logic for table building ***************/

		WebElement table = driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div"));
		for (int j = 2; j <= 5; j++) { // tr
			for (int i = 1; i <= 7; i++) { // td
				WebElement tblele = driver.findElement(
						By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[2]"));
				System.out.println("  " + tblele.getText());
			}
			System.out.println();

		}

	}

}
