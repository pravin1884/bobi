package com.codekuul;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pravin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/spinner/#default");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='spinner']")).sendKeys("ddgfg");
		driver.findElement(By.xpath("//button[@id='disable']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='spinner']")).isEnabled());
		driver.findElement(By.xpath("//button[@id='disable']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='spinner']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//button[@id='disable']")).getText());
		
		
	}
	   
		  
		   }
	 

	
	   

	
		
			


		
  
	  
	
		
	
