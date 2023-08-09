package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class EnterInsuranceDataPageObjects  extends TestBase{
	
	@FindBy(id="firstname")
	public WebElement  txt_firstname;
	
	@FindBy(id="lastname")
	public WebElement txt_lastname;
	
	@FindBy(id = "birthdate")
	public WebElement txt_dateofbirth;
	
	//////gender
	@FindBy(xpath="//input[@name='Gender']/parent::label")
	public List<WebElement> rdo_Gender;
	
	@FindBy(id="streetaddress")
	public WebElement txt_streetaddress;
	
	@FindBy(id="country")
	public WebElement dd_country;
	
	@FindBy(id="zipcode")
	public WebElement txt_zipcode;
	
	@FindBy(id="city")
	public WebElement txt_city;
	
	@FindBy(id="occupation")
	public WebElement dd_occupation;
	
	@FindBy(xpath="//input[@name='Hobbies']/parent::label")
	public List <WebElement> chk_hobbies;
	
	@FindBy(id="website")
	public WebElement txt_website;
	
	@FindBy(id="open")
	public WebElement btn_pictureopenbutton;
	
	@FindBy(id="nextenterproductdata")
	public WebElement btn_next;
	
	
	public EnterInsuranceDataPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterInsuranceData() throws Exception {
		txt_firstname.sendKeys("Deepak");
		txt_lastname.sendKeys("Vishwakarma");
		txt_dateofbirth.sendKeys("10/09/2000");
		cm.selectDropDownOption(rdo_Gender, "male");
		txt_streetaddress.sendKeys("Lucknow Uttar Pradesh");
		cm.selectValueFromDropDown(dd_country, "Australia");
		txt_zipcode.sendKeys("226201");
		txt_city.sendKeys("Lucknow");
		cm.selectValueFromDropDown(dd_occupation, "Farmer");
		cm.selectCheckBoxes(chk_hobbies, "Speeding,Other");
			
	}
	
	public void clickOnNextButton() {
		btn_next.click();
	}

}
