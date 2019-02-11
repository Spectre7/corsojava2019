package com.overnet.excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		Workbook workbook = new XSSFWorkbook();
		

		Sheet sheet = workbook.createSheet("Employee");
		
		Row headerRow = sheet.createRow(0);
		
		Cell cell = headerRow.createCell(0);
		
		cell.setCellValue("hello");
		
		FileOutputStream fileOut = new FileOutputStream("poi-generated-file.xlsx");
        workbook.write(fileOut);
        fileOut.close();

        // Closing the workbook
        workbook.close();
        
        System.out.println("completed");
	}
	
	
	private static List<String> getPaths() throws FileNotFoundException{
		ArrayList<String> paths = new ArrayList<String>();
		
		String fileIn = "path.dat";
		
		FileReader fileReader = new FileReader("");
		
		return null;
	}

}

