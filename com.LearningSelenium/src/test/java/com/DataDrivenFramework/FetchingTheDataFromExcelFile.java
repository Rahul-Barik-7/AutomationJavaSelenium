package com.DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingTheDataFromExcelFile {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
			//create the object of FileInputStream class
		 	FileInputStream f=new FileInputStream("./src/test/resources/TestData/Data.xlsx");
		 	
		 	//open the workbook in readable mode
		 	Workbook book = WorkbookFactory.create(f);
		 	
		 	//get the sheet
		 	Sheet sheet = book.getSheet("Data");
		 	
		 	//get the row
		 	Row row = sheet.getRow(1);
		 	
		 	//get the cell
		 	Cell username = row.getCell(0);
		 	System.out.println(username);
		 	
		 	Cell password = row.getCell(1);
		 	System.out.println(password);
		 	
		 	Cell empid = row.getCell(2);
		 	System.out.println(empid);
	}
}
