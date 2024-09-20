package com.WebDriverMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentURLMethod {

	//To get the URL of current web page
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
}
