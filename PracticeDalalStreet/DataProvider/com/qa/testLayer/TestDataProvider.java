package com.qa.testLayer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.qa.pageLayer1.BaseClass1;
import com.qa.pageLayer1.ExcelReadData;

public class TestDataProvider extends BaseClass1{
	
	
	@Test(dataProvider="logindata")
	public void login(String username,String password)
	{
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	
	@DataProvider(name="logindata")
	public String[][] getData() throws IOException
	{
		ExcelReadData read=new ExcelReadData();
		int r = read.getRowCount("Sheet1");
		int c = read.getCellCount("Sheet1", 1);
		
		String [][]logindata=new String[r][c];
		
		for(int i=1;i<=r;i++)
		{
			for(int j=0;j<c;j++)
			{
				logindata[i-1][j]=read.getReadData("Sheet1", i, j);
			}
		}
		return logindata;
	}
	

}
