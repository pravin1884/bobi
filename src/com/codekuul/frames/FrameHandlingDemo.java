package com.codekuul.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector(".mce-content-body")).clear();
		driver.findElement(By.cssSelector(".mce-content-body")).sendKeys("hii");
	}
}
