package TestPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import POM_Package.Create_Account;
import POM_Package.Sign_Up;
import Utility.pojo;

public class TestClass extends pojo
{
	WebDriver driver;
	Sign_Up sign;
	Create_Account CreAcc;
	
    @BeforeClass
    public void berforeclass()
    {
    	driver = openchrome();
    }
    
    @BeforeMethod
    
    @Test
    public void test_1()
    {
      sign =  new Sign_Up(driver);
      sign.Email();
      sign.Password();
      sign.Click1();
    }
    
    @Test
    public void test_2() throws InterruptedException
    {
    	Thread.sleep(5000);
    	
    	    CreAcc = new Create_Account(driver);
    		CreAcc.FName();
    	    CreAcc.LName();
    	    CreAcc.Mobile();
    	    CreAcc.New_Password();
    }
    
    @AfterMethod
    
    @AfterClass
    public void afterclass()
    {
    	driver.quit();
    }
}



