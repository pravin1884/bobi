package com.codekuul;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class ShopingCartPractice  {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'100% Purchase Protection')]/parent::li/preceding-sibling::li/parent::ul/parent::div/child::div")).getText());
		
		
		
	}
}