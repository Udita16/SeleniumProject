package com.harman.advance;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo3Goto {

	public static void main(String[] args) {
		
         System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		
         WebDriver driver = new ChromeDriver();
		
         driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	     driver.get("https://www.goto.com/meeting");
         
		 driver.findElement(By.linkText("Try Free")).click();
	}
}