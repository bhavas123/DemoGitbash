package genericUtility;
//28th feb
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This is an utility class which deals with Properties file
 * @author Girish Prakash
 * @version 28.02.25
 */

public class PropertiesUtility 
{
	/**
	 * This is a generic method to fetch a data from properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getDataFromPropertiesFile(String key) throws IOException
	{
		FileInputStream f=new FileInputStream(IPathUtility.propertiesPath);
		Properties p=new Properties();
		p.load(f);
		String value=p.getProperty(key);
		return value;
	}
}
