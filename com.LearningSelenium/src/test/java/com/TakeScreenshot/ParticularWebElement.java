package com.TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class ParticularWebElement {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"))));
		
		WebElement fblogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		File src = fblogo.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/fblogo.png");
		Files.copy(src, dest);
		
		driver.quit();
		
		
		
	}
}
