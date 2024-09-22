package com.JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollLeftAndRight {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		for(int i=1;i<=3;i++)
		{
			j.executeScript("window.scrollBy(500,0);");
			Thread.sleep(2000);
		}
		for(int i=1;i<=3;i++)
		{
			j.executeScript("window.scrollBy(-500,0)");
			Thread.sleep(2000);
		}
		
	}
}
