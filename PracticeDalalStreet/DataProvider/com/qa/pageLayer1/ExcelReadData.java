package com.qa.pageLayer1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadData {
	
	public String path="C:\\Users\\hp\\eclipse-workspace\\PracticeDalalStreet\\DataProvider\\com\\qa\\pageLayer1\\saucelabs.xlsx";
	
	public String getReadData(String sheet1,int r,int c) throws IOException
	{
		
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet(sheet1);
		String data = sheet.getRow(r).getCell(c).getStringCellValue();
		return data;
	}
	
	public int getRowCount(String sheet1) throws IOException
	{
		
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet(sheet1);
		int row = sheet.getLastRowNum();
		return row;
	}
	
	public  int getCellCount(String sheet1,int r) throws IOException
	{
		
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet(sheet1);
		int cell = sheet.getRow(r).getLastCellNum();
		return cell;
	}
	

}
