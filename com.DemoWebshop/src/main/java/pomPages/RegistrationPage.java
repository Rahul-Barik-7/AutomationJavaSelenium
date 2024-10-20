package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BaseClass{

	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="gender-male")
	private WebElement maleRadioButton;
	
	@FindBy(id="FirstName")
	private WebElement firstNameTextField;
	
	@FindBy(id="LastName")
	private WebElement lastNameTextField;
	
	@FindBy (xpath="//input[@id='Email']")
	private WebElement emailTextField;
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordTextField;
	
	@FindBy (xpath="//input[@id='register-button']")
	private WebElement registerButton;

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLirstNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	
	//business Logic
	
	public void toRegisterIntoDemoWebShop(String fn,String ln,String email,String password)
	{
		maleRadioButton.click();
		firstNameTextField.sendKeys(fn);
		lastNameTextField.sendKeys(ln);
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		confirmPasswordTextField.sendKeys(password);
		registerButton.click();
	}
	
	
	
	
	
}
