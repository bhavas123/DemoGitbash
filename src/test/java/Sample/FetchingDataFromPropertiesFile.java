package Sample;
//27th feb
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchingDataFromPropertiesFile 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
//		FileInputStream f=new FileInputStream("C:\\Users\\Girish Prakash\\Desktop\\Sample.properties");
//		Properties p=new Properties();
//		p.load(f);
//		String value=p.getProperty("url");
//		String UN=p.getProperty("username");
//		String PW=p.getProperty("pw");
//		driver.get(value);
//		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys(UN, Keys.TAB,PW,Keys.ENTER);
		PropertiesUtility p=new PropertiesUtility();
		String value=p.getDataFromPropertiesFile("url");
		driver.get(value);
		String UN=p.getDataFromPropertiesFile("username");
		String PW=p.getDataFromPropertiesFile("pw");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UN,Keys.TAB,PW,Keys.ENTER);
	}
}
