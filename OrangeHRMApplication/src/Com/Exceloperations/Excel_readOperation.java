package Com.Exceloperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Excel_readOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream testdata=new FileInputStream("C:\\Users\\boini\\OneDrive\\文档\\Myfirst.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(testdata);
	XSSFSheet sheetoftest=workbook.getSheet("Myfirstexcelsheet");
	XSSFRow rowofsheet=sheetoftest.getRow(0);
	XSSFCell cellofrow=rowofsheet.getCell(0);
	String Testdata=cellofrow.getStringCellValue();
	System.out.println(Testdata);
	
	}

}
