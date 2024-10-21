package TestScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericlibrary.BaseTest;
import pomPages.HomePage;
import pomPages.LoginPage;

public class InvalidLogin extends BaseTest{
	
	@DataProvider(name = "TestData")
	public Object[][] invalidData()
	{	
		Object o[][]=new Object[5][2];
		o[0][0]= "Rahul";
		o[0][1]= "Rahul@481";
		
		o[1][0]= "Rahegul";
		o[1][1]= "Rahulfefe";
		
		o[2][0]= "Rahuededel";
		o[2][1]= "Rahwswsul";

		o[3][0]= "Rawewewhul";
		o[3][1]= "Rahuvcfvgrtl";
		
		o[4][0]= "Rahu232l";
		o[4][1]= "Rahudsdsl";
		
		return o;
	}	
		@Test(dataProvider="TestData")
		public void ToInvalidLogin(String username,String password)
		{
			HomePage hp=new HomePage(driver);
			hp.getLoginLink().click();
			
			LoginPage lp=new LoginPage(driver);
			lp.inValidLoginToDemoWebShop(username, password);
		}
	}

