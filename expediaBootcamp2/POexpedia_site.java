package thePObootcamp2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POexpedia_site {
	public WebDriver driver;
	
	@FindBy(id="tab-flight-tab-hp")
	WebElement  tab_flight;
	@FindBy(xpath="//input[@id='flight-origin-hp-flight']")
	WebElement  origin;
	@FindBy(id="flight-destination-hp-flight")
	WebElement  destination;
	
			@FindBy(id="flight-departing-wrapper-hp-flight")
			WebElement  hitcal1;
			@FindBy(id= "flight-returning-hp-flight")
			WebElement  hitcal2;
	@FindBy(xpath="//*[@id=\"flight-departing-wrapper-hp-flight\"]/div/div/div[2]/table/tbody/tr[4]/td[6]/button")
	WebElement  date_nov22;
	@FindBy(xpath="(//button[@class='datepicker-cal-date'])[16]")
	WebElement  date_dec01;
			@FindBy(xpath="//*[@id=\'traveler-selector-hp-flight\']/div/ul/li/button")
			WebElement  ppl;
	@FindBy(xpath="(//button[@class='uitk-step-input-button uitk-step-input-plus'])[1]")
	WebElement  button_moreAdults;
	@FindBy(xpath ="//div[@class='uitk-col all-col-shrink']")
	WebElement  button_lessAdults;
	@FindBy(xpath = "//*[@id=\'gcw-flights-form-hp-flight\']/div[7]/label/button")
	WebElement search;
	
	@FindBy(xpath="//input[@id='stopFilter_stops-0']")
	WebElement  non_stop;
	
	@FindBy(xpath="//input[@id='airlineRowContainer_CM']")
	WebElement  copa_box;
	@FindBy(id="show-flight-details")
	WebElement  showdetails;
	@FindBy(linkText="Select")
	WebElement  sel;
	
				public POexpedia_site(WebDriver driver) {
					this.driver = driver;
					PageFactory.initElements(driver, this);
				}
				public void clickFlights_tab() {
					tab_flight.click();
				}
				public void DEPARTURE_from(String txt) {
					origin.sendKeys(txt);
				}
				
				public void DESTINATION_to(String txt) {
					destination.sendKeys(txt);
				}
						public void accessCalenderdepart() {
							hitcal1.click();
						}
						public void accessCalenderreturn() {
							hitcal2.click();
						}
				public void clickdeparting_date() {
					date_nov22.click();
				}
				public void clickreturning_date() {
					date_dec01.click();
				}
				public void clickNumTravelers() {
					ppl.click();
				}
				public void clickMoreAdults() {
					button_moreAdults.click();
				}
				public void clickLessAdults() {
					button_lessAdults.click();
				}
						public void submitSearch() {
							search.click();
						}
				public void chooseNON_STOP_filter(){
					non_stop.click();
				}
				public void chooseCOPA_Airlines() {
					copa_box.click();
				}
				public void showDetailsLink() {
					showdetails.click();
				}
				public void Select_flight() {
					sel.click();
				}

}
