package commonlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getExcelData(String excellpath,String sheetName,int row,int col) throws Throwable{
		FileInputStream fils = new FileInputStream(excellpath);
		Workbook wb = WorkbookFactory.create(fils);
		 String value = wb.getSheet(sheetName).getRow(row).getCell(col).toString();
		 return value;
		
	}
	
	public int getLastrowcount(String excellpath,String sheetName) throws Throwable{
		FileInputStream fils = new FileInputStream(excellpath);
		Workbook wb = WorkbookFactory.create(fils);
		int lastRowNum = wb.getSheet(sheetName).getLastRowNum();
		return lastRowNum;
	}
	
	public void writeCellData(String excellpath,String sheetName,int row,int cell,String data) throws Throwable{
		FileInputStream fils = new FileInputStream(excellpath);
		Workbook wb = WorkbookFactory.create(fils);
		wb.getSheet(sheetName).getRow(row).createCell(cell).setCellValue(data);
		
		FileOutputStream filo = new FileOutputStream(excellpath);
		wb.write(filo);
		
	}

}
