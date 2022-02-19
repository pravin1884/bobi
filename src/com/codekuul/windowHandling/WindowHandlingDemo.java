package com.codekuul.windowHandling;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/assignments/windowHandlingDemo");
		String currentWin = driver.getWindowHandle();
		driver.findElement(By.cssSelector("button.alert-btn")).click();
		Set<String> totalWin = driver.getWindowHandles();
		for (String window : totalWin) {
			if (!window.equals(currentWin)) {
				driver.switchTo().window(window);
				break;
			}

		}
		String curr = driver.getTitle();
		if (curr.equalsIgnoreCase("Testing Shastra | Training | Placement")) {
			System.out.println("window is switch sucessfully");
			TreeSet<E>
		}
	}
}
