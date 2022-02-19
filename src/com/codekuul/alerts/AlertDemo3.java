package com.codekuul.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/assignments");
		driver.findElement(By.cssSelector("a[href='/assignments/prompt']")).click();
		driver.findElement(By.cssSelector(".alert-btn")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("pravin");
		alert.accept();
		alert.sendKeys("38");
		alert.accept();
		System.out.println(driver.findElement(By.cssSelector("p#demo")).getText());
	}
}
