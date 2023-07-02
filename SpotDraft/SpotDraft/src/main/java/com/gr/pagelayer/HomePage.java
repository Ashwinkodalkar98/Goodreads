package com.gr.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gr.testbase.TestBase;

public class HomePage extends TestBase {
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Sign In')]") 
	private WebElement sign_in;
	
	public void clickOnSignInLink()
	{
		sign_in.click();
	}
}
