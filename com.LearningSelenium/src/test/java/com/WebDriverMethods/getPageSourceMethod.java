package com.WebDriverMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSourceMethod {

	//To get the page source of current web page
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	
}
