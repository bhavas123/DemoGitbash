package Sample;
//1st mar
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcelFile 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f=new FileInputStream("C:\\Users\\Girish Prakash\\Desktop\\Selenium excel.xlsx");
		Workbook wb=WorkbookFactory.create(f);
		Sheet s=wb.getSheet("A");
		Row r=s.getRow(2);
		Cell c=r.getCell(0);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(c);
		System.out.println(value);
		
	}
}
