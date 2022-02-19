package com.codekuul.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingDemo3 {
       public static void main(String[] args) throws InterruptedException {
    	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();
   		driver.get("http://the-internet.herokuapp.com/nested_frames");
   		driver.switchTo().frame("frame-top");
   		driver.switchTo().frame("frame-left");
   		
   		System.out.println(driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText());
   		driver.switchTo().parentFrame();
   		//Thread.sleep(3000);
   		driver.switchTo().frame("frame-middle");
   		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
	}
}
