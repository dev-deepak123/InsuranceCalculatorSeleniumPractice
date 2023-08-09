package testBase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.EnterInsuranceDataPageObjects;
import pageObjects.EnterProjectDataPageObjects;
import pageObjects.EnterVehicleDataPageObjects;
import pageObjects.HomePageObjects;
import pageObjects.SelectPriceoptionPageObjects;
import reusableComponents.CommonMethos;

public class ObjectRepo {
	
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static	 HomePageObjects homepage;
	public static EnterVehicleDataPageObjects vehData; 
	public static EnterInsuranceDataPageObjects insData;
	public static EnterProjectDataPageObjects proData;
	public static SelectPriceoptionPageObjects priceOptions;
	public  CommonMethos cm = new CommonMethos();
	 
}
