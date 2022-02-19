package com.codekuul.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropDown {
         public static void main(String[] args) throws InterruptedException {
        	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
     		WebDriver driver = new ChromeDriver();
     		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
     		driver.findElement(By.cssSelector("input.inputs.ui-autocomplete-input")).sendKeys("ind");
     		Thread.sleep(3000);
     		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
     		for(WebElement option:options) {
     			if(option.getText().equalsIgnoreCase("India")){
     				option.click();
     				break;
     			}
     		}
		}
}
