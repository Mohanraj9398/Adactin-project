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

public class ReadExcelData {
	
	
	public static String raedParticularCell(int rows, int column) throws InvalidFormatException, IOException {
		
		File file = new File("C:\\Users\\Administrator\\Documents\\DataDriven.xlsx");
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(rows);
		Cell cell = row.getCell(column);
		
		DataFormatter dataformatter = new DataFormatter();
		String formatCellValue = dataformatter.formatCellValue(cell);
		System.out.println(formatCellValue);
		
		return formatCellValue;
		
		// This is getSingle data value 		
		//	String name = cell.getStringCellValue();
		//	System.out.println(name);
		
	}
	
	public static void raedParticularRowMultipleCell() throws InvalidFormatException, IOException {
		
		File file = new File("C:\\Users\\Administrator\\Documents\\DataDriven.xlsx");
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
		
		short lastCellNumber = sheet.getRow(0).getLastCellNum();
		System.out.println(lastCellNumber);
		
		Row row = sheet.getRow(1);
		
		for (int i = 0; i < lastCellNumber; i++) {
			Cell cell = row.getCell(i);
			
			DataFormatter dataforemat = new DataFormatter();
			String formatCellValue = dataforemat.formatCellValue(cell);
			System.out.println(formatCellValue);
		}
		
	}
	
	public static void raedAllData() throws InvalidFormatException, IOException {
		
		File file = new File("C:\\Users\\Administrator\\Documents\\DataDriven.xlsx");
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
		
		short lastCellNumber = sheet.getRow(0).getLastCellNum();
		System.out.println("No Of Cells:"+lastCellNumber);
		
		int lastRowNumer = sheet.getLastRowNum();
		System.out.println("No Of Rows:"+lastRowNumer);
					
		for (int i = 1; i < lastRowNumer; i++) {
			for (int j = 0; j < lastCellNumber ; j++) {
				
				Cell cell = sheet.getRow(i).getCell(j);
				
				DataFormatter dataformatter = new DataFormatter();
				String formatdata = dataformatter.formatCellValue(cell);
				System.out.println(formatdata);
	}	
		
	}
	}
	public static void main(String[] args) throws InvalidFormatException, IOException {
			
//		raedParticularCell();
//		raedParticularRowMultipleCell();
		raedAllData();
		
		
	}

}
