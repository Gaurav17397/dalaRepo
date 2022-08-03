package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class TestCase1 extends TestBase{
	
	@Test
	public void buyOrder() throws InterruptedException
	{
		
			Thread.sleep(2000);
			dash.enterCompanyName("wipro");
			Thread.sleep(1000);
			dash.ClickOnCompany();
			Thread.sleep(2000);
			trade.clickOnBuy();
			trade.enterBuyQuantity("2");
			trade.clickOnMainBuy();
			Thread.sleep(2000);
			String st = trade.getStatus();
			System.out.println(st);
			Assert.assertEquals(st, "Oder Created successfully");
		
		
	}
	
	
	@Test
	public void sellOrder() throws InterruptedException
	{
			Thread.sleep(2000);
			dash.enterCompanyName("WIPRO");
			Thread.sleep(2000);
			dash.ClickOnCompany();
			Thread.sleep(2000);
			trade.clickOnSell();
			trade.enterSellQuantity("1");
			trade.clickOnMainSell();
			Thread.sleep(2000);
			String st = trade.getStatus();
			System.out.println(st);
			Assert.assertEquals(st, "Order Created successfully");
		
	}

}
