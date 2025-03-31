package testCaseRepo;

import org.testng.annotations.Test;

import ObjectRepo.ContactsPage;
import ObjectRepo.CreateNewContactPage;
import ObjectRepo.HomePage;
import genericUtility.BaseClass;

public class TC_004 extends BaseClass{
	@Test(groups= {"smoke"})
	public void CON_001()throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnContactMenu();
		
		ContactsPage cp=new ContactsPage(driver);
		cp.clickonCreateingNewContactIcon();
		
		String fName=eUtil.getDataFromExcelFile("contacts", 2, 1);
		String lName=eUtil.getDataFromExcelFile("contacts", 2, 2);
		String title=eUtil.getDataFromExcelFile("contacts", 2, 3);
		
		CreateNewContactPage cncp=new CreateNewContactPage(driver);
		cncp.createNewContact(fName, lName, title);
	}

}
