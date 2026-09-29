package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws Exception {
		
		// 1. to mention the path of the excel file
		File excelfile = new File("C:\\Users\\user\\MavenProjectAug26\\src\\test\\resources\\Excelfiles\\datadriven1.xlsx");
		
		// 2. need to read the excel file
		FileInputStream fileInputStream = new FileInputStream(excelfile);
		
		// 3. need to read xlsx file - XSSFWorkbook
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		
		// 4. to mention the sheet name
		Sheet sheet = workbook.getSheet("testdata");
		
		// 5. to get the row
		Row row = sheet.getRow(0);
		
		// 6. to get the cell
		Cell cell = row.getCell(0);
		
		// 7. to print the cell data
		System.out.println(cell);
		
		// to read a particular row data
		Row row2 = sheet.getRow(2);
		
		// to read a cell data from a particular row
		int physicalNumberOfCells = row2.getPhysicalNumberOfCells();
		System.out.println(physicalNumberOfCells);
		
		for (int i = 0; i < row2.getPhysicalNumberOfCells(); i++) {
			Cell cell2 = row2.getCell(i);
			System.out.println(cell2);
		}
		System.out.println("-------------");
		
		// to print all the row and column - nested for loop
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row3 = sheet.getRow(i);
			
			for (int j = 0; j < row3.getPhysicalNumberOfCells(); j++) {
				
				Cell cell2 = row3.getCell(j);
				System.out.println(cell2);
			}
			
		}
		
		System.out.println("excel read completed");
		
		
		
		
		
	}

}
