package com.codekuul.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {
         public static void main(String[] args) throws InterruptedException {
        	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver_win32 (1)");
        		WebDriver driver = new ChromeDriver();
        		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        		driver.findElement(By.xpath("//a[@value='DED']")).click();
        		Thread.sleep(2000);
        		driver.findElement(By.xpath("(//a[@value='CJB'])[2]")).click();
        		
        		
        		
        		
		}
}
