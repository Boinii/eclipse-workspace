package Com.Exceloperations;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class examples {
	
	public static void main(String[] args){
		// Identify the file(Excel File) of the System
		FileInputStream testDataFile = new FileInputStream("C:\\\\Users\\\\boini\\\\OneDrive\\\\文档\\\\Myfirst.xlsx");

		// Identify the WorkBook in the file
		XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);

		// Identify a Particular Sheet in the workBook
		XSSFSheet testDataSheet = workBook.getSheet("TestData");

		// Identify the number of Active Rows in the Sheet
		int rowCount=testDataSheet.getLastRowNum();


		// for Going to every Active Row in the Sheet
		for(int rowIndex=0;rowIndex<=rowCount;rowIndex++) // for active Rows
		{
		// Going to a Particular Row 
		Row testDataRow=testDataSheet.getRow(rowIndex);

		// In the Current row - finding the Number of Active Cells
		int rowOfCellsCount=testDataRow.getLastCellNum();

		// To goto Every Active Row of All the Active Cells 
		for(int rowOfCell=0;rowOfCell<rowOfCellsCount;rowOfCell++)
		{
		// going to an Active Row of an Active Cell
		Cell testDataRowOfActiveCell=testDataRow.getCell(rowOfCell);

		// getting the data from the Active Row of an Active Cell
		String testData=testDataRowOfActiveCell.getStringCellValue();

		// print the data
		System.out.print(testData+" | ");

		}
		System.out.println();

	}		
}
