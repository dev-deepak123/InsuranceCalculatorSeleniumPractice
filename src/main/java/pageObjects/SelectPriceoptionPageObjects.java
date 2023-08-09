package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class SelectPriceoptionPageObjects extends TestBase{
	
	@FindBy(xpath="//*[@id='nextsendquote']")
	public WebElement btn_Next;
	
	public SelectPriceoptionPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	//to get price based on selected option
	public String getPriceForSelectedOption(String plan) {
		String dataxPath="//table[@id='priceTable']//tr[1]//td[@data-label='"+plan+"']//span";
		return (String)driver.findElement(By.xpath(dataxPath)).getText();
		
	}
	
	//select price option
	public void selectPriceForRespectiveplan(String plan)
	{
		String xapth="//input[@name='Select Option' and @value='"+plan+"']/following-sibling::span";
		driver.findElement(By.xpath(xapth)).click();;
	}
	
	public void clickOnNextButton() {
		btn_Next.click();
	}

}
