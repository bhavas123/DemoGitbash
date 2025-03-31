package genericUtility;
//3rd mar
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	/**
	 * This is a generic method to fetch a cell data from excel file
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String getDataFromExcelFile(String sheetName, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream f=new FileInputStream(IPathUtility.excelPathDemo);
		Workbook w=WorkbookFactory.create(f);
		Sheet s=w.getSheet(sheetName);
		Row r=s.getRow(rowIndex);
		Cell c=r.getCell(cellIndex);
		DataFormatter d=new DataFormatter();
		String value=d.formatCellValue(c);
		return value;
		
	}
	
	public List<String> getMultipleDAtaFormatExcelFile(String sheetName, int startRowIndex, int startCellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\Girish Prakash\\Desktop\\Selenium excel.xlsx");
		Workbook w=WorkbookFactory.create(f);
		Sheet s=w.getSheet(sheetName);
		DataFormatter d=new DataFormatter();
		List<String> a1=new ArrayList<String>();
		for(int i=startRowIndex; i<s.getLastRowNum(); i++)
		{
			Row r=s.getRow(i);
			for(int j=startCellIndex; j<r.getLastCellNum(); j++)
			{
				Cell c=r.getCell(j);
				String value=d.formatCellValue(c);
				a1.add(value);
			}
		}
		return a1;
	}
	
	
}
