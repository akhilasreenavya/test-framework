package Pages;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GenericLibrary.Base;

public class HomePageTest extends Base 
{
	HomePage homePage = new HomePage();
	
   @BeforeTest
	@Override
	public void setup() throws IOException {
		// TODO Auto-generated method stub
		super.setup();
	}
   
   @Test
   public void verify() {
	   homePage.bannerClose();
	   homePage.verifyHomeTitle();
   }
   

}