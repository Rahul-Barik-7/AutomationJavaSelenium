package com.Assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PanDetailsITaxInformation {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.onlineservices.nsdl.com/paam/endUserRegisterContact.html");
		//clicking Drop down 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Application Type']/ancestor::div[@class='form-group']/descendant::span[text()='----Please Select------']")).click();
		//selecting drop down value
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='New PAN - Foreign Citizen (Form 49AA)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Category']/ancestor::div[@class='form-group']/descendant::span[text()='----Please Select------']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='INDIVIDUAL']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Title']/ancestor::div[@class='form-group']/descendant::span[text()='------------select-------------']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Shri']")).click();
		driver.findElement(By.id("l_name_end")).sendKeys("Nanda");
		Thread.sleep(1000);
		driver.findElement(By.id("f_name_end")).sendKeys("Ram");
		Thread.sleep(1000);
		driver.findElement(By.id("m_name_end")).sendKeys("Krishnan");
		Thread.sleep(1000);
		driver.findElement(By.id("date_of_birth_reg")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='calendar-table']/descendant::td[text()='20']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email_id2")).sendKeys("rahul@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("rvContactNo")).sendKeys("7654567876");
		Thread.sleep(1000);
		driver.findElement(By.id("consent")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
