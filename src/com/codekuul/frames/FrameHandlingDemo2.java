package com.codekuul.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingDemo2 {
      public static void main(String[] args) throws InterruptedException {
    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
  		driver.switchTo().frame(0);
  		driver.findElement(By.xpath("//a[contains(text(),'Learning paths')]")).click();
  		Thread.sleep(3000);
  		driver.findElement(By.cssSelector(".dropdown-toggle")).click();
	}
}
