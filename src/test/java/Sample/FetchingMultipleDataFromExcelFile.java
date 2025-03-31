package Sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class FetchingMultipleDataFromExcelFile 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		ExcelUtility e=new ExcelUtility();
		List<String> value=e.getMultipleDAtaFormatExcelFile("Birds", 1, 0);
		System.out.println(value);
		
	}
}
