package bootCamp2_frames;

import org.testng.annotations.Test;

import thePObootcamp2.POexpedia_site;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Expediaflights {
  public WebDriver driver;
	
	@Test
  public void flights_tab() throws InterruptedException {
		POexpedia_site exp = new POexpedia_site(driver);
					//Actions point = new Actions(driver);
		WebElement hitenter = driver.findElement(By.id("flight-origin-hp-flight"));
		WebElement hitenter_two = driver.findElement(By.id("flight-destination-hp-flight"));
		
		Thread.sleep(2000);
			exp.clickFlights_tab();
			Thread.sleep(2000);
			exp.DEPARTURE_from("dulles international ");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			Thread.sleep(2000);
			hitenter.sendKeys(Keys.RETURN);
					//point.keyDown(Keys.ENTER).build().perform();
			
			exp.DESTINATION_to("tocumen panama ");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			Thread.sleep(2000);
			hitenter_two.sendKeys(Keys.RETURN);	
				
					
				
				exp.accessCalenderdepart();
				Thread.sleep(2000);
				exp.clickdeparting_date();
				Thread.sleep(2000);
				exp.accessCalenderreturn();
				exp.clickreturning_date();
				Thread.sleep(2000);
								exp.clickNumTravelers();
								driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
							exp.clickMoreAdults();
							exp.clickMoreAdults();
							exp.clickMoreAdults();
							exp.clickMoreAdults();
							Thread.sleep(2000);
							exp.clickLessAdults();
							exp.clickLessAdults();
				Thread.sleep(2000);
				exp.submitSearch();
				
				//driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
				Thread.sleep(6000);
				exp.chooseNON_STOP_filter();
				Thread.sleep(2000);
				exp.chooseCOPA_Airlines();
				
	
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAlex\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");  // 2inputs    //NEVER CHANGE!!!!!!
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.navigate().to("https://www.expedia.com");
		driver.manage().window().maximize();
		
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
