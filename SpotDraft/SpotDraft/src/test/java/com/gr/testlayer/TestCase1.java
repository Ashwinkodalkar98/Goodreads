package com.gr.testlayer;

import org.testng.annotations.Test;

import com.gr.testbase.TestBase;

public class TestCase1 extends TestBase {
	
	@Test
	public void checkWantToReadFunctionality() throws InterruptedException
	{
		hp.clickOnSignInLink();
		se.clickOnSignInWithMail();
		se.enterEmail();
		se.enterPassward();
		Thread.sleep(2000);
		se.clickOnSignInButton();
		hp2.enterBookName();
		bp.clickOnWantToRead();
		Thread.sleep(10000);
		bp.clickOnMyBookLink();
		Thread.sleep(10000);
		mp.clickOnRemoveBook();
		Thread.sleep(4000);
		mp.clickOnUserProfile();
		mp.clickOnSignOut();
		
	}

}
