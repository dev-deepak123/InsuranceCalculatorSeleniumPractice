package testBase;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.EnterInsuranceDataPageObjects;
import pageObjects.EnterProjectDataPageObjects;
import pageObjects.EnterVehicleDataPageObjects;
import pageObjects.HomePageObjects;
import pageObjects.SelectPriceoptionPageObjects;
import reusableComponents.PropertiesOperation;

public class TestBase extends ObjectRepo{
	
    
	public void launchBrowserAndNavigate() throws Exception {
		
		String browser = PropertiesOperation.getPropertyValueByKey("browser");
		String url = PropertiesOperation.getPropertyValueByKey("url");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver  = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please choose browser");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
		driver.manage().window().maximize();
		
		driver.get(url);
	
	}
	
	@BeforeMethod // it will execute before each test method whitin current class
	public void setupMethod() throws Exception {
		launchBrowserAndNavigate();
		 homepage = new HomePageObjects();
		 vehData = new EnterVehicleDataPageObjects();
		 insData = new EnterInsuranceDataPageObjects();
		 proData = new EnterProjectDataPageObjects();
		 priceOptions = new SelectPriceoptionPageObjects();
	}
	
	@AfterMethod
	public void cleanUp() {
		driver.quit();
	}

}
