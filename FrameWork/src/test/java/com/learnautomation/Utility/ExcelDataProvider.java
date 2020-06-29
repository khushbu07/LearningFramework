package com.learnautomation.Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;




//method overloading is in this class for getStringdata method-same method name but type of argument different


    public class ExcelDataProvider {
	XSSFWorkbook wb;

	public ExcelDataProvider() {

		File src = new File("./TestData/Data.xlsx");
		try {

			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		}

		catch (Exception e) {

			System.out.println("Unable to read Excel file" + e.getMessage());

		}
	}
	public String getStringData(int sheetindex, int row, int column) {

		return wb.getSheetAt(sheetindex).getRow(0).getCell(0).getStringCellValue();

	}
	
	
	public String getStringData(String sheetName, int row, int column) {

		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();

	}

	public double getNumricData(String sheetName, int row, int column) {

		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}

	}

	
