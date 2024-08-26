package com.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OrangeHRM {
	
	
	public static String orangePerticularData(int rows, int column) throws InvalidFormatException, IOException {
		
		File file = new File("C:\\\\Users\\\\Administrator\\\\Documents\\\\DataDriven.xlsx");
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(rows);
		Cell cell = row.getCell(column);
		
		DataFormatter dataformatter = new DataFormatter();
		String formatCellValue = dataformatter.formatCellValue(cell);
		System.out.println(formatCellValue);
		
		return formatCellValue;
		
	}
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		
	}

}
