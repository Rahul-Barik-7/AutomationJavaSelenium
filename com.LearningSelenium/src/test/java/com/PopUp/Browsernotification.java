package com.PopUp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browsernotification {
	public static void main(String[] args) {
		
		
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--disable-notifications");
		
		
		WebDriver driver=new ChromeDriver(o);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com");
	}
}
