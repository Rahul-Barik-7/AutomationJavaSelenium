package com.PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
	//if you want to handle the popUp then you have to switch the control from main to alert
	Thread.sleep(2000);
	driver.findElement(By.id("buttonAlert2")).click();
	Thread.sleep(2000);
	//Alert a = driver.switchTo().alert();
	//a.accept();
	Alert a = driver.switchTo().alert();
	a.accept();
	}	
	
}
