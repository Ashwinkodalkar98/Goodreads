package com.gr.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.gr.pagelayer.BookDetailPage;
import com.gr.pagelayer.HomePage;
import com.gr.pagelayer.MyBooksPage;
import com.gr.pagelayer.SignInWithEmail;
import com.gr.pagelayer.HomePage2;

public class TestBase {
	
	
	public static WebDriver driver;
    public HomePage hp;
    public SignInWithEmail se;
    public HomePage2 hp2;
    public BookDetailPage bp;
    public MyBooksPage mp;
    
	@BeforeMethod
	public void setup()
	{
		
		String br = "Chrome"; 
		if(br.equalsIgnoreCase("Chrome"))
		{
			  driver = new ChromeDriver();
	    }
		else if(br.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("prvide correct browser");
		}
		
		driver.get("https://www.goodreads.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Object repository
		
		hp = new HomePage();
		se = new SignInWithEmail();
		hp2 = new HomePage2();
		bp = new BookDetailPage();
		mp = new MyBooksPage();
		 
		
		
		
	}
	
//	@AfterMethod
//	public void teardown()
//	{
//		driver.close();
//	}

}
