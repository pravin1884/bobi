package com.codekuul.actionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DragAndDropDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/assignments");
		driver.findElement(By.cssSelector("a[href*='drag-and-drop']")).click();
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//h5[contains(text(),'Automation testing (Python)')]"));
		WebElement desti = driver.findElement(By.xpath("//h4[contains(text(),'Add Course')]"));
		a.dragAndDrop(source, desti).perform();
		

	}

}
