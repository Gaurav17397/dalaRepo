package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class TradingPage extends TestBase {
	
	
	
	public TradingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//click on buy trade
	
	//click on buy
	@FindBy(xpath="//a[contains(text(),'Buy')]")
	private WebElement buy_Button;
	
	public void clickOnBuy()
	{
		buy_Button.click();
	}
	
	//enter quantity
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement enter_Quantity;
	
	public void enterBuyQuantity(String qty)
	{
		enter_Quantity.sendKeys(qty);
	}
	
	//click on main buy
	
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement buy_Button1;
	
	public void clickOnMainBuy()
	{
		buy_Button1.click();
	}
	
	
	//sell trade 
	
	//click on sell
		@FindBy(xpath="//a[contains(text(),'Sell')]")
		private WebElement sell_Button;
		
		public void clickOnSell()
		{
			sell_Button.click();
		}
		
		//enter quantity
		@FindBy(xpath="//input[@id='quantity']")
		private WebElement enter_Quantity1;
		
		public void enterSellQuantity(String qty)
		{
			enter_Quantity1.sendKeys(qty);
		}
		
		//click on main buy
		
		@FindBy(xpath="//button[contains(text(),'Sell')]")
		private WebElement sell_Button1;
		
		public void clickOnMainSell()
		{
			sell_Button1.click();
		}
	
		//status
		@FindBy(xpath="//div[contains(text(),'Order Created successfully')]")
		private WebElement get_Status;
		public String getStatus()
		{
			String status = get_Status.getText();
			return status;
		}
	
	

}
