package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pojo 
{
public WebDriver openchrome()
{
	System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Browser\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://www.facebook.com/");  
	  
	driver.manage().window().maximize();
	  
	return driver;
}
}


