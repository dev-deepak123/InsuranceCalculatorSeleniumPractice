package reusableComponents;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

public class PropertiesOperation {
	
	static Properties prop = new Properties();
	public static String getPropertyValueByKey(String key) throws Exception
	{
								//for getting the project directory
		String  path = System.getProperty("user.dir")+"/src/test/resources/config.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		
		String value = prop.get(key).toString();
		if(StringUtils.isEmpty(value)) {
			throw new Exception("Value is not specified for key:  "+key   +  " in the properties file");
		}
		return value;
	}

}
