package com.gr.pagelayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gr.testbase.TestBase;

public class HomePage2 extends TestBase {
	
	
	public HomePage2()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[contains(@name,'q')])[1]")
	private WebElement search_books;
	
	public void enterBookName()
	{
		search_books.sendKeys("Elon Musk"+Keys.ENTER);
	}

}
