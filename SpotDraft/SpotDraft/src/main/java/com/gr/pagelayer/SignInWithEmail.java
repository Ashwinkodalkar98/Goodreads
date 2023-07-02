package com.gr.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gr.testbase.TestBase;

public class SignInWithEmail extends TestBase {
	
	
	public SignInWithEmail()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[contains(text(),'Sign in with email')]")
	private WebElement sign_in_with_mail;
	
	public void clickOnSignInWithMail()
	{
		sign_in_with_mail.click();
	}
	
	@FindBy(xpath="//input[contains(@id,'ap_email')]")
	private WebElement email;
	
	public void enterEmail ()
	{
		email.sendKeys("ashwinkodalkar898@gmail.com");
	}
	
	@FindBy(xpath="//input[contains(@id,'ap_password')]")
	private WebElement passward ;
	
	public void enterPassward ()
	{
		passward.sendKeys("Ashwin@123");
	}
	
	@FindBy(xpath="//span[contains(text(),'Sign in')]")
	private WebElement sign_in_button ;
	
	public void clickOnSignInButton ()
	{
		sign_in_button.submit();
	}
	

}
