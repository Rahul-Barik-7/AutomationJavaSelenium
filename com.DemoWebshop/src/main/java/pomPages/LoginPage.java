package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="Email")
	private WebElement emailTextField  ;
	
	@FindBy(id="Password")
	private WebElement passwordTextField ;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	private WebElement loginButton;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void validLoginToDemoWebShop(String email,String password)
	{
	emailTextField.sendKeys(email);
	passwordTextField.sendKeys(password);
	loginButton.click();
	
	}
	
	public void inValidLoginToDemoWebShop(String email,String password)
	{
	emailTextField.sendKeys(email);
	passwordTextField.sendKeys(password);
	loginButton.click();
	emailTextField.clear();
	passwordTextField.clear();
	
	}
}
