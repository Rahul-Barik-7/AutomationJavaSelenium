package com.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	
	//Navigate to previous page, Navigate to next page, Refresh current web page
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		//To enter the URL
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		//To navigate to previous page
		driver.navigate().back();
		Thread.sleep(2000);
		//To navigate to next page
		driver.navigate().forward();
		Thread.sleep(2000);
		//Refresh current web page
		driver.navigate().refresh();
	}
	
}
