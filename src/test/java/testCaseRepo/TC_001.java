package testCaseRepo;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import genericUtility.BaseClass;


@Listeners(genericUtility.ListenersImplementation.class)
public class TC_001 extends BaseClass
{
	@Test(groups= {"Smoke", "Regression"})
	public void Leads_001() throws EncryptedDocumentException, IOException
	{
		HomePage hp=new HomePage(driver);
		hp.clickLeadsMenu();
		
		LeadsPage lep= new LeadsPage(driver);
		lep.clickOnLeadsPageIcon();
		
		String fname =eUtil.getDataFromExcelFile("Leads", 2, 1);
		String lname =eUtil.getDataFromExcelFile("Leads", 2, 2);
		String company =eUtil.getDataFromExcelFile("Leads", 2, 3);
		//Assert.fail();
		
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.createNewLead(fname, lname, company);
		
		
	}

}