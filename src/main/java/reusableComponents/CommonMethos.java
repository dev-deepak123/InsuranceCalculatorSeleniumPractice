package reusableComponents;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethos {
	
	//select check boxes
	public void selectCheckBoxes(List<WebElement> element, String checks)
	{
		String[] checksArrays = checks.split(",");
		for(String str : checksArrays) {
			for(WebElement ele: element) {
				if(ele.getText().equalsIgnoreCase(str)) {
					ele.click();
					break;
				}
			}
		}
	}
	//select radio button
	public void selectDropDownOption(List<WebElement> element, String valueTOBeSelected) throws Exception
	{
		for(WebElement ref : element) {
			if(ref.getText().equalsIgnoreCase(valueTOBeSelected))
			ref.click();
			break;
		}
		
	}
	
	//take a list of the webelement and take the text and snd it into the list<string>
	public List<String> getMakeDropDownvalue(WebElement element) {
		Select os = new Select(element);
		List<WebElement> list_webElement_model = os.getOptions();
		List<String> actualContents = new ArrayList<String>();
		for(WebElement ref : list_webElement_model)
		{
			actualContents.add(ref.getText());
		}
		return actualContents;
	}
	
	//Select value from the dropDown
	public void selectValueFromDropDown(WebElement element, String valueTOBeSelected) throws Exception
	{
		Select os = new Select(element);
		try {
			os.selectByVisibleText(valueTOBeSelected);
		}catch(Exception e) {
			throw new Exception("Value is not present in dropdown for web element "+element+"value to be selected is"+valueTOBeSelected);
		}
		
	}

}
