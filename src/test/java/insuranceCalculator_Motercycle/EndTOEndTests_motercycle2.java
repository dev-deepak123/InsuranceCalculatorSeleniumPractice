package insuranceCalculator_Motercycle;

import java.util.HashMap;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import reusableComponents.ExcelOperations;
import testBase.TestBase;

public class EndTOEndTests_motercycle2 extends TestBase {
	
	ExcelOperations excel = new ExcelOperations("Sheet1");
	@Test
	public void insuranceCalculateBMW() throws Exception {
		
		HashMap<String, String> testData = excel.getTestDataInMap(1);
		test.log(Status.INFO, "Test data Info for execution"+testData);
			homepage.clickautomobile();
			vehData.entervehiceData(testData);
			vehData.clickOnButton();
			insData.enterInsuranceData();
			insData.clickOnNextButton();
			proData.enterProjectData();
			proData.clickOnButton();
			String expectedSilverPlanePrice = "231.00";
			String actual = priceOptions.getPriceForSelectedOption("Silver");
			Assert.assertEquals(expectedSilverPlanePrice, actual);
			priceOptions.selectPriceForRespectiveplan("Silver");
			priceOptions.clickOnNextButton();

	}
	
	@Test
	public void insuranceCalculateVolvo() throws Exception {
		
		HashMap<String, String> testData = excel.getTestDataInMap(1);
		test.log(Status.INFO, "Test data Info for execution"+testData);
			homepage.clickautomobile();
			vehData.entervehiceData(testData);
			vehData.clickOnButton();
			insData.enterInsuranceData();
			insData.clickOnNextButton();
			proData.enterProjectData();
			proData.clickOnButton();
			String expectedSilverPlanePrice = "231.00";
			String actual = priceOptions.getPriceForSelectedOption("Silver");
			Assert.assertEquals(expectedSilverPlanePrice, actual);
			priceOptions.selectPriceForRespectiveplan("Silver");
			priceOptions.clickOnNextButton();

	}
	

}
