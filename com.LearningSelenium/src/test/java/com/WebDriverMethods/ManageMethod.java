package com.WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();// maximize the window
		driver.get("https://www.naukri.com/");
		
		//To delete cookies
		driver.manage().deleteAllCookies();
		
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		//To set the position of the window
		Point p = new Point(250, 250);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);

	}
}
