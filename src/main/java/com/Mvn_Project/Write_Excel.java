package com.Mvn_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {
	
	private static void Write_Data() throws Throwable {
		
		File f = new File("C:\\Users\\D.PRIYA\\eclipse-workspace\\Mvn_Project\\Excel\\Write_excel.xlsx");

		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("data").createRow(0).createCell(0).setCellValue("username");
		wb.getSheet("data").getRow(0).createCell(1).setCellValue("password");
		wb.getSheet("data").createRow(1).createCell(0).setCellValue("ID");
		wb.getSheet("data").getRow(1).createCell(1).setCellValue("password");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);		
	}

	public static void main(String[] args) throws Throwable {
		Write_Data();
	}
}
