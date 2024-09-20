package com.WebDriverMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleMethod {
	
	//To get the title of current web page
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		String title = driver.getTitle();
		System.out.println(title);
		
	}
}
