package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(className="ico-register")
	private WebElement registerLink;
	
	@FindBy(className="ico-login")
	private WebElement loginLink;
	
	@FindBy(xpath="//li[@id='topcartlink']")
	private WebElement cartLink;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishListLink;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCartLink() {
		return cartLink;
	}

	public WebElement getWishlistLink() {
		return wishListLink;
	}
	
}
