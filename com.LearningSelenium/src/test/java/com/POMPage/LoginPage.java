package com.POMPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
	
	//identify the username
	@FindAll({@FindBy(id="Email"),@FindBy(name="Email"),@FindBy(xpath="//input[@id='Email']")})
	private WebElement emailtextfield;
	
	//identify the password
	@FindBy(name="Password")
	private WebElement passwordtextfield;

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	} 
	
	
}
