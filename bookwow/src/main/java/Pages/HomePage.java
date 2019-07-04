package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.Base;

public class HomePage extends Base {
	
   @FindBy(xpath ="//a[contains(text(),'Home')]")
   WebElement home;
   
   @FindBy(xpath ="//*[@id=\"myModal\"]/div/div/div[1]/button")
   WebElement popupClose;
 
   public void bannerClose() 
   {
	   driver.findElement(By.className("close")).click();
//	   JavascriptExecutor js= (JavascriptExecutor) driver;
//	   js.executeScript("popupClose.click();" , popupClose);
   }
   
   public void verifyHomeTitle() 
   { 
       home.click();
	   String exp_title=p.getProperty("title_homePage");
	   String act_title=driver.getTitle();
	   if(act_title.equals(exp_title))
	   {
		  System.out.println("valid");
	   }
	   else
		   System.out.println("invalids");
   }
}
