package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.qa.testBase.TestBase;

public class Util extends TestBase {
	
	
	public static void screenshot(String filename)
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\hp\\eclipse-workspace\\PracticeDalalStreet\\screenshots\\";
		
		File des=new File(path+filename+System.currentTimeMillis()+".png");
		try 
		{
			FileHandler.copy(src, des);
		} catch (IOException e) {
			
		}
	}
	
	
	
	

}
