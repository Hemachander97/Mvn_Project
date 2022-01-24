package com.Mvn_Project;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {
	private static void data_Readexcel() throws Throwable {

		File f =  new File("C:\\Users\\D.PRIYA\\eclipse-workspace\\Mvn_Project\\Excel\\Read_Excel.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook b = new XSSFWorkbook(fis);

		Sheet sheetAt = b.getSheetAt(0);

		Row row = sheetAt.getRow(2);

		Cell cell = row.getCell(1);

		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {

			String string = cell.getStringCellValue();
			System.out.println(string);

		}
		else if (cellType.equals(CellType.NUMERIC)) {

			double value = cell.getNumericCellValue();
			int val = (int)value;

			System.out.println(val);



		}
	}

	public static void main(String[] args) throws Throwable {

		data_Readexcel();
	}
}









