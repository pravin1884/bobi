package com.codekuul.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEndAgoda {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.agoda.com/");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[contains(text(),'Not now')]")).click();
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("maha");
		 List<WebElement> options = driver.findElements(By.xpath("//li[@data-selenium='autosuggest-item']/ul[1]/li[1]/div[1]/span[1]"));
		 for(WebElement option:options) {
			 if(option.getText().equalsIgnoreCase("Nagpur")) {
				 option.click();
				 break;
			 }
			 driver.switchTo().
			 
		 }
	}

}
