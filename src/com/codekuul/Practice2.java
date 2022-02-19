package com.codekuul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
      public static void main(String[] args) {
    	  System.setProperty("webdriver.chrome.driver","C:\\Users\\pravin\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
  		driver.findElement(By.cssSelector("input[id='hide-textbox']")).click();
  		System.out.println(driver.findElement(By.cssSelector("input[id='displayed-text']")).isDisplayed());
  		driver.findElement(By.cssSelector("input[id='show-textbox']")).click();
  		System.out.println(driver.findElement(By.cssSelector("input[id='displayed-text']")).isDisplayed());
	}
}
