package com.codekuul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentMultipleTask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		driver.findElement(By.cssSelector("input#checkBoxOption2")).click();
		String name = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset[1]/label[2]")).getText();
		WebElement dropDowm = driver.findElement(By.cssSelector("select#dropdown-class-example"));
		Select s = new Select(dropDowm);
		s.selectByVisibleText(name);
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		String alert = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		if(alert.contains(name))
			System.out.println("text present");
		else {
			System.out.println("text not present");
		}
		
		
		
		
		
		
		
		
		
		



	}

}
