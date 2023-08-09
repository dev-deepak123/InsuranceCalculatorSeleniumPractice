package insuranceCalculator_Motercycle;

import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import reusableComponents.ExcelOperations;
import testBase.TestBase;

public class EndTOEndTests_motercycle extends TestBase {
	
	ExcelOperations excel = new ExcelOperations("Sheet1");
	@SuppressWarnings("unchecked")
	@Test(dataProvider="vehData")
	public void insuranceCalculate(Object obj1) throws Exception {
		
		HashMap<String, String> testData = (HashMap<String, String>) obj1;
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
	
	//data provider method ===> return object array
	@DataProvider(name = "vehData")
	public Object[][] testDataSupplier() throws EncryptedDocumentException, IOException{
		Object[][] obj =  new Object[excel.getRowCount()-1][1];
		
		for(int i=1;i<excel.getRowCount();i++) {
			HashMap<String , String> testData = excel.getTestDataInMap(i);
			obj[i-1][0] = testData;
		}
			
		
		return obj;
	}
	

}
