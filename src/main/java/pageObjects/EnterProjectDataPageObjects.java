package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class EnterProjectDataPageObjects extends TestBase {
	
	@FindBy(id="startdate")
	WebElement  txt_startdate;
	
	@FindBy(id = "insurancesum")
	WebElement dd_insurancesum;
	
	@FindBy(id="meritrating")
	WebElement dd_meritrating;
	
	@FindBy(id="damageinsurance")
	WebElement dd_damageinsurance;
	
	@FindBy(xpath="//input[@name='Optional Products[]']/parent::label")
	List <WebElement> chk_hobbies;
	
	@FindBy(id="courtesycar")
	WebElement dd_courtesycar;
	
	@FindBy(id="nextselectpriceoption")
	WebElement btn_next;
	
	 public EnterProjectDataPageObjects() {
		PageFactory.initElements(driver, this);
	}
	 
	 public void enterProjectData() throws Exception {
		 txt_startdate.sendKeys("12/08/2023");
		 cm.selectValueFromDropDown(dd_insurancesum, "3.000.000,00");
		 cm.selectValueFromDropDown(dd_meritrating, "Bonus 2");
		 cm.selectValueFromDropDown(dd_damageinsurance, "Partial Coverage");
		 cm.selectCheckBoxes(chk_hobbies, "Euro Protection");
		 cm.selectValueFromDropDown(dd_courtesycar, "Yes");
	 }
	 
	 public void clickOnButton() {
		 btn_next.click();
	 }

}
