package com.codekuul;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingRoboatClass {
	public <Robot> void handlingMouseEvents() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com");
	



	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
