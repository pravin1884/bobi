package com.codekuul.actionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.cssSelector("#draggable"));
		WebElement desti = driver.findElement(By.cssSelector("#droppable"));
		action.dragAndDrop(source, desti).perform();
	}
}
