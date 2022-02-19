package com.javaScriptExecuter.demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JseDemo {
	public void jseClick() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.querySelector('a[href=\"/recent-placements\"]').click()");

	}

	public void jseGetText() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String name = (String) jse
				.executeScript("return document.querySelector('a[href=\"/recent-placements\"]').innerText");
		System.out.println(name);

	}

	public void jseScroll() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(arguments[0],arguments[1])",0,900);

	}

	public static void main(String[] args) {
		new JseDemo().jseScroll();
	}

}
