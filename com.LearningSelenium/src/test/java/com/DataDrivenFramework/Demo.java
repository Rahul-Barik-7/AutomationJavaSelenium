package com.DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Demo {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		FetchingDataFromPropertyFile f=new FetchingDataFromPropertyFile();
		String browser = f.fetchingDataFromPropertyFile("./src/test/resources/TestData/CommanData.properties","browser");
		String url = f.fetchingDataFromPropertyFile("./src/test/resources/TestData/CommanData.properties","url");
		
		if(browser.equals("chrome")) 
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equals("safari"))
		{
			driver=new SafariDriver();
		}
		else
		{
			System.err.println("invalid browser!");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
	}
}