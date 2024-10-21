package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;



import genericlibrary.BaseTest;
import genericlibrary.FLib;
import pomPages.HomePage;
import pomPages.LoginPage;

public class ValidLoginTest extends BaseTest{
	
	@Test(description = "Verify the user is able to perform Login or not ")
	
	public void Login() throws EncryptedDocumentException, IOException
	{
		HomePage hp=new HomePage(driver);
		hp.getLoginLink().click();
		
		FLib f=new FLib();
		String username = f.getDataFromExelFile(EXCEL_PATH, LOGIN_SHEET, 1, 0);
		String password = f.getDataFromExelFile(EXCEL_PATH, LOGIN_SHEET, 1, 1);
		
		LoginPage l = new LoginPage(driver);
		l.validLoginToDemoWebShop(username, password);
	}
	
	
}
