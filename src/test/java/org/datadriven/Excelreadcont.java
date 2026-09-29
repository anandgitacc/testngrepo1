package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelreadcont {
	
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
		
		// to print all the row and column - nested for loop
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row3 = sheet.getRow(i);
			for (int j = 0; j < row3.getPhysicalNumberOfCells(); j++) {
				Cell cell2 = row3.getCell(j);
//				System.out.println(cell2);
				
				int cellType = cell2.getCellType();
				System.out.println(cellType);
				
				// cellType == 1 - string value
				if (cellType==1) {
					String stringCellValue = cell2.getStringCellValue();
					System.out.println(stringCellValue);
				}
				
				// cellType == 0 -> numbers / also date = 03-Sep-2026
				else if (cellType==0) {
					
					if (DateUtil.isCellDateFormatted(cell2)) {
						Date dateCellValue = cell2.getDateCellValue();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
						String datevalue = dateFormat.format(dateCellValue);
						System.out.println(datevalue);
					}
					else {
					double numericCellValue = cell2.getNumericCellValue();
					long longvalue = (long) numericCellValue;
					String valueOf = String.valueOf(longvalue);
					System.out.println(valueOf);
					}
				}
			}
		}
		
		System.out.println("excel read completed");
		
		
		
		
		
	}

}
