package com.MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		

		Actions a=new Actions(driver);
		a.clickAndHold(driver.findElement(By.id("circle"))).perform();
		Thread.sleep(1000);
		a.release();
		a.click(driver.findElement(By.xpath("//img[@class='bg-white px-2.5 h-full']")));
		
}
}
