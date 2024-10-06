package com.iFrame;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/en-US");
		
		//way1
		//driver.switchTo().frame(0);
		
		//way2
		//driver.switchTo().frame("send-sms-iframe");
		
		//way3
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='send-sms-iframe']")));
		
		driver.findElement(By.xpath("//div[@class='txtField']/descendant::input[@name='regEmail']")).sendKeys("7676767676");
	}
}
