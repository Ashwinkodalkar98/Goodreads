package com.gr.pagelayer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gr.testbase.TestBase;

public class BookDetailPage extends TestBase {
	
	
	public BookDetailPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[contains(text(),'Want to Read')])[1]")
	private WebElement want_to_read;
	
	public void clickOnWantToRead()
	{
		want_to_read.click();
	}
	
	@FindBy(xpath="(//a[contains(text(),'My Books')])[1]")
	private WebElement mybook_link;
	
	public void clickOnMyBookLink()
	{    		
		mybook_link.click();
		
	}
	

}
