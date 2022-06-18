package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_Up 
{
  
   @FindBy(xpath="//input[@placeholder='Email address or phone number']")   // Webelements
   private WebElement Email;
   
   @FindBy(xpath="//input[@class='inputtext _55r1 _6luy _9npi']")
   private WebElement Password;
   
   @FindBy(xpath="//div[@class='_6ltg']//a[@role='button']")
   private WebElement Click1;
   
   public Sign_Up(WebDriver driver)            // constrctor
    {
 	  PageFactory.initElements(driver, this);
    }
   
   public void Email()                        // Methods
   {
	   Email.sendKeys("Shaikhashpak348");
   }
   
   public void Password()
   {
	   Password.sendKeys("Ashpak@1997");
   }
   
   public void Click1()
   {
	   Click1.click();
   }
}


