package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Account 
{
	  @FindBy(xpath="//input[@name='firstname']")
	  private WebElement FName;
	  
	  @FindBy(xpath="//input[@name='lastname']")
	  private WebElement LName;
	  
	  @FindBy(xpath="//input[@name='reg_email__']")
	  private WebElement Mobile;
	  
	  @FindBy(xpath="//input[@autocomplete='new-password']")
	  private WebElement New_Password;
	  
	  
	  public Create_Account(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  
	  public void FName()
	  {
		  FName.sendKeys("Ashpak");
	  }
	  
	  public void LName()
	  {
		  LName.sendKeys("Shaikh");
	  }
	  
	  public void Mobile()
	  {
		  Mobile.sendKeys("9271470786");
	  }
	  
	  public void New_Password()
	  {
		  New_Password.sendKeys("Ashpak123456");
	  }
}
