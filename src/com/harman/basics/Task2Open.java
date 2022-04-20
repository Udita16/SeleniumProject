package com.harman.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2Open {
public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goto.com/meeting/");
		driver.findElement(By.id("truste-consent-button")).click();
		
		driver.findElement(By.linkText("Try Free")).click();
        
		driver.findElement(By.id("first-name")).sendKeys("John");
		driver.findElement(By.id("last-name")).sendKeys("Wick");
		driver.findElement(By.id("login_email")).sendKeys("john@gmail.com");
		driver.findElement(By.id("logi_password")).sendKeys("john123456");
		
		Select companysize = new Select(driver.findElement(By.id("companySize")));
		companysize.selectByValue("10-99");

		driver.findElement(By.xpath("//button[text()='Start My Trial']")).click();

}


}
