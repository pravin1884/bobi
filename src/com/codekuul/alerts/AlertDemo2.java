package com.codekuul.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo2 {
      public void handlingAlerts() {
    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.get("https://testingshastra.com/assignments");
  		driver.findElement(By.cssSelector("a[href='/assignments/simple-alert']")).click();
  		driver.findElement(By.cssSelector("input#user")).sendKeys("pravin");
  		driver.findElement(By.cssSelector(".alert-btn")).click();
  		driver.switchTo().alert();
  		System.out.println(driver.switchTo().alert().getText());
  		driver.switchTo().alert().accept();

	}
      public static void main(String[] args) {
		new AlertDemo2().handlingAlerts();
	}
}
