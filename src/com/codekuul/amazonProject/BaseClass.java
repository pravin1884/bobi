package com.codekuul.amazonProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BaseClass{
	public static void signUp() {
		SetUp su = new SetUp();
		su.openBrowser();
		su.driver.get("https://www.amazon.in");
		Actions a = new Actions(su.driver);
		WebElement signBut = su.driver.findElement(By.cssSelector("a#nav-link-accountList"));
		a.moveToElement(signBut).perform();
		su.driver.findElement(By.cssSelector("div#nav-flyout-ya-newCust a:nth-child(1)")).click();
		su.driver.findElement(By.cssSelector("#ap_customer_name")).sendKeys("pravin deshmukh");
		su.driver.findElement(By.cssSelector("#ap_phone_number")).sendKeys("8999817708");
		su.driver.findElement(By.cssSelector("#ap_email")).sendKeys("bhartimurkute23@gmail.com");
		su.driver.findElement(By.cssSelector("#ap_password")).sendKeys("pravin1984");
		su.driver.findElement(By.cssSelector("#continue")).click();
		String text = su.driver.findElement(By.cssSelector("div > h1")).getText();
		System.out.println(text);
		su.closeBrowser();
		
		
		
	}
	public void searchProduct() {
		SetUp sc = new SetUp();
		sc.openBrowser();
		sc.driver.get("https://www.amazon.in");
		sc.driver.findElement(By.cssSelector("#twotabsearchtextbox")).click();
		sc.driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("pen");
		



	}
	public static void main(String[] args) {
		signUp();
	}

}
