package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PomExcelData {

	public static String[][] readData(String fileName) throws IOException {

		
		
		/*setup the path for workbook*/
	XSSFWorkbook wbook =new XSSFWorkbook("./Data/"+fileName+".xlsx");

		/* Specific sheet*/
	XSSFSheet wsheet = wbook.getSheet("Sheet1");

		/*Row Count*/
	int rowCount = wsheet.getLastRowNum();

		/*Column Count*/
	short columnCount = wsheet.getRow(0).getLastCellNum();
	
		/*Declare 2D String Array*/
	String[][] data = new String[rowCount][columnCount];
	
		/*loop*/

	for (int i =1; i <=rowCount ; i++) {
		
		 for (int j = 0; j <columnCount ; j++) {
			 
			String stringCellValue = wsheet.getRow(i).getCell(j).getStringCellValue();
		    data[i-1][j]=stringCellValue;
		    
		 }
	}
	
	/*Close the workbook*/
		wbook.close();
		return data;
	

}

}
