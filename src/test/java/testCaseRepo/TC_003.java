package testCaseRepo;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import genericUtility.BaseClass;



public class TC_003 extends BaseClass
{
	@Test(groups= {"smoke", "sanity"})
	public void Leads_003() throws EncryptedDocumentException, IOException
	{
		HomePage hp=new HomePage(driver);
		hp.clickLeadsMenu();
		
		LeadsPage lep=new LeadsPage(driver);
		lep.clickOnLeadsPageIcon();
		
		String lname= eUtil.getDataFromExcelFile("Leads", 8, 1);
		String company=eUtil.getDataFromExcelFile("Leads", 8, 2);
		String leadsSource = eUtil.getDataFromExcelFile("Leads", 8, 3);
		String noOfEmployees =eUtil.getDataFromExcelFile("Leads", 8, 4);
		String city = eUtil.getDataFromExcelFile("Leads", 8, 5);
		String state = eUtil.getDataFromExcelFile("Leads", 8, 6);
		String country = eUtil.getDataFromExcelFile("Leads", 8, 7);
		
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lname, company, leadsSource, noOfEmployees, city, country, state);
		
	}
	@Test
	public void sample()
	{
		System.out.println("IDK");
	}
}