package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePageObjects  extends TestBase{
	
	//only page objects and respective methods
	@FindBy(xpath = "//*[@id='nav_automobile']")
	public WebElement link_automobile;
	
	@FindBy(id="nav_truck")
	public WebElement link_truck;
	
	@FindBy(id="nav_motorcycle")
	public WebElement link_motercycle;
	
	@FindBy(id="nav_camper")
	public WebElement link_camper;
	
	
	//Constructor - to use initialize method
	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickautomobile() {
		link_automobile.click();
	}
	public void clicktruck() {
		link_truck.click();
	}
	public void clickmotercycle() {
		link_motercycle.click();
	}
	public void clickcamper() {
		link_camper.click();
	}

}
