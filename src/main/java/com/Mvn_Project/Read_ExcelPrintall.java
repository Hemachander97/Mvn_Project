package com.Mvn_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_ExcelPrintall {
	
	private static void data_Read() throws IOException {

		File f = new File("C:\\Users\\D.PRIYA\\eclipse-workspace\\Mvn_Project\\Excel\\Read_Excel.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
	    for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
	    	
	    	Row row = sheetAt.getRow(i);
			
	    	//System.out.println(row);
	    	
	    	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
	    		
	    		Cell cell = row.getCell(j);
	    		
	    		//System.out.println(cell);
	    		
	    		CellType cellType = cell.getCellType();
				
	    		if (cellType.equals(CellType.STRING)) {
	    			
	    			String string = cell.getStringCellValue();
	    			
	    			System.out.println(string);
	    		}	
	    			else if (cellType.equals(CellType.NUMERIC)) {
	    				
	    				double value = cell.getNumericCellValue();
	    				
						int val =(int) value;
					
					System.out.println(val);
				}
			}
	    	
	    	
		}
	    
		
	}
	public static void main(String[] args) throws Throwable {
		 data_Read();
	}
	
	

}
