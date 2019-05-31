package com.basicselenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicTest {
	public static void main(String[] args) {
		WebDriver wd=new FirefoxDriver();
		wd.get("file:///C:/Users/DELL/Desktop/Selenium/Selenium%20Software/Offline%20Website/index.html");
		wd.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		wd.findElement(By.id("password")).sendKeys("123456");
		wd.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		wd.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[2]/a/span")).click();
		wd.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span")).click();
		wd.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[8]/a/span")).click();
			
	}

}
