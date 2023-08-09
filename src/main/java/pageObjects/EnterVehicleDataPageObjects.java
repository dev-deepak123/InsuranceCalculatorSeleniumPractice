package pageObjects;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class EnterVehicleDataPageObjects  extends TestBase{
	
	@FindBy(id="make")
	 WebElement  dd_make;
	
	@FindBy(xpath="//input[@id='engineperformance']")
	 WebElement txt_enginePerformance;
	
	@FindBy(xpath="//input[@id='engineperformance']/following-sibling::span[@class='error']")
	 WebElement error_engineperformance;
	
	@FindBy(id = "dateofmanufacture")
	 WebElement txt_dateofmanufacture;
	
	@FindBy(id="numberofseats")
	 WebElement dd_numberofseats;
	
	@FindBy(id="fuel")
	WebElement dd_fuelType;
	
	@FindBy(id="listprice")
	 WebElement txt_Listprice;
	
	@FindBy(id="licenseplatenumber")
	 WebElement txt_licenceplatenumber;
	
	@FindBy(id="annualmileage")
	 WebElement txt_annualmileaga;
	
	@FindBy(id="nextenterinsurantdata")
	 WebElement btn_next;
	
	
	public EnterVehicleDataPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMake() {
		dd_make.click();
	}
	
	public void enterEnginePerformance(String enginePerformance) {
		txt_enginePerformance.sendKeys(enginePerformance);
	}
	
	public String getErrorMessageEnginrPerformancr() {
		return error_engineperformance.getText();
	}
	
	public List<String> getMakeDropDownvalue() {
		return cm.getMakeDropDownvalue(dd_make);
	}
	
	public void entervehiceData(HashMap<String, String> testData) throws Exception {
		cm.selectValueFromDropDown(dd_make, testData.get("Vehicle_Make"));
		System.out.println("***************"+testData.get("Vehicle_Make")+"***********");
		txt_enginePerformance.sendKeys(testData.get("Vehicle_Performance"));//"300"
		txt_dateofmanufacture.sendKeys("12/04/2022");//12/04/2022Vehicle_DOM

		cm.selectValueFromDropDown(dd_numberofseats,(int)Float.parseFloat(testData.get("Vehicle_NOS"))+"");//4 testData.get("Vehicle_NOS")
		
		cm.selectValueFromDropDown(dd_fuelType,testData.get("Vehicle_FuelType")); //Vehicle_FuelType "Electric Power"
		txt_Listprice.sendKeys(testData.get("Vehicle_ListPrice"));// "30000"
		txt_licenceplatenumber.sendKeys(testData.get("Vehicle_LPN")); //Vehicle_LPN 234565
		txt_annualmileaga.sendKeys(testData.get("Vehicle_AM"));//Vehicle_AM 900
		
	}
	
	public void clickOnButton() {
		btn_next.click();
	}

}
