package MouseActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		
		
		Actions a = new Actions(driver);
		a.contextClick(driver.findElement(By.xpath("//a[text()='Paytm for Consumer']"))).perform();
		
		Robot r=new Robot();
		for(int i=0;i<3;i++)
		{
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
