package com.codekuul.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeMultiSelect {
      public void selectingMultiSelectDropdown() {
    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.get("https://testingshastra.com/assignments/drop-down");
  		WebElement element = driver.findElement(By.xpath("//select[@class='multi-select']"));
  		Select select = new Select(element);
  		select.selectByVisibleText("Selenium WebDriver");
  		select.selectByVisibleText("Selenium Grid");
  		select.selectByVisibleText("REST API Automation");
  		System.out.println(select.isMultiple());
  		
  		}
      public static void main(String[] args) {
		new PracticeMultiSelect().selectingMultiSelectDropdown();
	}
}
