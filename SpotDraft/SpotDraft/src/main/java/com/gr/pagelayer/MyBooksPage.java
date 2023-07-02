package com.gr.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gr.testbase.TestBase;

public class MyBooksPage extends TestBase {
	
	
	public MyBooksPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[contains(@class,'actionLinkLite smallText deleteLink')])[1]")
	private WebElement remove_book;
	
	public void clickOnRemoveBook() throws InterruptedException
	{
		remove_book.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	}
	
	@FindBy (xpath="//a[contains(@class,'dropdown__trigger dropdown__trigger--profileMenu')]")
    private WebElement user_profile;
	
	public void clickOnUserProfile()
	{
		user_profile.click();
	}
	
	@FindBy (xpath="(//a[contains(text(),'Sign out')])[1]")
	private WebElement sign_out;
	
	public void clickOnSignOut()
	{
		 sign_out.click();
		
	}
	
	
	
	
}
