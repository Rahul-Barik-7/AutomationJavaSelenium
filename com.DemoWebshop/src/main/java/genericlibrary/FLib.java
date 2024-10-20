package genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FLib 
{
	
	public String getDataFromProperty(String path, String key) throws IOException
	{
		FileInputStream f = new FileInputStream(path);
		Properties p = new Properties();
		p.load(f);
		return p.getProperty(key);
		
	}
	public String getDataFromExelFile(String path,String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream f=new FileInputStream(path);
		Workbook book = WorkbookFactory.create(f);
		Sheet row = book.getSheet(sheetName);
		return row.getRow(rowNo).getCell(cellNo).getStringCellValue();
	}


}