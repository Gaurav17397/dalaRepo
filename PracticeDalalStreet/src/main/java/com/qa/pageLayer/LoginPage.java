package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LoginPage extends TestBase{
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	//enter email
	@FindBy(xpath="//input[@name='email']")
	private WebElement enter_Email;
	
	public void enterEmail(String email)
	{
		enter_Email.sendKeys(email);
	}
	
	//enter password
	@FindBy(xpath="//input[@name='password']")
	private WebElement enter_Password;
		
	public void enterPassword(String password)
	{
		enter_Password.sendKeys(password);
	}
	
	//click on log in
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']")
	private WebElement click_OnLogin;
		
	public void clickOnLogin()
	{
		click_OnLogin.click();
	}
	

}
