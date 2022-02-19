package com.codekuul.actionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/drag_and_drop");
		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By.cssSelector("#column-a"));
		WebElement desti = driver.findElement(By.cssSelector("#column-b"));
		action.dragAndDrop(source,desti).perform();

	}
}
