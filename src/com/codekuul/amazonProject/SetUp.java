package com.codekuul.amazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
/**
 * this class have a method for invoking and closing browser 
 * @author pravin
 *
 */

		public class SetUp{
			 WebDriver driver;
		public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
		 driver = new ChromeDriver();
		

	}
		public void closeBrowser() {
			driver.close();

		}

}
	
