package com.dynamic_xpath;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamic_Class {
	public static void main(String[] args) {
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///C:/Users/DELL/Desktop/Selenium/Selenium%20Software/Offline%20Website/index.html");
		WebElement we = wd.findElement(By.xpath("//p[contains(text(),'Sign in to start your session')]"));
		System.out.println("getText; " + we.getText());
		// Enter User Name
		wd.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");

		// Enter Password
		wd.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");

		// Click Login Button
		wd.findElement(By.xpath("//button[@type='submit']")).click();

		String title = wd.getTitle();
		System.out.println(title);

		if (title.equalsIgnoreCase("AdminLTE 2 | Dashboard")) {

			System.out.println("Login Succcessfully Done");

			// Add New User

			// Click on user tab
			wd.findElement(By.xpath("//span[contains(text(),'Users')]")).click();

			wd.findElement(By.tagName("td"));

			// Click on Add User
			wd.findElement(By.xpath("//button[contains(text(),'Add User')]")).click();

			// Enter Name
			wd.findElement(By.xpath("//input[@id='username']")).sendKeys("Ashish");

			// Enter Mobile Number
			wd.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9545239555");

			// Enter email id
			wd.findElement(By.xpath("//input[@id='email']")).sendKeys("patleashish3@gmail.com");

			// Select Gender
			wd.findElement(By.xpath("//input[@id='Male']")).click();

			// Select State
			Select s1 = new Select(wd.findElement(By.xpath("//select[@class='form-control']")));

			/*
			 * s1.selectByValue("Maharashtra"); s1.selectByIndex(1);
			 * s1.selectByVisibleText("Delhi");
			 */
			List<String> statevalues = new ArrayList<String>();
			for (int i = 0; i < s1.getOptions().size(); i++) {
				statevalues.add(s1.getOptions().get(i).getText().toString());
				if (statevalues.get(i).toString().equals("HP")) {
					s1.selectByVisibleText(statevalues.get(i).toString());
					break;
				}

			}
			/*
			 * for(int i=0; i<statevalues.size(); i++) {
			 * System.out.println(statevalues.get(i).toString());
			 * 
			 * 
			 * }
			 */

			// Enter New Password
			wd.findElement(By.xpath("//input[@id='password']")).sendKeys("16091993");

			// Click Submit Button
			wd.findElement(By.xpath("//button[@id='submit']")).click();

			// Handling with alert msg after User Added successful.

			Alert a1 = wd.switchTo().alert();
			System.out.println(a1.getText());
			a1.accept();

			wd.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click();

			String titler = wd.getTitle();
			System.out.println(titler);

			if (titler.endsWith("Registration Page")) {

				WebElement we6 = wd.findElement(By.xpath("//input[@id='name']"));
				we6.sendKeys("shrikant");

				WebElement we7 = wd.findElement(By.xpath("//input[@id='mobile']"));
				we7.sendKeys("9860208292");

				WebElement we8 = wd.findElement(By.xpath("//input[@id='email']"));
				we8.sendKeys("shrikant@gmail.com");

				WebElement we9 = wd.findElement(By.xpath("//input[@id='password']"));
				we9.sendKeys("123456");

				WebElement we10 = wd.findElement(By.xpath("//button[.='Sign In']"));
				we10.click();

				// driver.switchTo().alert().accept();
				Alert al = wd.switchTo().alert();
				System.out.println(al.getText());// Print the message of Alert "User registered successfully".
				al.accept();

			}

			else {

				System.out.println("Person Already have Membership");
				WebElement we11 = wd.findElement(By.xpath("//a[contains(text(),'I already have a membership')]"));
				we11.click();
				// Redirect to Login Page.

			}

		}
		wd.quit();
	}

}
