package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import genericlibrary.BaseTest;
import genericlibrary.FLib;
import genericlibrary.WorkLib;
import pomPages.HomePage;
import pomPages.RegistrationPage;

public class RegisterTest extends BaseTest {
	
	String email="rahul"+WorkLib.getRandomNumber()+"@gmail.com";
	@Test
	public void register() throws EncryptedDocumentException, IOException {
		
		//click on register link
		HomePage hp = new HomePage(driver);
		hp.getRegisterLink().click();
		
		//fetching data from excel
		FLib l = new FLib();
		String fn = l.getDataFromExelFile(EXCEL_PATH, REG_SHEET, 1, 0);
		String ln = l.getDataFromExelFile(EXCEL_PATH, REG_SHEET, 1, 1);
		String password = l.getDataFromExelFile(EXCEL_PATH, REG_SHEET, 1, 3);
		
		
		//to register
		RegistrationPage rp=new RegistrationPage(driver);
		rp.toRegisterIntoDemoWebShop(fn, ln, email, password);
		
	} 

}
