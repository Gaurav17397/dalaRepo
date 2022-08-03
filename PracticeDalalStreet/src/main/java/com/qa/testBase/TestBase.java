package com.qa.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.qa.pageLayer.DashBoardPage;
import com.qa.pageLayer.LoginPage;
import com.qa.pageLayer.TradingPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
     public static WebDriver driver;
     public LoginPage login;
     public static Actions act;
     public DashBoardPage dash;
     public TradingPage trade;
     public  static  Logger logger;
	
     @BeforeClass
     public void start()
     {
    	logger=Logger.getLogger("automation");
    	PropertyConfigurator.configure("Log4j.properties");
    	 logger.info("test execution starts");
     }
     @AfterClass
     public void end()
     {
    	 logger.info("test execution completed");
     }
     
     
     
	@BeforeMethod
	public void setup()
	{
		String br="chrome";
		if(br.equalsIgnoreCase("chrome"))
		{       
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    logger.info("chrome launches");
			
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
		    driver=new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
		    driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Select correct browser from chrome,firefox,edge");
		}
		
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
	
		//login
		login=new LoginPage();
		login.enterEmail("aarushgangurde@gmail.com");
		login.enterPassword("123456789");
		login.clickOnLogin();
		
		//objects
		act=new Actions(driver);
		dash=new DashBoardPage();
		trade=new TradingPage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
