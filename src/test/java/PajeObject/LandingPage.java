package PajeObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver ldriver;
	public LandingPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//li[@data-testid='title-details-origin']")
	WebElement CountryName;
	
	@FindBy(xpath="//a[normalize-space()='December 17, 2021 (United States)']")
	WebElement ReleaseDate;
	
	public String getCountryName() {
		return (CountryName.getText());
		
	}
	
	public String getReleseDate() {
		return (ReleaseDate.getText());
	}

}
