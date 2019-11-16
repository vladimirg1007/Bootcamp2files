package bootCamp2_frames;

import org.testng.annotations.Test;

import thePObootcamp2.POhome_depot;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewAccnt_homeDEPOT {
  public WebDriver driver;
	
  @Test
  public void method1() throws InterruptedException {
	  POhome_depot obj = new POhome_depot(driver);
	  driver.manage().timeouts().pageLoadTimeout(6,TimeUnit.SECONDS);
	  obj.clickMyAccount();
	  Thread.sleep(2000);
	  obj.clickRegisterforAccount();
	  Thread.sleep(2000);
	  obj.inputEmail("bufuholo@gmail.com");
	  obj.inputPass("thisWORDpassISnotl0ng");
	  obj.showPassword();
	  obj.inputzip("22204");
	  obj.inputphone("7033417411");
	  obj.clickCREATEaccountButton();
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAlex\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");  // 2inputs    //NEVER CHANGE!!!!!!
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.navigate().to("https://www.homedepot.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
