package com.testng.demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginOperation {
	
	@Test
	public void openChrome() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//input[@name='password' or @placeholder='Password']")).sendKeys("admin123");
		 driver.findElement(By.xpath("//*[@type='submit' or @text()='Login']")).click();
	}

}
