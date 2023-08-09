package insuranceCalculator_Motercycle;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import testBase.TestBase;

public class ErrorTests_motercycle extends TestBase {
	
	@Test(enabled=false)
	public void errorMessage_PayLoadField() throws Exception{
		homepage.link_automobile.click();
		vehData.enterEnginePerformance("300");
		test.log(Status.PASS, "Engine performance is filled with data 300");
		String actualErrorMessage = vehData.getErrorMessageEnginrPerformancr();
		String expectedErrorMessage ="dummy";
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage,"Error message is not as expected on engine performance field");
	}
	
	@Test(enabled=false)
	public void errorMessage_PayLoadField1() throws Exception{
		homepage.link_automobile.click();
		vehData.enterEnginePerformance("300000");
		test.log(Status.PASS, "Engine performance is filled with data 300");
		String actualErrorMessage = vehData.getErrorMessageEnginrPerformancr();
		String expectedErrorMessage ="dummy";
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage,"Error message is not as expected on engine performance field");
	}
	
	@Test(enabled=true)
	public void verifyMakeDropdownOptns() {
		//click on  automobile link
		homepage.link_automobile.click();
		//get Dropdown content
		List<String> actualValues = vehData.getMakeDropDownvalue();
	//	test.log(Status.INFO,"Actual dd contents for model dd is : "+ actualValues);
		//expected values
		List<String> expectedValues = Arrays.asList("– please select –","Audi","BMW","Ford","Honda","Mazda","Mercedes Benz","Nissan","Opel","Porsche","Renault","Skoda","Suzuki","Toyota","Volkswagen","Volvo");
		test.log(Status.INFO,"expected dd contents for model dd is : "+ expectedValues);
		//campare
		Assert.assertEquals(actualValues, expectedValues,"Error in dropdown compare");
	}

}
