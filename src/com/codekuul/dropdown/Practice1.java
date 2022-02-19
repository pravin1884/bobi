package com.codekuul.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select select = new Select(dropDown);
		//select.selectByValue("option2");
		//select.selectByIndex(3);
		select.selectByVisibleText("Option1");
		
	}

}
