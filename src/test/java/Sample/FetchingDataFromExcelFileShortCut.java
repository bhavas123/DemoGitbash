package Sample;
//3rd mar
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import genericUtility.ExcelUtility;

public class FetchingDataFromExcelFileShortCut 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		ExcelUtility e=new ExcelUtility();
		String value=e.getDataFromExcelFile("Info", 1, 1 );
		String value1=e.getDataFromExcelFile("Birds", 1, 1);
		System.out.println(value);
		System.out.println(value1);
		String value2=e.getDataFromExcelFile("Designation", 1, 1);
		System.out.println(value2);
	}
}
