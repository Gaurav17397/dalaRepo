package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class DashBoardPage extends TestBase {
	
	public DashBoardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//search company name
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement enter_CompanyName;
	
	public void enterCompanyName(String companyName)
	{
		enter_CompanyName.sendKeys(companyName);
	}
	
	//click on company
	@FindBy(partialLinkText="WIPRO")
	private WebElement Click_OnCompany;
	
	public void ClickOnCompany()
	{
		act.moveToElement(Click_OnCompany).click().build().perform();
	}

}
