package thePObootcamp2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POhome_depot {
public WebDriver driver;
	
	
	@FindBy(id="headerMyAccount")
	WebElement  accntlink;
	@FindBy(xpath="//*[@id=\'SPSORegister\']/a/span")
	WebElement  register;
	@FindBy(id="email")
	WebElement  em;
	@FindBy(id="password-input-field")
	WebElement  pass;
	@FindBy(id="zipCode")
	WebElement  zip;
	@FindBy(id="phone")
	WebElement  pho;
	@FindBy(id="showPasswordCheck")
	WebElement  show;
	@FindBy(xpath="//*[@id=\'single-signin__body\']/div/div[2]/form/button[1]")
	WebElement  button;
	
				public POhome_depot(WebDriver driver) {
					this.driver = driver;
					PageFactory.initElements(driver, this);  //helps us initialize page class elements from tjos class to be used by other classes.
				}
				
				public void clickMyAccount() {
					accntlink.click();
				}
				public void clickRegisterforAccount() {
					register.click();
				}
				public void inputEmail(String text) {
					em.sendKeys(text);
				}
				public void inputPass(String text) {
					pass.sendKeys(text);
				}
				public void showPassword() {
					show.click();
				}
				public void inputzip(String txt) {
					zip.sendKeys(txt);
				}
				public void inputphone(String txt) {
					pho.sendKeys(txt);
				}
				public void clickCREATEaccountButton() {
					button.click();
				}
				 
	
}
