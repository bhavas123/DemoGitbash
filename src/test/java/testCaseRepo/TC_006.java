package testCaseRepo;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepo.ContactsPage;
import ObjectRepo.CreateNewContactPage;
import ObjectRepo.HomePage;
import genericUtility.BaseClass;


public class TC_006 extends BaseClass
{
	@Test (groups= {"smoke", "regression"})
	public void Con_001() throws EncryptedDocumentException, IOException
	{
		HomePage hp= new HomePage(driver);
		hp.clickOnContactMenu();
		
		ContactsPage cp= new ContactsPage(driver);
		cp.clickonCreateingNewContactIcon();
		
		String lname= eUtil.getDataFromExcelFile("Contacts", 5, 1);
		String email= eUtil.getDataFromExcelFile("Contacts", 5, 2);
		String mobile= eUtil.getDataFromExcelFile("Contacts", 5, 3);
		String mailingCity= eUtil.getDataFromExcelFile("Contacts", 5, 4);
		String mailingState= eUtil.getDataFromExcelFile("Contacts", 5, 5);
		String mailingCountry= eUtil.getDataFromExcelFile("Contacts", 5, 6);
		CreateNewContactPage cncp= new CreateNewContactPage(driver);
		
	}
}